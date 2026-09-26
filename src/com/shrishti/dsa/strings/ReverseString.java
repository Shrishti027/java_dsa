package com.shrishti.dsa.strings;

public class ReverseString {

	public String reverse(String input) {
//		FOR LOOP=======>
		String r = "";
		for (int i = 0; i < input.length(); i++) {

			// prepend each character
			r = input.charAt(i) + r;
		}
		System.out.println("reversed string using for loop : " + r);
//		STRINGBUILDER==========>
		
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("reversed string using StringBuilder : " + reversed);
		
//		TWO POINTER===========>
		char[] charr = input.toCharArray();
		int left = 0, right = charr.length - 1;

		while (left < right) {
			char temp = charr[left];
			charr[left] = charr[right];
			charr[right] = temp;
			left++;
			right--;
		}
		return new String(charr);
	}
}
