package com.tg;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends User{

    private static ArrayList<String> curriculum;
    private static Klas mentor;

    public Teacher(String name, LocalDate dateOfBirth, ArrayList<String> curriculum) {
        super(name, dateOfBirth);
        Teacher.curriculum = curriculum;
    }

    public Teacher(String name, LocalDate dateOfBirth, ArrayList<String> curriculum, Klas mentor) {
        super(name, dateOfBirth);
        Teacher.curriculum = curriculum;
        Teacher.mentor = mentor;
    }

    public static ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public static void setCurriculum(ArrayList<String> curriculum) {
        Teacher.curriculum = curriculum;
    }

    public static Klas getMentor() {
        return mentor;
    }

    public void setMentor(Klas mentor) {
        Teacher.mentor = mentor;
    }
}
