package com.simple;
import java.util.Scanner;

public class simpleAdder {
    public static void main(String args[]) {

    int sum = 0;
    Scanner scan = new Scanner(System.in);
        int numbers[] = new int[10];


        for(int x = 0; x < 10; x++) {
        System.out.println("Please enter integer #" + (x+1));
            int input = 0;
            try {
                input = scan.nextInt();
            } catch (java.util.InputMismatchException exception) {
                System.out.println("Please enter only numeric values.");
                break;
            }

            if (input < 0) {
        continue;
    }
    if(input == 0) {
        break;
    }


    sum += input;
            numbers[x] = input;




        }
System.out.println("The sum is " + sum);
        System.out.println("The numbers you entered were: ");
        for(int eachNumber : numbers) {
            System.out.println(eachNumber);
        }



        scan.close();
}}
