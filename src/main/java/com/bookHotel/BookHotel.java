package com.bookHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;
	
	//WebElement fn = driver.findElement(By.xpath("//input[@name='first_name']"));
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fn;
	
	//WebElement ln = driver.findElement(By.xpath("//input[@name='last_name']"));
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement ln;
	
	//WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement add;
	
	//WebElement ccn = driver.findElement(By.xpath("//input[@name='cc_num']"));
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccn;
	
	//WebElement cct = driver.findElement(By.xpath("//select[@name='cc_type']"));
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cct;
	
	//WebElement em = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement em;
	
	//WebElement ey = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ey;
	
	//WebElement cvvn = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvn;
		
	//WebElement bk = driver.findElement(By.xpath("//input[@name='book_now']"));
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bk;

	public BookHotel(WebDriver driver) {
		BookHotel.driver=driver;
		PageFactory.initElements(driver, this);
			
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcn() {
		return ccn;
	}

	public WebElement getCct() {
		return cct;
	}

	public WebElement getEm() {
		return em;
	}

	public WebElement getEy() {
		return ey;
	}

	public WebElement getCvvn() {
		return cvvn;
	}

	public WebElement getBk() {
		return bk;
	}
	
	
	
}
