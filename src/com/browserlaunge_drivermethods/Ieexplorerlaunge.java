package com.browserlaunge_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ieexplorerlaunge {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
	driver.get("https://www.google.co.in/");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
