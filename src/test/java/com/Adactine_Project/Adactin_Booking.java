package com.Adactine_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.baseClass.BaseClass;


public class Adactin_Booking extends BaseClass {
	
	
	public static void main(String[] args) throws IOException {
		
		driver=browserLaunch("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		//username.sendKeys("dhilip08");
		inputText(username, "dhilip08");

		WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("12345678");
		inputText(password, "12345678");

		WebElement login = driver.findElement(By.name("login"));
		//login.click();
		clickButton(login);
		
		WebElement area = driver.findElement(By.name("location"));
		//Select location = new Select(area);
		//location.selectByIndex(1);
		dropDown(area, "byindex", "1");
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		//Select place = new Select(hotel);
		//place.selectByIndex(3);
		dropDown(hotel, "byindex", "3");
		
		WebElement room = driver.findElement(By.name("room_type"));
		//Select type = new Select(room);
		//type.selectByIndex(4);
		dropDown(room, "byvisibletext", "Deluxe");
		
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		//Select count = new Select(room_nos);
		//count.selectByIndex(2);
		dropDown(room_nos, "byindex", "2");
		
		WebElement date1 = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		//date1.sendKeys("24/10/2022");
		inputText(date1, "24/10/2022");
		
		WebElement date2 = driver.findElement(By.name("datepick_out"));
		//date2.sendKeys("26/10/2022");
		inputText(date2, "26/10/2022");
		
		WebElement adult = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
		//Select a = new Select(adult);
		//a.selectByIndex(2);
		dropDown(adult, "byvisibletext", "2 - Two");
		
		WebElement child = driver.findElement(By.xpath("//select[@name=\"child_room\"]"));
		//Select c = new Select(child);
		//c.selectByIndex(1);
		dropDown(child, "byindex", "1");
		
		WebElement search = driver.findElement(By.xpath("//input[@name=\"Submit\"]"));
		//search.click();
		clickButton(search);
		
		WebElement s = driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]"));
		//s.click();
		clickButton(s);
		
		WebElement cn = driver.findElement(By.xpath("//input[@name=\"continue\"]"));
		//cn.click();
		clickButton(cn);
		
		WebElement fn = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
		//fn.sendKeys("DHILI_KUMAR");
		inputText(fn, "DHILI_KUMAR");
		
		WebElement ln = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
		//ln.sendKeys("D");
		inputText(ln, "D");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
		//add.sendKeys("NO_9/1_R_E_NAGAR_PORUR_CHENNAI");
		inputText(add, "NO_9/1_R_E_NAGAR_PORUR_CHENNAI");
		
		WebElement ccn = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
		//ccn.sendKeys("1234567890123456");
		inputText(ccn, "1234567890123456");
		
		WebElement cct = driver.findElement(By.xpath("//select[@name=\"cc_type\"]"));
		//Select cct1 = new Select(cct);
		//cct1.selectByIndex(2);
		dropDown(cct, "byindex", "2");
		
		WebElement em = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		//Select exm = new Select(em);
		//exm.selectByValue("11");
		dropDown(em, "byvalue", "11");
		
		WebElement ey = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		//Select exy = new Select(ey);
		//exy.selectByValue("2022");
		dropDown(ey, "byvalue", "2022");
		
		WebElement cvvn = driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
		//cvvn.sendKeys("123");
		inputText(cvvn, "123");
		
		WebElement bk = driver.findElement(By.xpath("//input[@name=\"book_now\"]"));
		//bk.click();
		clickButton(bk);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\PranayaNithika\\eclipse-workspace-Project-June\\Adactine_Project\\Screenshot\\img1.png");
		FileHandler.copy(source, des);
		
		//close();

		
	}
	

}
