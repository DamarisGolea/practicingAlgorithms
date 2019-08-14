package org.fasttrackit;

public class LogicalOp {

    public static void main(String[] args) {

        LogicalOp firstNr = new LogicalOp();
        firstNr.verifyNumber(3);
        firstNr.verifyNegNumber(2);
        firstNr.verifyInBetween(5, 8);
        firstNr.verifyAndCount(8,3);
        firstNr.verifyEvenNumbers();
        firstNr.verifyOddNumbers();
        firstNr.verifySum(4);
        firstNr.verifyAverage(93);
        firstNr.displayPattern();
    }

    private void verifyNumber(int firstNumber) {
        System.out.println("Counting up to 100: ");
        for (int i = firstNumber; i <= 100; i++) {
            System.out.println(i);
        }
    }

    private void verifyNegNumber(int firstNumber) {
        System.out.println("Counting down to -100: ");
        for (int i = firstNumber; i >= -100; i--) {
            System.out.println(i);
        }
    }

    private void verifyInBetween(int firstNumber, int secondNumber) {
        System.out.println("Counting...");
        for (int i = firstNumber, x = secondNumber; i <= x; i++) {
            System.out.println(i);
        }
    }

    private void verifyAndCount(int firstNumber, int secondNumber){
        if (firstNumber == secondNumber){
            throw new IllegalArgumentException("The values should not be equal.");
        }
        System.out.println("Start analyzing " + firstNumber + " and " + secondNumber);
        int min = Math.min(firstNumber,secondNumber);
        int max = Math.max(firstNumber, secondNumber);

        for(int i= min; i<= max; i++){
            System.out.println(i);
        }
        System.out.println(" ");
    }


    private void verifyEvenNumbers(){
        int n = 100;
        System.out.print("Even Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    private void verifyOddNumbers () {
        int n = 100;
        System.out.print("Odd Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 != 0 it means its an odd number
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }

    private int verifySum (int n) {
        int sum= 0;
        System.out.println("The sum is: ");
        for (int i = n; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    private double verifyAverage (int n){
        double sum= 0;
        double average = 0;
        for (int i = n; i<=100; i++){
            sum += i;
        }
        System.out.println("Sum is: " + sum);
        average = sum/(101-n);
        System.out.println("Average is: " + average);
        return average;
    }

    private void displayPattern(){
        System.out.println("The pattern looks like: ");
        for (int i=1; i<=7; i++){
            System.out.println();
            System.out.println();
            for (int j=1; j<=8-i; j++){
                System.out.print("*");
            }
        }
    }
}