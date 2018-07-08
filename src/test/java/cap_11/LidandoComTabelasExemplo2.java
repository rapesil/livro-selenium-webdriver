package cap_11;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LidandoComTabelasExemplo2 {
	WebDriver driver;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
	}
	
	@Test
	public void percorreTabelaLinhaALinha() {
		WebElement minhaTabela = driver.findElement(By.cssSelector("#content > table"));
		WebElement tbody = minhaTabela.findElement(By.tagName("tbody"));
		List<WebElement>trs = tbody.findElements(By.tagName("tr"));
		for (WebElement tr: trs){
			List<WebElement> tds = tr.findElements(By.tagName("td"));
			for(WebElement td: tds) { 
				System.out.println(td.getText());
			}
		}		
	}

	@After
	public void depois(){
		driver.quit();
	}
}
