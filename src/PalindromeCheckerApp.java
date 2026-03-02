//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {
        public static void main(String[] args) {

            // Test string
            String testString = "racecar";

            // Create PalindromeChecker object
            PalindromeChecker checker = new PalindromeChecker();

            // Check palindrome
            boolean result = checker.checkPalindrome(testString);

            // Print result
            if (result) {
                System.out.println("The string \"" + testString + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + testString + "\" is NOT a Palindrome.");
            }
        }
    }

    // Encapsulated PalindromeChecker class
    class PalindromeChecker {

        // Method to check palindrome using simple reverse logic
        public boolean checkPalindrome(String str) {

            if (str == null || str.length() <= 1) {
                return true;
            }

            String reversed = "";

            // Build reversed string
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            // Compare original and reversed
            return str.equals(reversed);
        }
    }