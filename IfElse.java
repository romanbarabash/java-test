package com.practise.lesson5;

import java.util.Scanner;

/**
 * Created by romabarabash on 25.02.16.
 */
public class IfElse {


    public static void main(String[] args) {

        /*


        //ex.1
        double arr11 = 6.9;
        double b = 13;
        int c = 10;
        double d = Math.abs(c - arr11);
        double e = Math.abs(c - b);

        if (d > e) {
            System.out.println("Number" + b + "is closer to 10");

        } else {
            System.out.println("Number" + arr11 + "is closer to 10");
        }


        //ex.2
        int n = 13;
        int zero = 0;

        int divNto2 = n % 2;

        if (divNto2 == zero) {
            System.out.println("Number is odd");

        } else {
            System.out.println("Number is even");
        }


        //ex.3
        char ans = 'y';

        switch (ans) {
            case 'y':
            case 'Y':
                System.out.println("Program is executed");
                break;
            case 'n':
            case 'N':
                System.out.println("Program is stopped");
                break;
            default:
                System.out.println("Input was incorrect");
        }


        //ex.4
        int randomN = (int) (Math.random() * 151 + 5);

        if (randomN < 100 && randomN > 25) {
            System.out.println("randomN (" + randomN + ") value matches (25;100) interval: ");
        } else {
            System.out.println("randomN (" + randomN + ") value does not match (25;100) interval: ");
        }


        //ex.5
        int arr11 = ((int) (Math.random() * 9 + 1));
        int b = ((int) (Math.random() * 10));
        int c = ((int) (Math.random() * 10));

        if (arr11 >= b && arr11 >= c) {
            System.out.println("MAX value of " + arr11 + b + c + " is: " + arr11);
        } else if (b >= arr11 && b >= c) {
            System.out.println("MAX value of " + arr11 + b + c + " is: " + b);
        } else if (c >= arr11 && c >= b) {
            System.out.println("MAX value of " + arr11 + b + c + " is: " + c);
        }


        //ex.6
        int arr11 = ((int) (Math.random() * 28801));

        if (arr11 == 28800) {
            System.out.println("минута " + arr11 + " Осталось 8 часов");
        } else if (arr11 < 28800 && arr11 > 25200) {
            System.out.println("минута " + arr11 + " Осталось 7 часов");
        } else if (arr11 <= 25200 && arr11 >= 21000) {
            System.out.println("минута " + arr11 + " Осталось 6 часов");
        } else if (arr11 <= 21000 && arr11 >= 17400) {
            System.out.println("минута " + arr11 + " Осталось 5 часов");
        } else if (arr11 <= 17400 && arr11 >= 13800) {
            System.out.println("минута " + arr11 + " Осталось 4 часов");
        } else if (arr11 <= 13800 && arr11 >= 10200) {
            System.out.println("минута " + arr11 + " Осталось 3 часов");
        } else if (arr11 <= 10200 && arr11 >= 6600) {
            System.out.println("минута " + arr11 + " Осталось 2 часов");
        } else if (arr11 <= 6600 && arr11 >= 3000) {
            System.out.println("минута " + arr11 + " Осталось 1 часов");
        } else if (arr11 < 3000) {
            System.out.println("минута " + arr11 + " Осталось менее часа");
        }


        //ex.7
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter int number");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println(i * 2);
        } else {
            System.out.println("not int number is entered");
        }

        */
    }
}