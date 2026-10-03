package com.shrishti.dsa;

import java.util.Arrays;
import java.util.List;

import com.shrishti.dsa.java8Features.LambdaEmployees;
import com.shrishti.dsa.java8Features.LambdaFunctions;
import com.shrishti.dsa.strings.PalindromeString;
import com.shrishti.dsa.strings.ReverseString;

public class JavaDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";

		ReverseString reverseString = new ReverseString();

		String result = reverseString.reverse(input);

		System.out.println("Original: " + input);
		System.out.println("Reversed: " + result);

		String palindromeStr = "A man a plan a canal Panama";
		PalindromeString palindromeString = new PalindromeString();

		boolean isPalindrome = palindromeString.palindromeString("A man a plan a canal Panama");

		System.out.println("Original: " + palindromeStr);
		System.out.println("Result: " + isPalindrome);

		LambdaFunctions obj = new LambdaFunctions();
		obj.testLambda();

	}

}
