package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        getDurationString(65, 45);
        getDurationString(6009);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59 ) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        } else {
            long hours = minutes / 60;
            minutes = minutes % 60;
            seconds = seconds % 60;
            System.out.println(hours + "h " + minutes + "m " + seconds +
                    "s");
            return hours + "h " + minutes + "m " + seconds +
                    "s";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
    }


}
