package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovertrainingcentre {



	public static void main(String[] args) {




		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));


		WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Actions action = new Actions(driver);

		WebElement findElement = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

		action.moveToElement(findElement).build().perform();

		action.moveToElement(findElement).perform();

		WebElement findElement2 = driver.findElement(By.xpath("//span[.='Your Orders']"));

		findElement2.click();

		action.doubleClick(findElement2).perform();



		//	WebElement findElement1 = driver.findElement(By.xpath("//span[.='Hello, Sign in']"));

		//action.moveToElement(findElement1).perform();

		//action.doubleClick(findElement1).perform(); 

		//	action.click().perform(); // we also use single click if its mouse hover click is single click









	}	








}
