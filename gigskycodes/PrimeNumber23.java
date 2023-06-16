package gigskycodes;

public class PrimeNumber23 {
public static void main(String[] args) {
		
	int count ;
	for (int i = 1; i < 20; i++) {
		 count =0;
	
	  for (int j = 1; j <= i; j++) {
		
		if(i%j==0) {
			count++;
		}
	}
	
	if(count==2) {
		System.out.println("The given number is prime"+i);
	}else {
		System.out.println("The given number is not prime number"+i);
	}
}
}
}
