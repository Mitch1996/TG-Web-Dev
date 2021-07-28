package com.tg;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends User {

    private static String nationality;
    private ArrayList<ArrayList<String>> grades;
    private String profile;
    private ArrayList<LocalDate> dateAbsent;

    public Student(String name, String nationality, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        Student.nationality = nationality;
    }

    public static void main(String[] args) {
        School.addStudent("Mitch", "Nederlands", LocalDate.of(1996, 7 , 3));
        School.addTeacher("Henk", LocalDate.of(1996, 7 , 3), new Klas());
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Student.nationality = nationality;
    }

    public ArrayList<ArrayList<String>> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<ArrayList<String>> grades) {
        this.grades = grades;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public ArrayList<LocalDate> getDateAbsent() {
        return dateAbsent;
    }

    public void setDateAbsent(ArrayList<LocalDate> dateAbsent) {
        this.dateAbsent = dateAbsent;
    }
}
