package cap_07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsandoAsserts {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void inicializa() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void verificaSeTituloEstaCorreto()   {
		String titulo = driver.getTitle();
		boolean tituloEstaCorreto = titulo.equals("Google");
		Assert.assertTrue(tituloEstaCorreto);	 // aqui está nosso Assert
	}
	
	@AfterClass
	public static void finaliza() {
		driver.quit();
	}	
}