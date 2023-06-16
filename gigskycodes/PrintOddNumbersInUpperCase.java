package gigskycodes;

public class PrintOddNumbersInUpperCase {
                    public static void main(String[] args) {
                    	//declare a variable
						String text = "sujan";
						
						//convert string to character
						char[] character = text.toCharArray();
						
			          	//iterate the values
						for (int i = 0; i < character.length; i++) {
							//use i modulo 2 double equal 1
							if (i%2==1) {
								//convert the odd numbers to upper case
								char c = Character.toUpperCase(character[i]);
								System.out.println(c);
							} else {
                                        System.out.println(character[i]);
							}
						}
					}
}
