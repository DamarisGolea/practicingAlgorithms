package org.fasttrackit;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        MadLib madLib = new MadLib();
        madLib.playingML();
    }
    private void playingML (){
        System.out.println("Please enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.println("Please enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Please enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Please enter an adverb: ");
        String adverb = scanner.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
