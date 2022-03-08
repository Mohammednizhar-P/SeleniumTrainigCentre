package com.browserlaunge_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browlaunge_Drivermethos {  
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
