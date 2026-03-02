//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {

        public static void main(String[] args) {

            // Original string
            String originalString = "radar";

            // Convert string to character array
            char[] charArray = originalString.toCharArray();

            // Two-pointer approach
            int start = 0;
            int end = charArray.length - 1;

            boolean isPalindrome = true;

            // Compare characters from start and end
            while (start < end) {
                if (charArray[start] != charArray[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Display result
            if (isPalindrome) {
                System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
            } else {
                System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
            }
        }
    }