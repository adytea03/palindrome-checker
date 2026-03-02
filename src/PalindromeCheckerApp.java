//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {
        public static void main(String[] args) {

            String originalString = "madam";

            boolean isPalindrome = checkPalindrome(originalString, 0, originalString.length() - 1);

            if (isPalindrome) {
                System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
            } else {
                System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
            }
        }

        // Recursive method
        public static boolean checkPalindrome(String str, int start, int end) {

            // Base Condition: If pointers cross or meet
            if (start >= end) {
                return true;
            }

            // If characters do not match
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            // Recursive call for smaller substring
            return checkPalindrome(str, start + 1, end - 1);
        }
    }