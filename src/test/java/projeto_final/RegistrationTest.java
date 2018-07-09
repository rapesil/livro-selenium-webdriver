package projeto_final;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class RegistrationTest {

	private WebDriver driver;
	private RegistrationPage page;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "/Users/rafaelpeixotosilva/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://demoqa.com/");
		page = new RegistrationPage(driver);
		page.clicaEmRegistrationLink();
	}

	@Test
	public void deveCriarUmRegistro() {
		
		Faker faker = new Faker();
		String primeiroNome = faker.name().firstName();
		String ultimoNome = faker.name().lastName();
		page.preencheNome(primeiroNome, ultimoNome);
		page.preencheEstadoCivilSolteiro();
		page.escolheDance();
		page.escolhePais("Brazil");
		page.preencheDataNascimento("15", "5", "1990");
		
		String user = primeiroNome + "_" + ultimoNome;
		page.preencheDadosDeContato("0123456789", user, user + "@gmail.com");
		page.digitaSenhaEConfirmacao("senha123", "senha123");
		page.enviaFormulario();
		
		Assert.assertTrue(page.mensagemSucessoRegistroApareceu());
		Assert.assertTrue(page.mensagemSucessoEstaCorreta());
	}
	
	@Test
	public void deveAvisarObrigatoriedadeDeSobrenome() {
		page.preencheNome("Maria", "");
		page.preencheEstadoCivilSolteiro();
		
		Assert.assertTrue(page.mensagemObrigatoriedadeNomeApareceu());
	}
	
	@Test
	public void deveValidarQuantidadeMinimaDeDigitosDeTelefone() {
		page.preencheDadosDeContato("123456789", "teste", "teste");
		Assert.assertTrue(page.mensagemQtdeMinimaApareceu());
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
}