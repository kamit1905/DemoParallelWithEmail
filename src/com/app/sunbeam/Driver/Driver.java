package com.app.sunbeam.Driver;

import org.openqa.selenium.WebDriver;

import com.app.sunbeam.Configurations.PropertyReader;

public class Driver {
	
	public static void initDriver() {
		String browser= new PropertyReader().getBrowserName();
		String url = new PropertyReader().getUrl();
		WebDriver driver = DriverFactory.getDriver(browser);
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get(url);
	}

}
