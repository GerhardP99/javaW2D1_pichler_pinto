package irati.A4;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void printTime(){
        System.out.println("Time is " + this.hour + " hours, " + this.minute + " minutes and " + this.second + " seconds.");
    }

    public void addSeconds(int seconds){

        int hours = seconds/3600;
        int minutes = (seconds - hours*3600)/60;
        int rem_seconds = seconds - hours*3600 - minutes*60;
        this.second += rem_seconds;
        if (this.second > 59){
            this.second -= 60;
            this.minute++;
        }
        this.minute += minutes;
        if (this.minute > 59){
            this.minute -= 60;
            this.hour++;
        }
        this.hour += hours;
        System.out.println("Time is " + this.hour + " hours, " + this.minute + " minutes and " + this.second + " seconds.");
    }

    public void addTime(int hours, int minutes, int seconds){

        this.second += seconds;
        if (this.second > 59){
            this.second -= 60;
            this.minute++;
        }
        this.minute += minutes;
        if (this.minute > 59){
            this.minute -= 60;
            this.hour++;
        }
        this.hour += hours;
        System.out.println("Time is " + this.hour + " hours, " + this.minute + " minutes and " + this.second + " seconds.");
    }

    public static void main(String[] args) {
        Time time1 = new Time(17, 30, 10);
        Time time2 = new Time(03, 44, 30);
        Time time3 = new Time(23, 56, 00);
        Time time4 = new Time(12, 07, 13);
        Time[] times = new Time[] {
                time1, time2, time3, time4
        };

        for (Time i : times){
            i.printTime();
        }


        time1.addTime(1,20,50);
        time1.addSeconds(3701);

    }
}
