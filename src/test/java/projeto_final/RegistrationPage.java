package projeto_final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	@FindBy(css = "#menu-item-374 > a")
	private WebElement linkRegistration;
	
	@FindBy(id="name_3_firstname")
	private WebElement txtFirstName;
	
	@FindBy(id="name_3_lastname")
	private WebElement txtLastName;
	
	@FindBy(name="dropdown_7")
	private WebElement selectPais;
	
	@FindBy(id="mm_date_8")
	private WebElement selectMes;
	
	@FindBy(id="dd_date_8")
	private WebElement selectDia;
	
	@FindBy(id="yy_date_8")
	private WebElement selectAno;
	
	@FindBy(css="#pie_register > li:nth-child(2) > div > div > input:nth-child(2)")
	private WebElement checkSolteiro;
	
	@FindBy(css="#pie_register > li:nth-child(3) > div > div.radio_wrap > input:nth-child(2)")
	private WebElement checkDanca;
	
	@FindBy(id="phone_9")
	private WebElement txtCelular;

	@FindBy(id="username")
	private WebElement txtUsuario;

	@FindBy(id="email_1")
	private WebElement txtEmail;

	@FindBy(id="password_2")
	private WebElement txtSenha;

	@FindBy(id="confirm_password_password_2")
	private WebElement txtConfirmacao;
	
	@FindBy(name="pie_submit")
	private WebElement btnSubmit;
	
	@FindBy(className="piereg_message")
	private WebElement mensagemSucesso;
	
	@FindBy(css="#pie_register > li:nth-child(1) > div.fieldset.error > div.legend_txt > span")
	private WebElement mensagemObrigatoriedadeNome;

	@FindBy(css="#pie_register > li:nth-child(6) > div > div > span")
	private WebElement mensagemQtdeMinima;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicaEmRegistrationLink() {
		linkRegistration.click();
	}
	
	public void preencheNome(String firstName, String lastName) {
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
	}
	
	public void preencheEstadoCivilSolteiro() {
		checkSolteiro.click();
	}

	public void escolheDance() {
		checkDanca.click();
	}
	
	public void escolhePais(String pais) {
		Select select = new Select(selectPais);
		select.selectByVisibleText(pais);
	}
	
	public void preencheDataNascimento(String dia, String mes, String ano) {
		Select select = new Select(selectMes);
		select.selectByVisibleText(mes);
		
		select = new Select(selectDia);
		select.selectByVisibleText(dia);
		
		select = new Select(selectAno);
		select.selectByVisibleText(ano);
	}
	
	public void preencheDadosDeContato(String cellPhone, String domainName, String emailAddress) {
		txtCelular.sendKeys(cellPhone);
		txtUsuario.sendKeys(domainName);
		txtEmail.sendKeys(emailAddress);
	}

	public void digitaSenhaEConfirmacao(String senha, String confirmacao) {
		txtSenha.sendKeys(senha);
		txtConfirmacao.sendKeys(confirmacao);
	}
	
	public void enviaFormulario() {
		
		btnSubmit.click();
	}
	
	public boolean mensagemSucessoRegistroApareceu() {
		return mensagemSucesso.isDisplayed();
	}

	public boolean mensagemSucessoEstaCorreta() {
		return mensagemSucesso.getText().equals("Thank you for your registration");
	}

	public boolean mensagemObrigatoriedadeNomeApareceu() {
		return mensagemObrigatoriedadeNome.isDisplayed();
	}
	
	public boolean mensagemQtdeMinimaApareceu() {
		return mensagemQtdeMinima.isDisplayed();
	}
}
