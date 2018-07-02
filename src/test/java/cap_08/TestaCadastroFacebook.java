package cap_08;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaCadastroFacebook {

    private static CadastroFacebookPage facebook;
    private static WebDriver driver;

    @BeforeClass
    public static void preCondicao() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        facebook = new CadastroFacebookPage(driver);        
    }

    @Test
    public void preencheNomeSobrenome() {
        facebook
            .preencheNome("José")
            .preencheSobrenome("da Silva");
    }

}
