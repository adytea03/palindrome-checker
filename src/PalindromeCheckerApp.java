//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {
        static class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void main(String[] args) {

            String originalString = "level";

            // Convert string to linked list
            Node head = null;
            Node tail = null;

            for (int i = 0; i < originalString.length(); i++) {
                Node newNode = new Node(originalString.charAt(i));
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            // Check if palindrome
            boolean isPalindrome = isPalindrome(head);

            if (isPalindrome) {
                System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
            } else {
                System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
            }
        }

        // Method to check palindrome using Linked List
        public static boolean isPalindrome(Node head) {

            if (head == null || head.next == null) {
                return true;
            }

            // Step 1: Find middle using fast & slow pointers
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            Node secondHalf = reverse(slow);
            Node firstHalf = head;

            // Step 3: Compare both halves
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        // Method to reverse linked list
        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }
    }