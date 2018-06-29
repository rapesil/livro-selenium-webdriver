package cap_05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {

	WebDriver driver;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		driver.manage().window().maximize();
	}

	@Test
	public void teste() {
		WebElement caixaPesquisa = driver.findElement(By.xpath("//*[@id='q']"));
		caixaPesquisa.clear();
		caixaPesquisa.sendKeys("teste");
	}

	@After
	public void posCondicao() {
		driver.quit();
	}
}