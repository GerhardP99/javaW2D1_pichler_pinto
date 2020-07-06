package irati.A6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Room {
    int nBeds;
    int price;
    int num;
    String[][] booked;
    public Room(int num, int nBeds, String[][] booked){
        this.nBeds = nBeds;
        this.num = num;
        this.booked = booked;

        if (nBeds == 1){
            this.price = 60;
        }
        else if (nBeds == 2){
            this.price = 80;
        }
        else if (nBeds == 3){
            this.price = 90;
        }
        else if (nBeds == 4){
            this.price = 90;
        }
    }

    public String getPrice(){
        return this.price + "€";
    }

    public void isBooked(String day){
        for (int i = 0; i<5; i++){
            if (day == this.booked[i][0]) {
                if (Boolean.parseBoolean(this.booked[i][1])) {
                    System.out.println("Sorry but this room is booked for the " + this.booked[i][0]);
                } else {
                    System.out.println("This room is available!");
                }
            }
        }
    }
    public static void main(String[] args) {
        String[][] dates1 = {{"07.07.2020", "true"}, {"08.07.2020", "false"}, {"09.07.2020", "true"}, {"10.07.2020", "true"}, {"11.07.2020", "false"}};
        String[][] dates2 = {{"07.07.2020", "false"}, {"08.07.2020", "false"}, {"09.07.2020", "false"}, {"10.07.2020", "true"}, {"11.07.2020", "true"}};
        String[][] dates3 = {{"07.07.2020", "true"}, {"08.07.2020", "true"}, {"09.07.2020", "true"}, {"10.07.2020", "true"}, {"11.07.2020", "false"}};
        String[][] dates4 = {{"07.07.2020", "false"}, {"08.07.2020", "false"}, {"09.07.2020", "true"}, {"10.07.2020", "false"}, {"11.07.2020", "false"}};
        String[][] dates5 = {{"07.07.2020", "true"}, {"08.07.2020", "false"}, {"09.07.2020", "false"}, {"10.07.2020", "true"}, {"11.07.2020", "false"}};

        Room room1 = new Room(102, 1, dates1);
        Room room2 = new Room(203, 2, dates2);
        Room room3 = new Room(108, 3, dates3);
        Room room4 = new Room(401, 4, dates4);
        Room room5 = new Room(502, 2, dates5);

        String[] headings = new String[] {"Room Number", "Number of Beds", "Price", "07.07.2020", "08.07.2020", "09.07.2020", "10.07.2020", "11.07.2020"};
        Object[][] rooms = new Object[][] {{room1.num,room1.nBeds, room1.getPrice(), room1.booked[0][1], room1.booked[1][1], room1.booked[2][1], room1.booked[3][1], room1.booked[4][1]},{room2.num, room2.nBeds, room2.getPrice(), room2.booked[0][1], room2.booked[1][1], room2.booked[2][1], room2.booked[3][1], room2.booked[4][1]},{room3.num, room3.nBeds, room3.getPrice(),room3.booked[0][1], room3.booked[1][1], room3.booked[2][1], room3.booked[3][1], room3.booked[4][1]},{room4.num, room4.nBeds, room4.getPrice(), room4.booked[0][1], room4.booked[1][1], room4.booked[2][1], room4.booked[3][1], room4.booked[4][1]},{room5.num, room5.nBeds, room5.getPrice(), room5.booked[0][1], room5.booked[1][1], room5.booked[2][1], room5.booked[3][1], room5.booked[4][1]},
        };

        JTable table = new JTable(rooms, headings);
        JFrame frame = new JFrame("table");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(1000, 200);
        frame.setVisible(true);

        room1.isBooked("08.07.2020");
    }
}
