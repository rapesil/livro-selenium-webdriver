package cap_08;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaLoginFacebook {
	
	 private  CadastroFacebookPage facebook;
	 private  WebDriver driver;

    @Before
    public void preCondicao() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        facebook = new CadastroFacebookPage(driver);        
    }
    
    @Test
    public void deveLogarComSucesso() {
    	// Passe seu usuário e senha corretos
    	facebook.logarComo("Seu usuario", "Sua senha"); 
    }
    
    @Test
    public void naoDeveLogarSemSenha() {
    	// Deixei a senha em branco
    	facebook.logarComo("Seu usuario", ""); 
    }
    
    @Test
    public void naoDeveLogarComSenhaErrada() {
    	// Passe uma senha errada
    	facebook.logarComo("Seu usuario", "Sua senha"); 
    }

    @After
    public void posCondicao() {
        driver.quit();
    }
}

