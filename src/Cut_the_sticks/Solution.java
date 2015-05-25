/* start:24/05 end: 24/05 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void cutStick(Integer[] arr){

		int min = 1000;
		int cut = 0;

		for(int i=0; i < arr.length;i++){
			if (arr[i] > 0 && arr[i] < min) min = arr[i];
			if (min == 1) break;
		}

		for(int i=0; i < arr.length;i++){
			if (arr[i] > 0) arr[i] -= min;
			if (arr[i] == 0) cut++;
		}

		if (arr.length == cut) return ;

		else System.out.println(arr.length - cut);

		cutStick(arr);

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N, res;

        N = in.nextInt();

        Integer[] arr = new Integer [N];

        for (int i=0; i < N; i++){
        	arr[i] = in.nextInt();
        }

        System.out.println(N);

        cutStick(arr);

    }
}