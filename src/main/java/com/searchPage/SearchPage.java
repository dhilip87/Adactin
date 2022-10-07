package com.searchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public static WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		SearchPage.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	//WebElement area = driver.findElement(By.name("location"));
	@FindBy(name="location")
	private WebElement area;
	
	//WebElement hotel = driver.findElement(By.name("hotels"));
	@FindBy(name="hotels")
	private WebElement hotel;	
	
	//WebElement room = driver.findElement(By.name("room_type"));
	@FindBy(name="room_type")
	private WebElement room;
		
	//WebElement room_nos = driver.findElement(By.id("room_nos"));
	@FindBy(id="room_nos")
	private WebElement room_nos;
		
//	//WebElement date1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	@FindBy(xpath="(//input[@type='text'])[2]\")")
//	private WebElement date1;
//		
//	//WebElement date2 = driver.findElement(By.name("datepick_out"));
//	@FindBy(name="datepick_out")
//	private WebElement date2;
		
	//WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
		
	//WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
		
	//WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	public WebElement getArea() {
		return area;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

//	public WebElement getDate1() {
//		return date1;
//	}
//
//	public WebElement getDate2() {
//		return date2;
//	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	

}
