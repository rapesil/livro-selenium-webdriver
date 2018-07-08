package cap_11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LidandoComTabelasExemplo1 {
	WebDriver driver;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
	}
	
	@Test
	public void validaInformacaoNaTabela() {
		WebElement linhaDesejada = driver.findElement(By.cssSelector("#content > table > tbody > tr:nth-child(2) > th"));
		String textoDaLinhaDesejada = linhaDesejada.getText();
		Assert.assertEquals("Clock Tower Hotel", textoDaLinhaDesejada);
	}

	@After
	public void depois(){
		driver.quit();
	}
}
