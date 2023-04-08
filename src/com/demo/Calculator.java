package com.demo;

public class Calculator {

    public static void main(String[] args) {

        add(10,20);
        sub(34.5,32.5);
    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }
    public static void sub(double a , double b){
        double sub = a - b;
        System.out.println("Subtract is : " + sub);
    }
}
