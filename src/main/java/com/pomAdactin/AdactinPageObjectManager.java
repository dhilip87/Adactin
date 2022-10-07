package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.LoginPage.LoginPage;
import com.bookHotel.BookHotel;
import com.searchPage.SearchPage;
import com.selectHotel.SelectHotel;

public class AdactinPageObjectManager {

	public static WebDriver driver;

	private LoginPage lp;

	private SearchPage sp;

	private SelectHotel sh;

	private BookHotel bh;

	public AdactinPageObjectManager(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public LoginPage getInstanceLp() {

		lp = new LoginPage(driver);

		return lp;
	}

	public SearchPage getInstanceSp() {

		sp = new SearchPage(driver);

		return sp;
	}

	public SelectHotel getInstanceSh() {

		SelectHotel sh = new SelectHotel(driver);

		return sh;
	}

	public BookHotel getInstanceBh() {

		BookHotel bh = new BookHotel(driver);

		return bh;
	}

}
