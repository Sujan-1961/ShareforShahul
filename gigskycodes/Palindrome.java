package gigskycodes;

public class Palindrome {
           public static void main(String[] args) {
        	   //declare a variable
			String text = "madam";
			
			//declare empty variable
			String text2 = "";
			
			//convert the string to charrArray
			char[] character = text.toCharArray();
			
			//iterate the values
			for (int i = character.length-1; i >= 0 ; i--) {
				
				text2 = text2+character[i];
				//print the reversed string
				System.out.println(text2);
			}
			//check if the condition is true or false
			if (text2.equals(text)) {
				//print if it is palindrome or not
				System.out.println("It is palindrome");
			} else {
                  System.out.println("Not a palindrome");
			}
		}
}
