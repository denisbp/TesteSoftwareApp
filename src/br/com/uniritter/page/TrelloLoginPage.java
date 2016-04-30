package br.com.uniritter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.uniritter.common.TestCaseCommon;

public class TrelloLoginPage extends GenericPage{
	
	private WebElement inputUsername;
	private WebElement inputPassword;
	private WebElement buttonLogin;
	
	public TrelloLoginPage() {
		inputUsername = TestCaseCommon.getDriver().findElement(By.id("user"));
		inputPassword = TestCaseCommon.getDriver().findElement(By.id("password"));
		buttonLogin = TestCaseCommon.getDriver().findElement(By.id("login"));
	}

	public WebElement getInputUsername() {
		return inputUsername;
	}

	public void setInputUsername(WebElement inputUsername) {
		this.inputUsername = inputUsername;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	public void setButtonLogin(WebElement buttonLogin) {
		this.buttonLogin = buttonLogin;
	}
	
	public void login() {
		this.login("denisbp+trello@gmail.com", "testesoftware");
	}
	
	public void login(String username, String password) {
		inputUsername.clear(); // WebElement
		inputUsername.sendKeys(username);
		inputPassword.clear();
		inputPassword.sendKeys(password);
		buttonLogin.click();
	}
	
}
