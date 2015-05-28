/* start:27/05 end: 27/05 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void cutMax(int K){

		/* The value of K can be too big it can't fit an int, so before calculating total number 
		of pieces ut is necessary to store the "dimension" of the bar in a long type */
		long n;	
		BigInteger pieces;
				
		if (K%2 == 0) {
			n = K/2;
			pieces = BigInteger.valueOf(n*n);
			System.out.println(pieces.toString());
		}
		else {
			n = Math.round(K/2);
			pieces = BigInteger.valueOf(n*(n+1));
			System.out.println(pieces.toString());
		}
		

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T, N, K, res;

        T = in.nextInt();

        for (int j=0; j < T; j++){ 

        	K = in.nextInt();

	        cutMax(K);

	    }
    }
