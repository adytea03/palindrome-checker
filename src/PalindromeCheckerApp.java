//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class PalindromeCheckerApp {
        public static void main(String[] args) {
                    String originalString = "refer";

                    // Create Deque
                    Deque<Character> deque = new ArrayDeque<>();

                    // Insert characters into deque
                    for (int i = 0; i < originalString.length(); i++) {
                        deque.addLast(originalString.charAt(i));
                    }

                    boolean isPalindrome = true;

                    // Compare first and last until deque is empty or has one element
                    while (deque.size() > 1) {
                        if (deque.removeFirst() != deque.removeLast()) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    // Print result
                    if (isPalindrome) {
                        System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
                    } else {
                        System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
                    }
                }
            }