//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {
        public static void main(String[] args) {
                 String originalString = "noon";

                    // Use full package name instead of import
                    java.util.Stack<Character> stack = new java.util.Stack<>();

                    // Push characters into stack
                    for (int i = 0; i < originalString.length(); i++) {
                        stack.push(originalString.charAt(i));
                    }

                    boolean isPalindrome = true;

                    // Pop and compare
                    for (int i = 0; i < originalString.length(); i++) {
                        if (originalString.charAt(i) != stack.pop()) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    if (isPalindrome) {
                        System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
                    } else {
                        System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
                    }
                }
            }