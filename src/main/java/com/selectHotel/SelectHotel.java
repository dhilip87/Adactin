package com.selectHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;
	
	//WebElement s = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement s;
	
	//WebElement cn = driver.findElement(By.xpath("//input[@name='continue']"));
	@FindBy(xpath="//input[@name='continue']")
	private WebElement cn;

	public SelectHotel(WebDriver driver) {
		SelectHotel.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getS() {
		return s;
	}

	public WebElement getCn() {
		return cn;
	}
	
	
	
	
	
	
}
