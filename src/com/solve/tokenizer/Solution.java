package com.solve.tokenizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		StringTokenizer st = new StringTokenizer(s," $&+,:;=?@#|'<>.-^*()%!",false);
		System.out.println(st.countTokens());	
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		scan.close();
	}
}
