package com.tg;

import com.tg.animals.Bird;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {

    public static ArrayList<Animal> animals = new ArrayList<Animal>();
    public static ArrayList<Bird> birds = new ArrayList<Bird>();
    public static ArrayList<Animal> moetGevoerd = new ArrayList<Animal>();

    public String name;
    public int leeftijd;
    public LocalDate geboorteDag;
    public LocalDate gevoerd;

    public Animal(String naam, int age, LocalDate birth, LocalDate lastFeed) {
        this.name = naam;
        this.leeftijd = age;
        this.geboorteDag = birth;
        this.gevoerd = lastFeed;
    }

    public void feed() { }

    public void jarig() {
        int sum = LocalDate.now().compareTo(this.geboorteDag);
        if (this.geboorteDag.getMonth() == LocalDate.now().getMonth() && this.geboorteDag.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
            System.out.println("Vogel " + this.name + " " + "is vandaag jarig en wordt" + " " + sum);
        }
    }

    public static void main(String[] args) {
        Bird bird1 = new Bird("Duif", 10, LocalDate.of(2011, 10, 5), LocalDate.of(2021, 7, 4));
        Bird bird2 = new Bird("Papagaai", 10, LocalDate.of(2011, 7, 6), LocalDate.of(2021, 7, 5));
        Bird bird3 = new Bird("Kanarie", 10, LocalDate.of(2011, 10, 5), LocalDate.of(2021, 7, 6));
        birds.add(bird1);birds.add(bird2);birds.add(bird3);
        animals.addAll(birds);
        Zoo.updateName(bird1 , "test");
        Zoo.show();
        for(Bird bird : birds) {
            bird.feed();
        }
        for(Animal animal : animals) {
            animal.jarig();
        }
    }
}
