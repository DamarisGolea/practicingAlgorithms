package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class AverageCalculator
{
    public void displayAverage(int num1, int num2, int num3) {
        System.out.println("Calculating average of: " + num1 + ", " + num2 + ", " + num3 + ". ");
        double average = (num1 + num2 + num3) / 3d;
        System.out.println("Average:" + average);
    }


    public static void main(String[] args) {

        AverageCalculator averageCalculator = new AverageCalculator();
        averageCalculator.displayAverage(19, 20, 98);
    }

}

