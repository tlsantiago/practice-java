package com.company;

public class Main {

    public static void main(String[] args) {

            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
            System.out.println("Float minimum value = " + myMinFloatValue);
            System.out.println("Float maximum value = " + myMaxFloatValue);

            double myMinDoubleValue = Double.MIN_VALUE;
            double myMaxDoubleValue = Double.MAX_VALUE;
            System.out.println("Double minimum value = " + myMinDoubleValue);
            System.out.println("Float maximum value = " + myMaxDoubleValue);

            int myIntValue = 5;
            float myFloatValue = 5f;
            double myDoubleValue = 5d;

            System.out.println("MyIntValue = " + myIntValue);
            System.out.println("MyFloatValue = " + myFloatValue);
            System.out.println("MyDoubleValue = " + myDoubleValue);

            //----- Challenge ----- //

             double myPounds = 200;
             double myKilogram = myPounds * 0.45359237;

             System.out.println(myKilogram);

             double pi = 3.1415927d;
             double anotherNumber = 3_000_000.4_567_890d;
             System.out.println(pi);
             System.out.println(anotherNumber);
    }
    }
