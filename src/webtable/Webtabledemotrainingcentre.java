package webtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemotrainingcentre {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("============================================================================================");

		List<WebElement> holeheadanddata = driver.findElements(By.id("customers"));
		for (WebElement webElement : holeheadanddata) {      // holehead and data

			System.out.println(webElement.getText());

		}
		System.out.println("============================================================================================");
		
		List<WebElement> holerowsize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int size = holerowsize.size();
		System.out.println(size);
		for (WebElement holeroeheadanddata : holerowsize) {    // table row size, and hole row head and data

			System.out.println(holeroeheadanddata.getText());

		}
		
		System.out.println("================================================================================================");
		
		List<WebElement> tablehead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		for (WebElement tableheadtext : tablehead) {      // table head text

			System.out.println(tableheadtext.getText());

		}
		
		System.out.println("===================================================================================");
		WebElement parhead = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]"));
		System.out.println(parhead.getText());         //par head text
		
		System.out.println("===============================================================================================");
		
		List<WebElement> parrow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]"));
		for (WebElement parrowdata : parrow) {              
			System.out.println(parrowdata.getText()); // particular table row
		}
		System.out.println("=============================================================================================");
		
		WebElement parrowdata = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[1]"));

		System.out.println(parrowdata.getText());
		// particular row particular data

		System.out.println("========================================================================================================");
		
		List<WebElement> secondcoloumndata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));

		for (WebElement seconddata : secondcoloumndata) {
			System.out.println(seconddata.getText());     // second coloum all datas

		}  


         driver.quit();






	}















}
