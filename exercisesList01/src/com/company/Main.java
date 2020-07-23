package com.company;

public class Main {

    public static void main(String[] args) {
        toMilesPerHour(10);
        printConversion(20);
        printMegaBytesAndKiloBytes(5222);
    }

    //--------------- MegaBytes Converter -----------------//
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = 0;
        int remainingKb = 0;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value!");
        } else {
            megaBytes = kiloBytes / 1024;
            remainingKb = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " +
                    remainingKb + "KB");
        }
    }



    //--------------- Myles Converter -----------------//

    public static double toMilesPerHour (double kilometersPerHour) {
        double miles = 0;

        if(kilometersPerHour < 0) {
            return -1;
        } else {
            miles = Math.round(kilometersPerHour * 0.609d);
            System.out.println(kilometersPerHour + " converted to miles is " +
                    miles);
            return miles;
        }
    }

    public static void printConversion (double kilometersPerHour) {
        double milesPerHour = 0;

        if(kilometersPerHour < 0) {
            System.out.println("Invalid value!");
        } else {
            milesPerHour = kilometersPerHour * 1.609d;
            System.out.println(kilometersPerHour + " km/h = " +
                    milesPerHour + " mi/h");
        }
    }
}

