package com.solve.sha256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

/**
 * 
 * @author KhanhPN5
 * @detail: https://www.hackerrank.com/challenges/sha-256/problem?h_r=next-challenge&h_v=zen
 */
public class Solution {
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException  {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}
	
	public static String toHexString(byte[] hash) {
		BigInteger number = new BigInteger(1, hash);		
		// Convert message digest into hex value
		StringBuilder hexString = new StringBuilder(number.toString());		
		// Pad with leading zeros 
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
	}
	
	public static String hashWith256(String textToHash) throws NoSuchAlgorithmException {
	    MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    byte[] byteOfTextToHash = textToHash.getBytes(StandardCharsets.UTF_8);
	    byte[] hashedByetArray = digest.digest(byteOfTextToHash);
	    String encoded = Base64.getEncoder().encodeToString(hashedByetArray);
	    return encoded;
	}
	// SOlution 
	public static String GenerateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest objSHA = MessageDigest.getInstance("SHA-256");
        byte[] bytSHA = objSHA.digest(input.getBytes());
        BigInteger intNumber = new BigInteger(1, bytSHA);
        String strHashCode = intNumber.toString(16);

        // pad with 0 if the hexa digits are less then 64.
        while (strHashCode.length() < 64) {
            strHashCode = "0" + strHashCode;
        }
        return strHashCode;
    }

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int $;
		System.out.println(GenerateHash(s));;
		
	}
	
	
}
