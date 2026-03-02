//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

public class PalindromeCheckerApp implements PalindromeStrategy  {
        @Override
        public boolean isPalindrome(String str) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }

    // Deque-based strategy
    class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean isPalindrome(String str) {
            Deque<Character> deque = new ArrayDeque<>();
            for (int i = 0; i < str.length(); i++) {
                deque.addLast(str.charAt(i));
            }
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }
            return true;
        }
    }

    // Context class
    class PalindromeChecker {

        private PalindromeStrategy strategy;

        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String str) {
            return strategy.isPalindrome(str);
        }
    }

    // Client
    class usecase1212PalindromeCheckerApp {

        public static void main(String[] args) {

            String testString = "level";

            // Use Stack strategy
            PalindromeChecker checker = new PalindromeChecker(new StackStrategy());
            System.out.println("Using StackStrategy: " + testString + " -> " + checker.check(testString));

            // Switch to Deque strategy
            checker.setStrategy(new DequeStrategy());
            System.out.println("Using DequeStrategy: " + testString + " -> " + checker.check(testString));
        }
    }