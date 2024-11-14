package Assignment_one;

import java.util.Scanner;

public class StringToPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String orgStr = sc.nextLine().toLowerCase().replaceAll("\\s+", ""); // Normalize input

        if (isPalindrome(orgStr)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return false;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
