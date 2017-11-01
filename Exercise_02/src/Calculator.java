/*
Exercise 2 : Calculator

Simple Java program to practice input, output and if/else statements

Copyright (C) RedFantom 2017
*/
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float param;
        char operation;
        float total = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Command (+/-/*/:/q): ");
            operation = input.next().charAt(0);
            if (operation == 'q') break;
            else if (operation != '+' && operation != '-' && operation != '*' && operation != ':' && operation != '/') {
                System.out.println("Unknown command: " + operation);
            }
            System.out.println("Value: ");
            param = input.nextFloat();
            if (operation == '+') {
                total += param;
            } else if (operation == '-') {
                total -= param;
            } else if (operation == '*') {
                total *= param;
            } else if (operation == ':' || operation == '/') {
                total /= param;
            }
            System.out.println("Total: " + total);
        }
        System.exit(0);
    }
}
