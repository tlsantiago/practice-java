package com.company;

public class Main {

    public static void main(String[] args) {
	    double myValue = 20.00;
	    double mySecondValue = 80.00;
	    double myResult = (myValue + mySecondValue) * 100.00;

	    double myRemainder = myResult % 40.00;
        System.out.println(myRemainder);

        boolean isZero = (myRemainder == 0) ? true : false;

		System.out.println(isZero);

			if(!isZero) {
				System.out.println("Got some remainder");
			}

    }
}
