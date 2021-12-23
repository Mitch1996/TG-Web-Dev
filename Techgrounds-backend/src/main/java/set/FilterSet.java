import java.util.HashSet;
import java.util.Set;

public class FilterSet {

    public static void main(String[] a) {
        Set<Price> hashSet = new HashSet<>();
        hashSet.add(new Price("Banana", 20));
        hashSet.add(new Price("Apple", 40));
        hashSet.add(new Price("Apples", 40));
        hashSet.add(new Price("Orange", 30));

        for (Price pr : hashSet) {
            if(pr.getItem().contains("App")) {
                System.out.println(pr);
            }
        }

        //Short way
        hashSet.stream().filter(price -> price.getItem().contains("App")).forEach(System.out::println);

        Price key = new Price("Banana", 20);
        System.out.println("Does set contains key? " + hashSet.contains(key));
    }
}