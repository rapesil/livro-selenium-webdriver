package cap_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExemploEsperaPersonalizada {
	
	static WebDriver driver;
	
	public static void aguardaAteQueValueMude(final WebElement element) {
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    wait.until(new ExpectedCondition<Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            String value = element.getAttribute("value");

	            if(!value.equals("")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
}
