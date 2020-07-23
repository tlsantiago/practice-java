package com.company;

public class Main {

    public static void main(String[] args) {

        // ----------------Integers---------------- //

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);

        // ----------------Byte---------------- //

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);

        // ----------------Short---------------- //

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);

        // ----------------Long---------------- //

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_648_234L;
        System.out.println(bigLongLiteralValue);

        // ----------------Challenge 1---------------- //

        byte myByteVar = 10;
        short myShortVar = 20;
        int myIntVar = 50;
        long myLongVar = 50000 + (10 * (myByteVar + myShortVar + myIntVar));

        System.out.println(myLongVar);euaeh
                
    }
}
