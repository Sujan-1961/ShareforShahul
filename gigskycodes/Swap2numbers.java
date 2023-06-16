package gigskycodes;

public class Swap2numbers {
             public static void main(String[] args) {
            	 //declare two variables
				int a = 30;
				int b = 40;
				
				//swap them using a temp variable
				int temp;
				temp = a;
				a=b;
				b=temp;	
				
				//print the values
				System.out.println(a + "and" + b);
			}
}
