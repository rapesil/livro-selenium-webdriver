package cap_06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroFacebookTest {
	
	WebDriver driver;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "/Users/rafaelpeixotosilva/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void cadastroFacebookComSucesso() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("João");
		driver.findElement(By.name("lastname")).sendKeys("da Silva");
		driver.findElement(By.name("reg_email__")).sendKeys("joaosilva@teste.com.br");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("joaosilva@teste.com.br");
		driver.findElement(By.name("reg_passwd__")).sendKeys("senhaDoJoao123.");
		
		WebElement comboDia = driver.findElement(By.id("day"));
		Select select = new Select(comboDia);
		select.selectByVisibleText("15");
		
		WebElement comboMes = driver.findElement(By.id("month"));
		select = new Select(comboMes);
		select.selectByVisibleText("Jun");
		
		WebElement comboAno = driver.findElement(By.id("year"));
		select = new Select(comboAno);
		select.selectByVisibleText("1980");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.name("websubmit")).click();		
	}
	
	// @After
	public void depois() {
		driver.quit();
	}
}
