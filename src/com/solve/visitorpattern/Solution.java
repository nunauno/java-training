package com.solve.visitorpattern;

public class Solution {

	
	public static void main(String[] args) {
		String s = "heello";
		String b = "heello" ;
		if(s.compareTo(b) == 0) {
			System.out.println(s.length() + b.length());
		} else {
			System.out.println("no");
		}
	}
}
