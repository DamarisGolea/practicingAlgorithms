package org.fasttrackit.sortingrecords;

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalc {
    public static void main(String[] args) {
        RetirementCalc retirementCalc = new RetirementCalc();
        retirementCalc.calculate();
    }
    private void calculate (){
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        int currentAge = scanner.nextInt();
        System.out.println("At what age would you like to retire?");
        int ageOfRetirement = scanner.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeft = ageOfRetirement - currentAge;
        int yearOfRetirement = currentYear + yearsLeft;

        System.out.println("You have " + yearsLeft +" years left until you can retire.\n" +
                "It's " + currentYear + ", so you can retire in " + yearOfRetirement + ".");
    }
}
