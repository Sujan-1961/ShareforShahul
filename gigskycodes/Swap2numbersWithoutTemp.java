package gigskycodes;

public class Swap2numbersWithoutTemp {
	public static void main(String[] args) {
		int a=30;
		int b=40;

		//without temporary variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		//print the values
		System.out.println("a= " +a+ "b=" +b);
	}
}
