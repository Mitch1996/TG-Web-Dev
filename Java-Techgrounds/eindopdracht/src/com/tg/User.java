package com.tg;

import java.time.LocalDate;

public class User {

    private static String name;
    private static LocalDate dateOfBirth;

    public User(String name, LocalDate dateOfBirth) {
        User.name = name;
        User.dateOfBirth = dateOfBirth;
    }

    public static String getName() {
        return name;
    }

    public static LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public static void setName(String name) {
        User.name = name;
    }

    public static void setDateOfBirth(LocalDate dateOfBirth) {
        User.dateOfBirth = dateOfBirth;
    }
}
