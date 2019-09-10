package org.fasttrackit;

import java.util.Scanner;

public class Hello1 {
    public static void main(String[] args) {
        Hello1 greeting = new Hello1();
        greeting.giveName();
    }
    private void giveName (){
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
