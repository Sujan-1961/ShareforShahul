package gigskycodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReverseEvenWords {
               private static final WebDriver driver = null;

			public static void main(String[] args) {
				String text = "I am a Software tester";
				
				String[] split = text.split(" ");
				
				
				for (int i = 0; i < split.length; i++) {
					if (i%2==1) {
						String text1 = "";
					     char[] charArray = split[i].toCharArray();	
					     for (int j = charArray.length-1; j >= 0 ; j--) {
							text1 = text1+charArray[j];
							
						}
					     System.out.print(text1+" ");
					     
					} else {
						System.out.print(split[i]+" ");
						
				}
//					WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
//				    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id());
				}
				
				
				
			}
}
