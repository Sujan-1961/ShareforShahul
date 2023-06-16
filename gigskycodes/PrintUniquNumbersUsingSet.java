package gigskycodes;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniquNumbersUsingSet {
              public static void main(String[] args) {
            	  int[] arr = {1,2,3,4,5,6,1,2,7,8,9};
            	  //1,2,3,4,5,6,7,8,9
            	  //duplicate 1,2
        	      Set<Integer> set = new LinkedHashSet<Integer>();
                   System.out.println(set);
        	      for (int i = 0; i < arr.length; i++) {
					set.add(arr[i]);
				}
        	      System.out.println(set);      
			}
}
