//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {
        public static void main(String[] args) {

            String originalString = "A man a plan a canal Panama";

            // Step 1: Normalize string (remove spaces, convert to lowercase)
            String normalizedString = originalString.replaceAll("\\s+", "").toLowerCase();

            // Step 2: Check palindrome using simple reverse logic
            String reversedString = "";
            for (int i = normalizedString.length() - 1; i >= 0; i--) {
                reversedString += normalizedString.charAt(i);
            }

            // Step 3: Compare normalized string and reversed string
            if (normalizedString.equals(reversedString)) {
                System.out.println("The given string \"" + originalString + "\" is a Palindrome (ignoring spaces and case).");
            } else {
                System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
            }
        }
    }