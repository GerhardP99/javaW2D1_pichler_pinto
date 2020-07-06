package irati.A2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Person2{
    String firstName;
    String lastName;

    public Person2(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName(){

        System.out.println(this.firstName + " " + this.lastName.toUpperCase());
    }

    public static void main(String[] args) {
        Person2 person1 = new Person2("Irati", "Larreina");
        Person2 person2 = new Person2("John", "Doe");
        Person2 person3 = new Person2("Piñata", "Banana");
        Person2 person4 = new Person2("Max", "FTW");
        Person2 person5 = new Person2("Hello", "World");
        person1.getFullName();
        person2.getFullName();
        person3.getFullName();
        person4.getFullName();
        person5.getFullName();

        String[] headings = new String[] {"First Name", "Last Name"};
        Object[][] data = new Object[][] {{person1.firstName, person1.lastName.toUpperCase()},{person2.firstName, person2.lastName.toUpperCase()},{person3.firstName, person3.lastName.toUpperCase()},{person4.firstName, person4.lastName.toUpperCase()},{person5.firstName, person5.lastName.toUpperCase()}};

        JTable table = new JTable(data, headings);
        JFrame frame = new JFrame("table");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}