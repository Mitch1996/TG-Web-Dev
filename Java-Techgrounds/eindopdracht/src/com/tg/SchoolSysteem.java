package com.tg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class SchoolSysteem extends JFrame {
    final JComboBox comboBox = new JComboBox(new Object[] { "", "Item #1", "Another item", "Something else" } );
    public static final Font MY_FONT = new Font(Font.DIALOG, Font.BOLD, 24);
    JMenu student, teacher, klas, school;
    JMenuBar menuBar;
    JTextArea textArea;
    JMenuItem lessen, curicilum, newstudent, addStudent;

    JTextField naam = new JTextField();
    JTextField achternaam = new JTextField();
    JTextField geboorteDatum = new JTextField();
    JTextField nationaliteit = new JTextField();
    JTextArea area = new JTextArea(10, 20);
    Object[] message = {
            "Student Naam:", naam,
            "GeboorteDatum:", geboorteDatum,
            "Nationaliteit:", nationaliteit
    };

    public SchoolSysteem() {
        super("SchoolSysteem");
        setSize(700, 600);
        menuBar = new JMenuBar();
        student = new JMenu("Student");
        teacher = new JMenu("Teacher");
        klas = new JMenu("Klas");
        school = new JMenu("School");
        menuBar.add(student);
        menuBar.add(teacher);
        menuBar.add(klas);
        menuBar.add(school);
        lessen = new JMenuItem("Lessen");
        curicilum = new JMenuItem("Curicilum");
        newstudent = new JMenuItem("Add student");
        addStudent = new JMenuItem("Add student to school");
        newstudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null, message, "Add", JOptionPane.OK_CANCEL_OPTION);
                if(option == JOptionPane.OK_OPTION) {
                    Student.setName(naam.getText());
                    LocalDate db = LocalDate.parse(geboorteDatum.getText());
                    Student.setDateOfBirth(db);
                    Student.setNationality(nationaliteit.getText());
                    area.append(Student.getName() + " , " + Student.getDateOfBirth() + " , " + Student.getNationality() + "\n");
                }
            }
        });
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        student.add(lessen);
        student.add(curicilum);
        student.add(newstudent);
        school.add(addStudent);
        this.add(menuBar);
        this.add(area);
        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SchoolSysteem().setVisible(true);
        });
    }

}
