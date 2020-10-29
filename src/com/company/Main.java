package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20.00;
	    double secondDouble = 80.00;
        double stepThree = (firstDouble + secondDouble) * 10;

        double stepFour = stepThree % 40.00;
        boolean stepFive = stepFour == 0 ? true : false;

        System.out.println(stepFive);

        if (!stepFive) {
            System.out.println("Got some remainder");
        }
    }
}
