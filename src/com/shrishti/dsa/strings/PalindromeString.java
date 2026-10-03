package com.shrishti.dsa.strings;

public class PalindromeString {
	public boolean palindromeString(String input) {
		String str = input.toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println("str : "+str);
		System.out.println("Checking if this String is Palindrome or not : "
				+ str.equals(new StringBuilder(str).reverse().toString()));
//		return str.equals(new StringBuilder(str).reverse().toString());
		char[] charr = str.toCharArray();
		int left = 0, right = str.length()-1;
		while (left<right){
			if(charr[left]!=charr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}


