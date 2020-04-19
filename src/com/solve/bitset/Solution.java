package com.solve.bitset;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		StringTokenizer st = new StringTokenizer(input); // get each input in a string
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		BitSet b1 = new BitSet(N);
		BitSet b2 = new BitSet(N);

		while (M --> 0) {
			String inputString = br.readLine().trim();
			StringTokenizer s = new StringTokenizer(inputString);
			String ops = s.nextToken();
			int first = Integer.parseInt(s.nextToken());
			int second = Integer.parseInt(s.nextToken());
			switch (ops) {
			case "AND":
				if (1 == first)
					b1.and(b2);
				else
					b2.and(b1);
				break;
			case "OR":
				if (1 == first)
					b1.or(b2);
				else
					b2.or(b1);
				break;
			case "XOR":
				if(1== first)
					b1.xor(b2);
				else
					b2.xor(b2);
				break;
			case "FLIP":
				if(1 == first) 
					b1.flip(second);
				else
					b2.flip(second);
				break;
			case "SET":
				if(1 == first) 
					b1.set(second);
				else
					b2.set(second);
				break;
			}
			
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}

	}

	public static void solve() throws IOException {
		// 1.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		BitSet bit1 = new BitSet(N);
		BitSet bit2 = new BitSet(N);

		while (M-- > 0) {
			// 2.
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			String ins = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 3.
			switch (ins) {
			case "AND":
				if (a == 1)
					bit1.and(bit2);
				else
					bit2.and(bit1);
				break;
			case "OR":
				if (a == 1)
					bit1.or(bit2);
				else
					bit2.or(bit1);
				break;
			case "XOR":
				if (a == 1)
					bit1.xor(bit2);
				else
					bit2.xor(bit1);
				break;
			case "FLIP":
				if (a == 1)
					bit1.flip(b);
				else
					bit2.flip(b);
				break;
			case "SET":
				if (a == 1)
					bit1.set(b);
				else
					bit2.set(b);
				break;

			}
			// 4.
			System.out.println(bit1.cardinality() + " " + bit2.cardinality());

		}
	}
}