//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String testString = "level".replaceAll("\\s+", "").toLowerCase();

        System.out.println("Testing string: " + testString + "\n");

        // 1️⃣ Loop + String Reverse
        long startTime = System.nanoTime();
        boolean result1 = loopReversePalindrome(testString);
        long endTime = System.nanoTime();
        System.out.println("Loop Reverse: " + result1 + " | Time(ns): " + (endTime - startTime));

        // 2️⃣ Stack-based
        startTime = System.nanoTime();
        boolean result2 = stackPalindrome(testString);
        endTime = System.nanoTime();
        System.out.println("Stack: " + result2 + " | Time(ns): " + (endTime - startTime));

        // 3️⃣ Deque-based
        startTime = System.nanoTime();
        boolean result3 = dequePalindrome(testString);
        endTime = System.nanoTime();
        System.out.println("Deque: " + result3 + " | Time(ns): " + (endTime - startTime));

        // 4️⃣ Recursive
        startTime = System.nanoTime();
        boolean result4 = recursivePalindrome(testString, 0, testString.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive: " + result4 + " | Time(ns): " + (endTime - startTime));
    }

    // Loop + Reverse
    public static boolean loopReversePalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // Stack-based
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) stack.push(str.charAt(i));
        for (int i = 0; i < str.length(); i++) if (str.charAt(i) != stack.pop()) return false;
        return true;
    }

    // Deque-based
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) deque.addLast(str.charAt(i));
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    // Recursive
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }
}