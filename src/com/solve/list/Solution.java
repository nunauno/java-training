package com.solve.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author KhanhPN5 https://www.hackerrank.com/challenges/java-list/problem
 */
public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int N;
		List<Integer> listInt = new ArrayList<>();
	
		N = Integer.parseInt(sc.nextLine());
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		while (st.hasMoreTokens()) {
			listInt.add(Integer.parseInt(st.nextToken()));
		}
		int Q = Integer.parseInt(sc.nextLine());
		String input;
		StringTokenizer ins;
		int remove;
		for (int i = 0; i < Q; i++) {
			input = sc.nextLine();
			switch (input) {
			
			case "Insert":
				ins = new StringTokenizer(sc.nextLine());
				listInt.add(Integer.parseInt(ins.nextToken()), Integer.parseInt(ins.nextToken()));			
				break;
			case "Delete":
				remove = Integer.parseInt(sc.nextLine());
				listInt.remove(remove);
				break;
			}
		}
		
		for(int i = 0 ; i < listInt.size() ; i++) {
			System.out.print(listInt.get(i) + " ");
		}
	}
}