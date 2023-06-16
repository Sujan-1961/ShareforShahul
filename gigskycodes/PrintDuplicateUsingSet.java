package gigskycodes;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateUsingSet {
            public static void main(String[] args) {
				int[] num = {1,7,8,9,3,3,2,4,6,1,5,7,8};
				
				Set <Integer> val = new TreeSet <Integer> ();
				for (int i = 0; i < num.length; i++) {
					if (!val.add(num[i])) {
						System.out.println(num[i]+" ");
					}	
				}
				
			}
}