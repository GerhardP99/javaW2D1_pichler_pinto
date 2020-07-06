package irati.A5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Book {
    String title;
    String author;
    String year;
    String genre;
    boolean rented;

    public Book(String title, String author, String year, String genre, boolean rented){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.rented = rented;

    }
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird",  "Harper Lee", "1960", "Southern Gothic, Bildungsroman", true);
        Book book2 = new Book("The Great Gatsby",  "F. Scott Fitzgerald", "1925", "Tragedy", false);
        Book book3 = new Book("One Hundred Years of Solitude",  "Gabriel García Márquez", "1967", "Magic realism", true);
        Book book4 = new Book("Don Quixote",  "Miguel de Cervantes", "1615", "Novel", true);
        Book book5 = new Book("Invisible Man",  "Ralph Ellison", "1952", "BildungsromanAfrican-American literaturesocial commentary", false);

        String[] headings = new String[] {"Book title", "Author", "Year", "Genre", "Rented"};
        Object[][] data = new Object[][] {{book1.title, book1.author, book1.year, book1.genre, book1.rented},{book2.title, book2.author, book2.year, book2.genre, book2.rented},{book3.title, book3.author, book3.year, book3.genre, book3.rented},{book4.title, book4.author, book4.year, book4.genre, book4.rented},{book5.title, book5.author, book5.year, book5.genre, book5.rented},
        };

        JTable table = new JTable(data, headings);
        JFrame frame = new JFrame("table");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(1000, 200);
        frame.setVisible(true);
    }

}
