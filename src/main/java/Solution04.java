/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 4
 *  Copyright 2021 Matthew  Trump
 *
 *  This program will print a line asking for a noun, verb, adjective, and adverb
 *  Then it will take input from the user and assign each input a string
 *  Next, the program will combine all of the inputs into one funny sentence
 *  Finally, it will display the mad lib for the user to enjoy
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = input.nextLine();
        System.out.println("Enter a verb: ");
        String verb = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj = input.nextLine();
        System.out.println("Enter an adverb: ");
        String adv = input.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");

    }
}
