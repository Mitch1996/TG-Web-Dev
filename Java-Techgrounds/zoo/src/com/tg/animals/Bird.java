package com.tg.animals;

import com.tg.Animal;

import java.time.LocalDate;
import java.util.Date;

public class Bird extends Animal {

    public Bird(String naam, int age, LocalDate birth, LocalDate lastFeed) {
        super(naam, age, birth, lastFeed);
    }

    @Override
    public void feed() {
        int last = this.gevoerd.compareTo(LocalDate.now());
        if(last == -2) {
            gevoerd = LocalDate.now();
            System.out.println("Vogel Gevoerd");
        }
    }
}
