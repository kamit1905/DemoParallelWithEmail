package com.app.sunbeam.Driver;

import org.openqa.selenium.WebDriver;

import com.app.sunbeam.Configurations.PropertyReader;

public class Driver {
	static String browser;
	static String url;
	public static void initDriver() {
		//browser= new PropertyReader().getBrowserName();
		//url = new PropertyReader().getUrl();
		browser = System.getProperty("browserName") !=null ? System.getProperty("browserName") : new PropertyReader().getBrowserName();	
		url = System.getProperty("urlName") !=null ? System.getProperty("urlName") : new PropertyReader().getUrl();
		System.out.println("Browser ========= "+browser);
		System.out.println("Url =========="+url);
		WebDriver driver = DriverFactory.getDriver(browser);
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get(url);
	}

}
