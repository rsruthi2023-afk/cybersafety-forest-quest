// TempleSecurityPuzzleChallenge.java

package com.cybersafety.forest.challenges;

import java.util.Scanner;

public class TempleSecurityPuzzleChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temple Security Puzzle Challenge!");
        System.out.println("Your mission is to navigate through the temple security system.");

        String securityCode = "MysteryCode123"; // Example code for the challenge

        System.out.println("To proceed, you need to guess the correct security code.");
        System.out.print("Enter the security code: ");
        String userInput = scanner.nextLine();

        if (userInput.equals(securityCode)) {
            System.out.println("Access Granted! You may proceed.");
        } else {
            System.out.println("Access Denied! Try again.");
        }

        System.out.println("Remember: never share your passwords or sensitive information!");
        scanner.close();
    }
}