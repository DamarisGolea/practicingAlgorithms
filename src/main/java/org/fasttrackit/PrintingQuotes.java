package org.fasttrackit;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        PrintingQuotes printingQuotes = new PrintingQuotes();
        printingQuotes.printQ();
    }
    private void printQ (){
        System.out.println("Please enter a quote.");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.println("Please enter the author of the quote.");
        String author = scanner.nextLine();
        System.out.println("What is the quote? " + quote);
        System.out.println("Who said it? " + author);
        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}
