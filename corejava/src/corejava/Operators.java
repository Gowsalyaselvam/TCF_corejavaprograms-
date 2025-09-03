package com.tcf.basicjava;

public class OperatorsExample 
{
    public static void main(String[] args) 
    {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operator
        int c = a + b;
        System.out.println("Assigned value (c): " + c);

        // Increment & Decrement
        a++;
        b--;
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);
    }
}