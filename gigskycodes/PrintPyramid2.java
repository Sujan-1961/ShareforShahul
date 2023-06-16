package gigskycodes;

public class PrintPyramid2 {
          public static void main(String[] args) {
        	 int n=4;
        	 for (int i = 0; i <= n; i++) {
        		 
			     for (int j = 0; j < n-i; j++) {
			    	 System.out.println(" ");
					for (int j2 = 1; j2 < n; j2++) {
						System.out.println("* ");
					}
				}
			}
        			
}
}
