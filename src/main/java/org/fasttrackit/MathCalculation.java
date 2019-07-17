package org.fasttrackit;

public class MathCalculation {

    public static void main(String[] args) {

        MathCalculation mathCalculation = new MathCalculation();

        // Calculating sum of two int numbers
        int intSum = mathCalculation.sum(4, 6);
        System.out.println("The result is: " + intSum);

        // Calculating sum of two double numbers
        int doubleSum = mathCalculation.sum(4.3, 2.8);
        System.out.println("The result of the new sum is: " + doubleSum);

        //Calculating div of two double numbers
        double doubleDiv = mathCalculation.div(23.3, 5.6);
        System.out.println("The result is: " + doubleDiv);

        //Calculating div of two int numbers
        double intDiv = mathCalculation.div(30, 6);
        System.out.println("The result is: " + intDiv);

        //Calculating modulo of two double numbers
        double doubleModulo = mathCalculation.modulo(4.4, 3.1);
        System.out.println("The result is: " + doubleModulo);

        //Calculating modulo of two int numbers
        double intModulo = mathCalculation.modulo(8, 3);
        System.out.println("The result is: " + intModulo);
    }

    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Calculating sum of: " + num1 + " + " + num2 + " .");
        return sum;
    }

    public int sum(double num1, double num2) {
        // return sum((int) num1, (int) num2); - but the result can be different
        double sum = num1 + num2;
        System.out.println("Calculating sum of: " + num1 + " + " + num2 + " .");
        return (int) sum;
    }

    public double div(double n1, double n2) {
        double div = n1 / n2;
        System.out.println("Calculating division of: " + n1 + " / " + n2 + " .");
        return div;
    }

    public double div(int n1, int n2) {
        int div = n1 / n2;
        System.out.println("Calculating division of: " + n1 + " / " + n2 + " .");
        return (double) div;
    }

    public double modulo(double a, double b) {
        System.out.println("Calculating modulo of: " + a + " % " + b + " .");
        return a % b;
    }

    public double modulo(int a, int b) {
        System.out.println("Calculating modulo of: " + a + " % " + b + " .");
        return (double) a % b;
    }
}


