/* start:24/05 end: 24/05 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;   // scanner class

public class Solution{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
             
        int T, N;
        int i, j;
        int type, min = 3;

        N = in.nextInt();
        T = in.nextInt();

        int[] width = new int[N];

        for (int k=0; k<N; k++){
            width[k] = in.nextInt();
        }

        while(T > 0){
        	i = in.nextInt();
        	j = in.nextInt();

        	while(i<=j){
        		type = width[i];
        		if (type < min)	min = type;
        		if (min == 1) break;
        		i++;
        	}
        	System.out.println(min);
        	min = 3;
        	T--;
        }

	}

}