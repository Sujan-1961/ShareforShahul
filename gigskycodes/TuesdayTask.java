package gigskycodes;

public class TuesdayTask {
          public static void main(String[] args) {
        	  String input = "Hello World";
        	  TuesdayTask task = new TuesdayTask();
              System.out.println("The length of last word is "
                                 + task.lengthOfLastWord(input));
		}
          public int lengthOfLastWord(String a) {
        	  int len = 0;
              String x = a.trim();
       
              for (int i = 0; i < x.length(); i++) {
                  if (x.charAt(i) == ' ')
                      len = 0;
                  else
                      len++;
          }
          return len;
}
}
