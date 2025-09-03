package com.tcf.basicjava;

public class ControlStatementsDemo {

    public static void main(String[] args) {

        // 1. if, if-else, if-else-if
        int number = 10;
        int a;
        int b;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // 2. switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // 3. for loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip 3
            }
            System.out.println("i = " + i);
        }

        // 4. while loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // 5. do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 5;
        do {
            System.out.println("k = " + k);
            k--;
        } while (k > 0);

        // 6. break statement
        System.out.println("\nBreak Statement in loop:");
        for (int x = 1; x <= 5; x++) {
            if (x == 4) {
                break; // stop loop when x is 4
            }
            System.out.println("x = " + x);
        }

        // 7. return statement
        System.out.println("\nCalling checkEvenOrOdd function:");
        checkEvenOrOdd(7);
    }

    // Function demonstrating return
    public static void checkEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
            return;
        }
        System.out.println(n + " is Odd");
    }
}