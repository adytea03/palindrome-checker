//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {
        public static void main(String[] args) {
                    String originalString = "civic";

                    // Create Stack (LIFO)
                    Stack<Character> stack = new Stack<>();

                    // Create Queue (FIFO)
                    Queue<Character> queue = new LinkedList<>();

                    // Enqueue and Push characters
                    for (int i = 0; i < originalString.length(); i++) {
                        char ch = originalString.charAt(i);
                        stack.push(ch);     // LIFO
                        queue.add(ch);      // FIFO
                    }

                    boolean isPalindrome = true;

                    // Compare dequeue (queue) with pop (stack)
                    for (int i = 0; i < originalString.length(); i++) {
                        if (queue.remove() != stack.pop()) {
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