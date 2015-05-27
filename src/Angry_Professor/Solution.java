/* start:27/05 end: 27/05 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void getCancelled(Integer[] arr, int K){

		int counter = 0;

		for (int i=0; i < arr.length; i++){
			if (arr[i] <= 0) counter++;
		}

		if (counter >= K) System.out.println("NO");
		else  System.out.println("YES");

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T, N, K, res;

        T = in.nextInt();

        for (int j=0; j < T; j++){ 

        	N = in.nextInt();
        	K = in.nextInt();

        	Integer[] arvTime = new Integer [N];

	        for (int i=0; i < N; i++){
	        	arvTime[i] = in.nextInt();
	        }

	        getCancelled(arvTime, K);

	        arvTime = null;

	    }
    }
}