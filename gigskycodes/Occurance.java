package gigskycodes;

public class Occurance {
             public static void main(String[] args) {
            	 //declare a variable with input as batman
				String name = "batman";
				
				//declare another variable with input as 0
				int count = 0;
				
				//convert from string to charArray
				char[] character = name.toCharArray();
				
				//iterate the values
				for (int i = 0; i < character.length; i++) {
					//compare the character with a
					if (character[i]=='a') {
						//count the number of times is repeated
						count++;
					}					
				}
				//print the count
				System.out.println(count);
			}
}
