package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previusResult = " + previousResult);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previusResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result *= 10;
        System.out.println("1 * 10 = " + result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");

            // && = AND;
            // || = OR;
            // '=' declares, '==' compares (Like JavaScript);

            boolean isCar = false;

            boolean wasCar = isCar ? true : false;
        }
    }
}
