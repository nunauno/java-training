package com.solve.reverse;

import java.util.Scanner;

public class Solution {
	public static void isPalindrome(String s) {
		int n = s.length();
		boolean flag = true;

		for (int i = 0; i < n / 2; i++) {
			if (Character.valueOf(s.charAt(i)).compareTo(s.charAt(n - i - 1)) != 0) {
				System.out.println(Character.valueOf(s.charAt(i)));
				System.out.println(Character.valueOf(s.charAt(n - i -1)));
				flag = false;
			}
		}
		System.out.print((flag == true ? "Yes" : "No"));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		//System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
		/* Enter your code here. Print output to STDOUT. */
		isPalindrome(A);
	}

}
