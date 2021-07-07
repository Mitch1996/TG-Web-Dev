package com.tg.animals;

import com.tg.Animal;

import java.time.LocalDate;
import java.util.Date;

public class Cat extends Animal {

    public Cat(String naam, int age, LocalDate birth, LocalDate lastFeed) {
        super(naam, age, birth, lastFeed);
    }
}
