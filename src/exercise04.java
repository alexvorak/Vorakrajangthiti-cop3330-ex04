/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */
import java.util.Scanner;

public class exercise04 {

    public static void main(String[] args) {
        System.out.printf("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.printf("Enter a verb: ");
        Scanner scanner1 = new Scanner(System.in);
        String verb = scanner1.nextLine();
        System.out.printf("Enter an adjective: ");
        Scanner scanner2 = new Scanner(System.in);
        String adjective = scanner2.nextLine();
        System.out.printf("Enter an adverb: ");
        Scanner scanner3 = new Scanner(System.in);
        String adverb = scanner3.nextLine();
        System.out.printf("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}