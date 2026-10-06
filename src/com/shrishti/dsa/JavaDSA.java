package com.shrishti.dsa;

import java.util.Arrays;
import java.util.List;

import com.shrishti.dsa.arrays.MaximumElementInArray;
import com.shrishti.dsa.arrays.RearrangeArray;
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
		
		RearrangeArray arrayToRearrangeObj = new RearrangeArray();
		int[] arr = { 1, 2, 3, -4, -1, 4 };
		int[] rearrangedArrayResult = arrayToRearrangeObj.array(arr);
		System.out.println(Arrays.toString(rearrangedArrayResult));
		
		MaximumElementInArray maxElementInArrayObj = new MaximumElementInArray();
		int[] arrForFindingMax = { 1, 2, 3, -4, -1, 4};
		int maxResultArray = maxElementInArrayObj.maximumElementInArray(arrForFindingMax);
		System.out.println("Maximum element in array is : "+maxResultArray);

	}

}
