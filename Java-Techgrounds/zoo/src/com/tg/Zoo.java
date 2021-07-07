package com.tg;

import java.time.LocalDate;

public class Zoo extends Animal {

    public Zoo(String naam, int age, LocalDate birth, LocalDate lastFeed) {
        super(naam, age, birth, lastFeed);
    }

    public static void show() {
        for(Animal animal : animals) {
            System.out.println("Naam: " + animal.name + " , leeftijd: " + animal.leeftijd);
        }
    }

    public static void updateName(Animal animal, String newname) { animal.name = newname; }
    public static void updateLeeftijd(Animal animal, int newleeftijd) { animal.leeftijd = newleeftijd; }
    public static void updateGeboorteDag(Animal animal, LocalDate newGeboortedag) { animal.geboorteDag = newGeboortedag; }
    public static void updateGevoerd(Animal animal, LocalDate newGevoerd) { animal.gevoerd = newGevoerd; }
    public static void updateAll(Animal old , Animal animal) {
        Animal current = new Animal(animal.name, animal.leeftijd, animal.geboorteDag, animal.gevoerd);
        add(current);
        delete(old);
    }

    public static void add(Animal animal) {
        animals.add(animal);
    }

    public static void delete(Animal animal) {
        animals.remove(animal);
    }
}
