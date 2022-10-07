package com.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static String value;
	public static  WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();	
			
		}
		
		else if (browsername.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new FirefoxDriver();		
		}
		
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL: " +currentUrl);
		
		String title = driver.getTitle();
		System.out.println("TITLE: " +title);
		
	}
	
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
		
//		boolean selected = element.isSelected();
//		System.out.println(selected);
//		
//		boolean displayed = element.isDisplayed();
//		System.out.println(displayed);
//		
//		boolean enabled = element.isEnabled();
//		System.out.println(enabled);
	}
	
	public static void navigateTo(String value) {
		driver.navigate().to(value);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateRefersh() {
		driver.navigate().refresh();
	}
	
	public static void screenShot(String path) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		FileHandler.copy(source, des);
	}
	
	
	
	public static void isSelected(WebElement element) {
		
		boolean selected = element.isSelected();
		System.out.println("Is Selected:"+selected);
	}
	
	public static void isDisplayed(WebElement element) {
		
		boolean displayed = element.isDisplayed();
		System.out.println("IsDisplyed:"+displayed);
	}
	
	public static void isEnabled(WebElement element) {
		
		boolean enabled = element.isEnabled();
		System.out.println("IsEnabled:"+enabled);
	}
	
	public static void isMultiple(WebElement element) {
		
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println("Is Multiple :" +multiple);
	}
	
	
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
						
			List<WebElement> list = s.getOptions();
			for (WebElement opt : list) {
				System.out.println(opt.getText());
				isDisplayed(opt);
			}
			
//			boolean multiple = s.isMultiple();
//			System.out.println("IS_MULTIPLE: " +multiple);
		
		}
		
		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
			
			List<WebElement> list = s.getOptions();
			for (WebElement opt : list) {
				System.out.println(opt.getText());
			}
//			boolean multiple = s.isMultiple();
//			System.out.println("IS_MULTIPLE: " +multiple);
		} 
		
		else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
			
			List<WebElement> list = s.getOptions();
			for (WebElement opt : list) {
				System.out.println(opt.getText());
			}
			
//			boolean multiple = s.isMultiple();
//			System.out.println("IS_MULTIPLE: " +multiple);
		}
		
	}
	
	public static String read_Data(String path, String sheet_name, int row_index, int cell_index) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheet(sheet_name);
		
		Row row = sheetAt.getRow(row_index);
		
		Cell cell = row.getCell(cell_index);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			value = cell.getStringCellValue();
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int data = (int) numericCellValue;
			
			value = String.valueOf(data);
			
		}
		wb.close();
		return value;
		
	}
	
	
	public static void close() {
		driver.close();

	}
	
	
	
	
	

}
