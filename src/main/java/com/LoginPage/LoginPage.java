package com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	//WebElement username = driver.findElement(By.name("username"));
	@FindBy(name="username")
	private WebElement username; 
	
	
	//WebElement password = driver.findElement(By.id("password"));
	@FindBy(id="password")
	private WebElement password;
	
	//WebElement login = driver.findElement(By.name("login"));
	@FindBy(name="login")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

}
