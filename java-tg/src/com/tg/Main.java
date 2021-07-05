package com.tg;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void arrayVraag() {
        String[] auto = {"Kia", "BMW", "Renault", "Volkswagen"};
        auto = Arrays.copyOf(auto, auto.length + 1);
        auto[auto.length - 1] = "";
        auto[4] = "autotest";
        for (int i = 0;  i < auto.length; i++) {
            if(i <= 2) {
                System.out.println(auto[i].toString());
            } else {
                return;
            }
        }
        for (String i : auto) {
            System.out.println(i);
        }
        System.out.println(auto[0].toString());
        System.out.println(Arrays.toString(auto));
    }

    public static void arrayListVraag() {
        ArrayList<String> cars = new ArrayList<>(); // TODO : Vraag jens
        cars.add("Kida");
        cars.add("BMW");
        cars.set(0, "kia");
        System.out.println(cars);
    }

    public static void compareArray() {
        String[] eastcars = {"Kia" , "Honda"};
        String[] cars = {"Kia", "BMW", "Renault", "Volkswagen", "Honda"};
        ArrayList<String> westcars = new ArrayList<>();
        for (String car : cars) {
            if (!Arrays.toString(eastcars).contains(car)) {
                Arrays.sort(eastcars);
                westcars.add(car);
                Collections.sort(westcars);
            }
        }
        System.out.println(westcars);
    }


    public static void bonusScanner() throws ParseException {
        int years = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jou naam : " );
        String naam = scanner.next();
        System.out.print("GeboorteDatum : " );
        String dateString = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat.parse(dateString);
        years = new Date().getYear() - date.getYear();
        System.out.println(naam + " " + "Jij bent " + years + " jaar oud");
    }

    public static void main(String[] args) throws ParseException {
        bonusScanner();
    }
}

