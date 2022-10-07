package com.Adactine_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseClass.BaseClass;
import com.pomAdactin.AdactinPageObjectManager;

public class Adactin_Runner extends BaseClass {

	public static WebDriver driver = BaseClass.browserLaunch("chrome");

//	public static LoginPage lp = new LoginPage(driver);
//	public static SearchPage sp = new SearchPage(driver);
//	public static SelectHotel sh = new SelectHotel(driver);
//	public static BookHotel bh = new BookHotel(driver);

	public static AdactinPageObjectManager pom = new AdactinPageObjectManager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

//		driver = browserLaunch("chrome"); Assigned at Line:18

		getUrl("https://adactinhotelapp.com/");

//		navigateTo("https://www.flipkart.com/");
//		navigateBack();
//		Thread.sleep(3000);
//		navigateRefersh();

//		LoginPage lp = new LoginPage(driver);
		
		String username = read_Data("C:\\Users\\PranayaNithika\\Desktop\\Excel-Data.xlsx", "login", 0, 0);

		inputText(pom.getInstanceLp().getUsername(), username);
		
		String password = read_Data("C:\\Users\\PranayaNithika\\Desktop\\Excel-Data.xlsx", "login", 0, 1);

		inputText(pom.getInstanceLp().getPassword(), password);

		clickButton(pom.getInstanceLp().getLogin());

		System.out.println(" ");

		screenShot("C:\\Users\\PranayaNithika\\eclipse-workspace-Project-June\\Adactine_Project\\Screenshot\\1.png");

//		SearchPage sp = new SearchPage(driver);

		dropDown(pom.getInstanceSp().getArea(), "byindex", "1");
		isMultiple(pom.getInstanceSp().getArea());

		System.out.println(" ");

		dropDown(pom.getInstanceSp().getHotel(), "byindex", "3");
		isMultiple(pom.getInstanceSp().getHotel());

		System.out.println(" ");

		dropDown(pom.getInstanceSp().getRoom(), "byvisibletext", "Deluxe");
		isMultiple(pom.getInstanceSp().getRoom());

		System.out.println(" ");

		dropDown(pom.getInstanceSp().getRoom_nos(), "byindex", "2");
		isMultiple(pom.getInstanceSp().getRoom_nos());

		System.out.println(" ");

		WebElement date1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		inputText(date1, "24/10/2022");

		WebElement date2 = driver.findElement(By.name("datepick_out"));
		inputText(date2, "26/10/2022");

		dropDown(pom.getInstanceSp().getAdult(), "byvisibletext", "2 - Two");
		isMultiple(pom.getInstanceSp().getAdult());

		System.out.println(" ");

		dropDown(pom.getInstanceSp().getChild(), "byindex", "1");
		isMultiple(pom.getInstanceSp().getChild());

		System.out.println(" ");

		screenShot("C:\\Users\\PranayaNithika\\eclipse-workspace-Project-June\\Adactine_Project\\Screenshot\\2.png");

		clickButton(pom.getInstanceSp().getSearch());

//		SelectHotel sh = new SelectHotel(driver);

		clickButton(pom.getInstanceSh().getS());
		isSelected(pom.getInstanceSh().getS());

		System.out.println(" ");

		screenShot("C:\\Users\\PranayaNithika\\eclipse-workspace-Project-June\\Adactine_Project\\Screenshot\\3.png");

		clickButton(pom.getInstanceSh().getCn());

//		BookHotel bh = new BookHotel(driver);

		inputText(pom.getInstanceBh().getFn(), "DHILI_KUMAR");

		inputText(pom.getInstanceBh().getLn(), "D");

		inputText(pom.getInstanceBh().getAdd(), "NO_9/1_R_E_NAGAR_PORUR_CHENNAI");

		inputText(pom.getInstanceBh().getCcn(), "1234567890123456");

		dropDown(pom.getInstanceBh().getCct(), "byindex", "2");
		isMultiple(pom.getInstanceBh().getCct());

		System.out.println(" ");

		dropDown(pom.getInstanceBh().getEm(), "byvalue", "11");
		isMultiple(pom.getInstanceBh().getEm());

		System.out.println(" ");

		dropDown(pom.getInstanceBh().getEy(), "byvalue", "2022");
		isMultiple(pom.getInstanceBh().getEy());

		System.out.println(" ");

		inputText(pom.getInstanceBh().getCvvn(), "123");

		clickButton(pom.getInstanceBh().getBk());

		Thread.sleep(6000);

		screenShot("C:\\Users\\PranayaNithika\\eclipse-workspace-Project-June\\Adactine_Project\\Screenshot\\4.png");

		// close();
	}

}
