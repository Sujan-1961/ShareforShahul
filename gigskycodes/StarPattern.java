package gigskycodes;

public class StarPattern {
	public static void main(String[] args) {
		//declare two variables with no input
		//declare another variable n with 5 as input
		int i;
		int j;
		int n=5;
		
		//iterate the value
		for(i=0;i<n;i++)
		{
			//add another iteration 
			for(j=0; j<=i; j++)
			{
				//print the stars
				System.out.print("* ");
			}
			
			System.out.println();
		}		
	}
}
