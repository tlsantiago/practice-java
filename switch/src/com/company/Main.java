package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or a 5");
                System.out.println("Actualy it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        //----------Challenge----------//

        char myVar = 'G';

        switch (myVar) {

            case 'A': case 'B': case'C': case'D': case'E':
                System.out.println("Value was found. It was " + myVar + '.');
                break;

            default:
                System.out.println("Value not found. It wasn't either A, B," +
                        " C, D or E");
                break;

        }
    }
}
