package cap_08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    
    public CadastroFacebookPage preencheUsuario(String usu) {
    	driver.findElement(By.id("email")).sendKeys(usu);
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