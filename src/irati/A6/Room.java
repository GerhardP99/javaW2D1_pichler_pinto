/*package irati.A6;

import javax.swing.*;

public class Room {
    int nBeds;
    int price;
    int num;
    Class[][] booked;
    public Room(int num, int nBeds, Class[][] booked){
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

    public void isBooked(){
        System.out.println(this.booked[0][1]);
        /*if (this.booked[0][1]) {
            System.out.println("Sorry but this room is booked");
        }
        else {
            System.out.println("This room is available!");
        }
    }
    public static void main(String[] args) {
        Object[][] dates = new Object{{"07.07.2020", "true"}, {"08.07.2020", "false"}};
        Room room1 = new Room(102, 1, dates);
        /*Room room2 = new Room(203, 2, false);
        Room room3 = new Room(108, 3, true);
        Room room4 = new Room(401, 4, true);
        Room room5 = new Room(502, 2, false);

        String[] headings = new String[] {"Room Number", "Number of Beds", "Price", "Booked?"};
        Object[][] rooms = new Object[][] {{room1.num,room1.nBeds, room1.getPrice(), room1.booked[0]}};
        /*,{room2.num, room2.nBeds, room2.getPrice(), room2.booked},{room3.num, room3.nBeds, room3.getPrice(), room3.booked},{room4.num, room4.nBeds, room4.getPrice(), room4.booked},{room5.num, room5.nBeds, room5.getPrice(), room5.booked},
        };

        JTable table = new JTable(rooms, headings);
        JFrame frame = new JFrame("table");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(500, 200);
        frame.setVisible(true);

        room1.isBooked();
        //room2.isBooked();
    }
}
*/