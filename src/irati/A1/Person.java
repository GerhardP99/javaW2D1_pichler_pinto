package irati.A1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Person{
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Irati", "Larreina");
        Person person2 = new Person("John", "Doe");
        Person person3 = new Person("Piñata", "Banana");
        Person person4 = new Person("Max", "FTW");
        Person person5 = new Person("Hello", "World");
        person1.getFullName();
        person2.getFullName();
        person3.getFullName();
        person4.getFullName();
        person5.getFullName();

        String[] headings = new String[] {"First Name", "Last Name"};
        Object[][] data = new Object[][] {{person1.firstName, person1.lastName},{person2.firstName, person2.lastName},{person3.firstName, person3.lastName},{person4.firstName, person4.lastName},{person5.firstName, person5.lastName}};

        JTable table = new JTable(data, headings);
        JFrame frame = new JFrame("table");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
