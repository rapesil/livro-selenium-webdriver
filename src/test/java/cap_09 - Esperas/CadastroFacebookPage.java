package cap_09;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroFacebookPage {

    WebDriver driver;

    public CadastroFacebookPage(WebDriver driver) {
        this.driver = driver;
    }

    public CadastroFacebookPage preencheNome(String nome) {
        driver.findElement(By.name("firstname")).sendKeys(nome);
        return this;
    }

    public CadastroFacebookPage preencheSobrenome(String sobrenome) {
        driver.findElement(By.name("lastname")).sendKeys(sobrenome);
        return this;
    }
    
    
    // Com espera 
    public CadastroFacebookPage preencheUsuario(String usu) {
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
    	 WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
    	        
    	 usuario.sendKeys(usu);
    	 return this;
    }
    
    // Com espera - Fluent Wait
    // Mudei o nome para preencheUsuarios para não dar problema com o anterior
	public CadastroFacebookPage preencheUsuarios(String usu) {  
    	
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        
        usuario.sendKeys(usu);        
        return this;
    }
    
    public CadastroFacebookPage preencheSenha(String senha) {
    	driver.findElement(By.id("pass")).sendKeys(senha);
    	return this;
    }
    
    public void clicaBotaoEntrar() {
    	driver.findElement(By.id("u_0_2")).click();
    }  
    
    public void logarComo(String user, String pass) {
    	preencheUsuario(user).preencheSenha(pass).clicaBotaoEntrar();
    }
}