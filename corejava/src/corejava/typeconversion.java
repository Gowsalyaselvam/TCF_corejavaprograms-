package com.tcf.basicjava;

public class TypeCastingExample 
{
    public static void main(String[] args) 
    {
        // Implicit Casting (smaller to larger data type)
       int intVal = 100;
        double doubleVal = intVal;
        System.out.println("Implicit Casting int to double: " + doubleVal);

        // Explicit Casting (larger to smaller data type)
        double doubleValue = 99.99;
        int intValue = (int) doubleValue;
        System.out.println("Explicit Casting double to int: " + intValue);

        // Char to int and vice versa
        char letter = 'A';
        int ascii = letter;
        System.out.println("ASCII value of A: " + ascii);

        int num = 66;
        char character = (char) num;
        System.out.println("Character for ASCII 66: " + character);
    }
}