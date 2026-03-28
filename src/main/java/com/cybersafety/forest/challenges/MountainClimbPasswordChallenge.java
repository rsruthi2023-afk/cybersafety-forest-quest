// MountainClimbPasswordChallenge.java

package com.cybersafety.forest.challenges;

import java.util.Scanner;

public class MountainClimbPasswordChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isPasswordValid = false;

        while (!isPasswordValid) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            isPasswordValid = isPasswordSecure(password);
            if (!isPasswordValid) {
                System.out.println("Password is not secure enough. Please try again.");
            } else {
                System.out.println("Password is secure!");
            }
        }
        scanner.close();
    }

    private static boolean isPasswordSecure(String password) {
        // Password strength conditions
        return password.length() >= 8 &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()_+\-=\\{};':\\\"\\[\\]<>?,./].*");
    }
}