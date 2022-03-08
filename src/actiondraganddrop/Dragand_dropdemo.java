package actiondraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragand_dropdemo {
	
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
		
		WebDriver   driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		Actions doit = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		doit.clickAndHold(drag).moveToElement(drop).release().build().perform();// yhis is one method
		
		doit.dragAndDrop(drag, drop).build().perform(); // this is another method
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
