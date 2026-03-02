//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String var2 = var1.nextLine();
        if (isPalindrome(var2)) {
            System.out.println(var2 + " is a palindrome.");
        } else {
            System.out.println(var2 + " is not a palindrome.");
        }

        var1.close();
    }

    public static boolean isPalindrome(String var0) {
        int var1 = 0;

        for(int var2 = var0.length() - 1; var1 < var2; --var2) {
            if (var0.charAt(var1) != var0.charAt(var2)) {
                return false;
            }

            ++var1;
        }

        return true;
    }
}