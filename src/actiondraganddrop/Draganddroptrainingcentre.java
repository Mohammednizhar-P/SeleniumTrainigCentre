package actiondraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddroptrainingcentre {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	     //WebElement drag = driver.findElement(By.id("box3"));  
		//WebElement drop = driver.findElement(By.id("box103"));
		
	Actions actions = new Actions(driver);
	
	WebElement drag = driver.findElement(By.id("box3"));
	WebElement drop = driver.findElement(By.id("box103"));
	//actions.clickAndHold(drag).moveToElement(drop).release().build().perform();  // shall we use buid or shallnot use build
	actions.dragAndDrop(drag, drop).build().perform();
	
	
























	}














}
