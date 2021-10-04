/*
A string is a palindrome if it reads the same forward and backward. The words “mom,” “dad,” and “noon,” for instance, are all palindromes.
The problem is to write a program that prompts the user to enter a string and reports whether the string is a palindrome. 
One solution is to check whether the first character in the string is the same as the last character. 
If so, check whether the second character is the same as the second-to-last character. This process continues until a mismatch is found or 
all the characters in the string are checked, except for the middle character if the string has an odd number of characters.
 */

import java.util.Scanner;

public class CheckingPalindromes {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		// The index of the first character in the string
		int low = 0;

		// The index of the last character in the string
		int high = s.length() - 1;

		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}

		if (isPalindrome) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}
}

/*
 * The program uses two variables, low and high, to denote the position of the
 * two characters at the beginning and the end in a string s (lines 22, 25).
 * Initially, low is 0 and high is s. length() – 1. If the two characters at
 * these positions match, increment low by 1 and decrement high by 1 (lines
 * 33–34). This process continues until (low >= high) or a mismatch is found
 * (line 29). The program uses a boolean variable isPalindrome to denote whether
 * the string s is palindrome. Initially, it is set to true (line 27). When a
 * mismatch is discovered (line 29), isPalindrome is to false (line 30) and the
 * loop is terminated with a break statement (line 31).
 */
