package gigskycodes;

public class LengthOfLastWords {
              public static void main(String[] args) {
            	  String str1 = "Hello World";
          		System.out.println("Original String: "+str1);
                  System.out.println("Length of the last word of the above string: "+lengthoflastword(str1));
			}
              
              public static int lengthoflastword(String str1) {
                  int lengthword = 0;
                  String[] words = str1.split(" ");
                  if(words.length>0) {
                	  lengthword = words[words.length-1].length();			
                  } else {
                	  lengthword = 0;
                  }
                  return lengthword;
              }
}
