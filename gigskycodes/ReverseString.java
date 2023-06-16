package gigskycodes;

import java.util.Scanner;

public class ReverseString {
             public static void main(String[] args) {
            	 //using scanner method
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				
				//print enter input
				System.out.println("Enter input");
				
				//use .nextline to enter input in next line
				String revers = scan.nextLine();
				
				//convert string to charArray
				char[] character = revers.toCharArray();
				
				//iterate the values
				for (int i = character.length-1; i >=0  ; i--) {
					//print the reversed value
					System.out.println(character[i]);
				}		
			}
}
