import java.util.*;

public class PhoneBook {

   // Map<String, List<String>> map = new HashMap<String, List<String>>();

    private Map<String, List<String>> phoneRecord;

    public PhoneBook() {
        phoneRecord = new TreeMap<>();
    }

    public Boolean addNameAndNumber(String name, String number) {
        if (phoneRecord.containsKey(name)) {
            phoneRecord.get(name).add(number);
            return true;
        }
        List<String> newNumber = new ArrayList<String>();
        newNumber.add(number);
        phoneRecord.put(name, newNumber);
        return true;
    }


    public boolean deleteNameAndNumber(String name) {
        return phoneRecord.remove(name) != null;
    }


    public String retrieveNumbersByName(String name) {
        return join(phoneRecord.get(name));
    }

    public String retrieveNameByNumber(String number) {
        for (String nameKey : phoneRecord.keySet()) {
            List<String> numForName = phoneRecord.get(nameKey);
            if(numForName.contains(number)){
                return nameKey;
            }
        }
        return "";
    }

    public String listAllNames() {
        StringBuilder list = new StringBuilder();
        Formatter prettyListNames = new Formatter(list);
        for (String nameKey : phoneRecord.keySet()) {
            prettyListNames.format("Name: %s%n", nameKey);
        }
        return list.toString();
    }

    public String listAllNamesAndNumbers() {
        StringBuilder list = new StringBuilder();
        Formatter prettyList = new Formatter(list);
        for (String nameKey : phoneRecord.keySet()) {
            prettyList.format("Name: %s PhoneNumber: %-10s%n", nameKey, join(phoneRecord.get(nameKey)));
        }
        return list.toString();
    }

    public static String join(List<String> listNum){

        if(listNum.size() == 1){
            return listNum.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < listNum.size(); i++) {
            sb.append(listNum.get(i));
            if (i < listNum.size()-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        PhoneBook techgrounds = new PhoneBook();
        techgrounds.addNameAndNumber("test1", "7173419899");
        techgrounds.addNameAndNumber("test2", "7173413244");
        techgrounds.addNameAndNumber("test3", "7173419675");
        techgrounds.addNameAndNumber("test4", "555");
        techgrounds.addNameAndNumber("Wally", "8906786");
        techgrounds.addNameAndNumber("Wally", "3456789");
        techgrounds.addNameAndNumber("Wally", "89665");


        String x = techgrounds.listAllNamesAndNumbers();
        System.out.println(x);

        String y = techgrounds.listAllNames();

        System.out.println(y);
    }
}
