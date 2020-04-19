package com.solve.substring;

import java.util.Scanner;

public class Solution {


	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		String[] str = new String[s.length()];
		String currStr = s.substring(0, k);
		smallest = currStr;
		largest = currStr;
		
		for (int i = 0; i < s.length(); i++) {
			if (i + k < s.length()) {
				break;
			}
			str[i] = s.substring(i, i + k);
			if (smallest.compareTo(str[i]) > 0) {
				smallest = str[i];
			}
			if (largest.compareTo(str[i]) < 0) {
				largest = str[i];
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
