package org.fasttrackit;

import java.util.Scanner;

public class CountNrOfChar {
    public static void main(String[] args) {
    CountNrOfChar countNrOfChar = new CountNrOfChar();
    countNrOfChar.giveInputString();
    }
    private void giveInputString (){
        System.out.println("Please enter a word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("What is the input string? " + word);
        int count = 0;
        for (int i = 0; i< word.length(); i++){
            if(word.charAt(i) != ' ')
                count ++;
        }
        System.out.println(word + " has " + count + " characters.");
    }
}