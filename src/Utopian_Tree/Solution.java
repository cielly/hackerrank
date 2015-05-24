/* start:17/05 end: 17/05 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;   // scanner class


public class Solution {
    
    public Solution(){}
    
    public int growTree(int height, int N){

        if (N==0) return height;
        
        if (N==1) return height*2;

        height *= 2; //spring
        height += 1; //summer
        
        return growTree(height, N-2);      
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
    
        Solution objSol = new Solution();
        
        int T, N;
        final int INIT_HEIGHT = 1;
        
        T = in.nextInt();
                
        for (int i=0; i<T; i++){
            N = in.nextInt();
            System.out.println(objSol.growTree(INIT_HEIGHT, N));
        }
    }
}