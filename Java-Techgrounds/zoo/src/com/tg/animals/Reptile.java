package com.tg.animals;

import com.tg.Animal;

import java.time.LocalDate;
import java.util.Date;

public class Reptile extends Animal {

    public Reptile(String naam, int age, LocalDate birth, LocalDate lastFeed) {
        super(naam, age, birth, lastFeed);
    }
}
