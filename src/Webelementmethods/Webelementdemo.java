package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementdemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");

		WebDriver  driver  = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		WebElement sendvalue = driver.findElement(By.id("username"));
		sendvalue.sendKeys("mohammednizhar");   // using send keys

		WebElement sendkeys = driver.findElement(By.id("password"));
		sendkeys.sendKeys("12345");   // using fist the value is send and clear the same value
		sendkeys.clear();


		//WebElement clickfrgtpass = driver.findElement(By.partialLinkText("Forgot "));	
		//clickfrgtpass.click();    // click using web element method click


		WebElement gettext = driver.findElement(By.xpath("//p[contains(.,'Adactin ')]"));

		System.out.println(gettext.getText());  // it is get text
		System.out.println(gettext.getTagName());  // it is tag name 
		System.out.println(gettext.getSize());   // get size
         
		WebElement isdisplayed = driver.findElement(By.linkText("New User Register Here"));
		boolean displayed = isdisplayed.isDisplayed();  // wheather the element is diplayed or not
		System.out.println(displayed);
		
		WebElement isenabled = driver.findElement(By.partialLinkText("Register "));
		boolean enabled = isenabled.isEnabled();  // is enabled or interactable
		System.out.println(enabled);
		
		WebElement click = driver.findElement(By.partialLinkText("Register "));
		click.click();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id='tnc_box']"));
		findElement.click(); //  its selected or not
		boolean selected = findElement.isSelected();
		System.out.println(selected);
		
		WebElement getattribute = driver.findElement(By.id("Submit"));
		System.out.println(getattribute.getSize());  // get size
		String attribute = getattribute.getAttribute("class");
		System.out.println(attribute);   // to get attribute value
		
		
		
		
		
		
		
		
		
		
		
		
		
		



		driver.quit();














	}








}
