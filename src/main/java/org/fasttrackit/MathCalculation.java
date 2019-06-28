package org.fasttrackit;

public class MathCalculation {

    public static void main(String[] args) {
        MathCalculation sum = new MathCalculation();
        int calculatingSum = sum.calculatingSum(4, 6);
        System.out.println("The result is: " + calculatingSum);

        MathCalculation division = new MathCalculation();
        double calculatingDiv = division.calculatingDiv(23,6);
        System.out.println("The result is: " + calculatingDiv);

        MathCalculation modulo = new MathCalculation();
        double calculatingModulo = modulo.calculatingModulo(4, 3);
        System.out.println("The result is: " + calculatingModulo);
    }

    public int calculatingSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Calculating sum of: " + num1 + " + " + num2 + " .");
        return sum;
    }

    public double calculatingDiv(double n1, double n2){
        System.out.println("Calculating division of: " + n1 + " / " + n2 + " .");
        return n1 / n2;
    }

    public double calculatingModulo(double a, double b){
        System.out.println("Calculating modulo of: " + a + " % " + b + " .");
        return a%b;
    }
}


