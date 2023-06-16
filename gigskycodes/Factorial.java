 package gigskycodes;

public class Factorial {
            public static void main(String[] args) {
            	//declare a variable with int input as 1
				int fact = 1;
				
				//iterate the values with range as 5
				for (int i = 5; i > 0; i--) {
					//multiply fact variable with range value
					fact = fact*i;
				}
				//print the value
				System.out.println(fact);
			}
}
