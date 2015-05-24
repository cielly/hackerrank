/* start:24/05 end: 24/05 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;   // scanner class

public class Solution{

	static int diff = 0; 

	public static int MakePalindrome(String word, int i, int l){
		
		if ((word.length() % 2 != 0) && (l == i)) return diff;	// Base condition to string with odd size

		if (( word.length() % 2 == 0) && (l - i) < 1) return diff;	// Base condition to string with even size

		char charP1 = word.charAt(i);
		char charP2 = word.charAt(l);

		if (charP1 != charP2) {
			if (charP1 > charP2)	diff+= charP1 - charP2;
			else diff+= charP2 - charP1;
		}

		return MakePalindrome(word, i+1, l-1);

	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String word;
		int res;

		int T = in.nextInt();

		in.nextLine();

		while(T > 0){
			word = in.nextLine();
			int length = word.length();
			res = MakePalindrome(word, 0, length-1);
			diff = 0;
			System.out.println(res);
			T--;
		}


	}

}

