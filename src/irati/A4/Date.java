package irati.A4;

public class Date {
    int day;
    String month;
    int year;

    public Date(int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate(){
        String date_day;
        if (this.day == 1){
            date_day = "st";
        }
        else if (this.day == 2){
            date_day = "nd";
        }
        else if (this.day == 3){
            date_day = "rd";
        }
        else{
            date_day = "th";
        }
        System.out.println("Date is " + this.day + date_day + " of " + this.month + " " + this.year + ".");
    }


    public static void main(String[] args) {
        Date date1 = new Date(4, "February", 1989);
        /*Time time2 = new Time(03, 44, 30);
        Time time3 = new Time(23, 56, 00);
        Time time4 = new Time(12, 07, 13);*/
        Date[] dates = new Date[] {
                date1
        };

        for (Date i : dates){
            i.printDate();
        }
    }
}