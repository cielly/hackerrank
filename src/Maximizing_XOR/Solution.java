import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int max = 0;

    static int maxXorRec(int l, int r) {

        int xor;
        
        if (r < l) return max;

        xor = l ^ r;

        if (xor > max) max = xor;
       
        return maxXorRec(l+1,r);
    }

    
    static int maxXor(int l, int r) {

        int max_res = 0;
        int res;

        for (int i = r; i >= l; i--){
            res = maxXorRec(l,i);
            if (res > max_res) max_res = res;
        }

        return max_res; 

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int res;
        int l, r;

        l = in.nextInt();
        r = in.nextInt();
        
        res = maxXor(l, r);
        
        System.out.println(res);
        
    }
}
