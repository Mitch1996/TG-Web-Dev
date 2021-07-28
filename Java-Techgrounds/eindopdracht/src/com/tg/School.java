package com.tg;

import java.time.LocalDate;
import java.util.ArrayList;

public class School extends User {

    private static ArrayList<Teacher> listOfTeachers;
    private static ArrayList<Student> listOfStudents;
    private ArrayList<Klas> listOfKlasses;
    private String schoolType;
    private static ArrayList<String> curriculum;

    public School(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    public static void addStudent(String name, String nationality, LocalDate birth) {
        listOfStudents.add(new Student(name, nationality, birth));
    }

    public static void addTeacher(String name, LocalDate birth, Klas klas) {
        listOfTeachers.add(new Teacher(name, birth, curriculum, new Klas()));
    }

    public ArrayList<Klas> getListOfKlasses() {
        return listOfKlasses;
    }

    public void setListOfKlasses(ArrayList<Klas> listOfKlasses) {
        this.listOfKlasses = listOfKlasses;
    }

    public ArrayList<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

    public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
        School.listOfTeachers = listOfTeachers;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        School.listOfStudents = listOfStudents;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        School.curriculum = curriculum;
    }
}
