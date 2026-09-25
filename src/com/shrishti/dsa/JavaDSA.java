package com.shrishti.dsa;

import com.shrishti.dsa.strings.ReverseString;

public class JavaDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";

		ReverseString reverseString = new ReverseString();

		String result = reverseString.reverse(input);

		System.out.println("Original: " + input);
		System.out.println("Reversed: " + result);
	}

}
