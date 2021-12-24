package QaAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		/*
		 * Crteate a program checks if a String is PALINDROME or not. If a word, phrase,
		 * or sequence that reads the same backword as forward then it is called
		 * "palindrome", For Example : "madam" or "nurses run" .
		 * 
		 * 
		 * Kuulanıcının girdiği bir String'in PALINDROME olup olmadığını kontrol eden
		 * bir method create ediniz polindrome :tersten okunuşu da aynı olan
		 * ifadeierdir. ornek : Ey edip Adana`da pide ye, Traş niçin şart
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte schreibe einen Satz: ");

		String str = scan.nextLine();

		palindrome(str);
		scan.close();
	}

	private static void palindrome(String str) {

		StringBuilder str2 = new StringBuilder(str);

		String str3 = str2.reverse().toString();

		if (str3.equalsIgnoreCase(str)) {
			System.out.println("Der eingegebene Satz ist Palindrome.");
		} else {
			System.out.println("Der eingegebene Satz ist kein Palindrome.");
		}

	}

}
