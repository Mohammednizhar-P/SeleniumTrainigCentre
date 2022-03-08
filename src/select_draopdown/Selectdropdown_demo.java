package select_draopdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown_demo {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("http://www.leafground.com/pages/Dropdown.html");


		WebElement selectbyindex = driver.findElement(By.id("dropdown1"));

		Select select = new Select(selectbyindex);

		select.selectByIndex(2);
		Thread.sleep(3000);        // SELECT BY INDEX
		select.selectByIndex(3);
		Thread.sleep(4000);

		WebElement selectbytext = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(selectbytext);
		Thread.sleep(3000);
		select1.selectByVisibleText("Loadrunner");  //select by visible text
		Thread.sleep(4000);

		WebElement selectbyvalue = driver.findElement(By.id("dropdown3"));

		Select select2 = new Select(selectbyvalue);
		Thread.sleep(4000);
		select2.selectByValue("1");           // select by value
		Thread.sleep(5000);

		WebElement numberofdropdownoptions = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select select3 = new Select(numberofdropdownoptions);
		List<WebElement> options = select3.getOptions();               // size of the dropdown options
		System.out.println(options.size());

		WebElement sendkeysusing = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		Thread.sleep(4000);
		sendkeysusing.sendKeys("Appium");   // select using sendkeys we cannot create select class object
		Thread.sleep(4000);
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Thread.sleep(4000);
		Select selectmuliti = new Select(multiselect);
		Thread.sleep(4000);
		selectmuliti.selectByIndex(1);
		selectmuliti.selectByIndex(2);   // multi select using index
		selectmuliti.selectByIndex(4);

		
		Thread.sleep(4000);
		driver.quit();	

















	}



















}
