package cap_07;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaTituloGoogle {
	
	WebDriver driver;
	
	// ARRANGE
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");	
	}
	
	@Test
	public void validarTitulo(){
		//ACT
		String tituloAtual = driver.getTitle();
		String tituloEsperado = "Google";
		
		// Assert
		Assert.assertTrue("não são iguais", tituloAtual.equals(tituloEsperado));
		Assert.assertEquals("são diferentes", tituloAtual, tituloEsperado);
	}	
	
	@After
	public void tearDown(){
		driver.quit();
	}

}

