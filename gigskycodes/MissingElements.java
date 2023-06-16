package gigskycodes;

public class MissingElements {
                public static void main(String[] args) {
                	//declare variable with input
					int[] num = {1,3,4,5,6,7};
					
					//using missing elements formula
					int n = num.length+1;	
					int sum = n*(n+1)/2;
					
					//iterate the values
					for (int i = 0; i < num.length; i++) {
						//subtract the sum with all the input values
						sum = sum-num[i];
						
					}
					//print the missing element
					System.out.println(sum);
				}
}
