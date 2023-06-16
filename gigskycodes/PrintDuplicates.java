package gigskycodes;

import java.util.Arrays;

public class PrintDuplicates {
                public static void main(String[] args) {
                	//declare variable with input 
					int[] num  = {1,2,3,4,5,4,6,7,2};
					
					//sort the input in ascending order
					Arrays.sort(num);
					
					//get the size of the array
					int b = num.length;
					
					//iterate the values
					for (int i = 0; i < b; i++) {
						//add another iteration 
						for (int j = i+1; j < b; j++) {
							//compare both iteration
							if (num[i]==num[j]) {
								//print thre duplicate
								System.out.println(num[i]);
							
							}
						}
					}
				}
}
