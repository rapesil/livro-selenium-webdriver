package cap_12;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComTabela {
	WebDriver driver;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "/Users/rafaelpeixotosilva/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("file:///Users/rafaelpeixotosilva/Documents/rafael-peixoto/tabela.html");
	}
	
	@Test
	public void escreveNaPrimeiraLinha() {
		WebElement primeiraLinha=driver.findElement(By.id("1"));
		List<WebElement>colunasDaPrimeiraLinha = primeiraLinha.findElements(By.tagName("td"));
		for (WebElement td : colunasDaPrimeiraLinha) {
			WebElement input = td.findElement(By.tagName("input"));
			input.sendKeys("escrito com Selenium");
		}
	}
}
