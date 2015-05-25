/* start:24/05 end: 24/05 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   static int lonelyinteger(int[] a) {
       
      Map<Integer, Integer> int_map = new HashMap<Integer, Integer>();
      Integer previousValue;
      int lonelyInt = 0;
               
      for(int i=0; i < a.length; i++){
        previousValue = int_map.get(a[i]);
        int_map.put(a[i], previousValue == null ? 1 : previousValue + 1);
      }

      Iterator it = int_map.entrySet().iterator();
     
      while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        if (pair.getValue() == 1) lonelyInt = (int) pair.getKey();
        it.remove(); // avoids a ConcurrentModificationException
      } 
       
      return lonelyInt;
    }
    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
