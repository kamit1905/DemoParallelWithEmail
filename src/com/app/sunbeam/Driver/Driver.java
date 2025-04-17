package com.app.sunbeam.Driver;

import org.openqa.selenium.WebDriver;

import com.app.sunbeam.Configurations.PropertyReader;

public class Driver {
	String browser;
	String url;
	public static void initDriver() {
		//browser= new PropertyReader().getBrowserName();
		//url = new PropertyReader().getUrl();
		browser !=null? System.getProperty("bname") : new PropertyReader().getBrowserName();
		url !=null ? System.getProperty("url") : new PropertyReader().getUrl();
		WebDriver driver = DriverFactory.getDriver(browser);
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get(url);
	}

}
