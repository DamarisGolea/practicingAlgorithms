package org.fasttrackit.sortingrecords;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        simpleMath.calculate();
    }
    private void calculate (){
        System.out.println("Please enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNr = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int secNr = scanner.nextInt();

        int sum = firstNr + secNr;
        int difference = firstNr - secNr;
        int product = firstNr * secNr;
        double quotient = firstNr/secNr;

        System.out.print("What is the first number? " + firstNr + "\n" +
                "What is the second number? " + secNr + "\n" +
                firstNr + " + " + secNr + " = " + sum + "\n" +
                firstNr + " - " + secNr + " = " + difference + "\n" +
                firstNr + " * " + secNr + " = " + product + "\n" +
                firstNr + " / " + secNr + " = " + quotient);
    }
}
