package windows_handling_praveen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandlingme {


	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.manage().window().maximize();


		driver.get("https://www.amazon.in/");

		Actions act = new Actions(driver);

		WebElement moveelement = driver.findElement(By.linkText("Best Sellers"));

		act.moveToElement(moveelement).perform();

		act.contextClick(moveelement).perform();


		Robot key = new Robot();


		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);


		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);




		WebElement window2 = driver.findElement(By.linkText("Mobiles"));
		act.contextClick(window2).perform();

		Thread.sleep(3000);

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);


		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);


		String windowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		System.out.println(windowHandles.size());

		List<String> li =  new ArrayList<String>(windowHandles);
		
		
		for (String string : li) {

			driver.switchTo().window(string);
			String title = driver.getTitle();
			System.out.println(title);

		}

		//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in 0
		//Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in 1 
		//Amazon.in Bestsellers: The most popular items on Amazon 2


		driver.switchTo().window(li.get(1));

		WebElement findElement = driver.findElement(By.xpath("//span[.='Tech news, expert reviews & more']"));
		findElement.click();

		driver.close();	

		Set<String> windowHandles2 = driver.getWindowHandles();		

		int size = windowHandles2.size();

		System.out.println(size);

		List<String> li1 = new ArrayList<>(windowHandles2);
		
		
		for (String string : li1) {
			
			System.out.println(driver.switchTo().window(string).getTitle());
			
			
		}

		driver.switchTo().window(li1.get(1));

		WebElement findElement2 = driver.findElement(By.xpath("(//div[contains(.,'Leather ')])[22]"));
		findElement2.click();

		for (String string : li1) {

			if (!string.equals(windowHandle)) {

				driver.switchTo().window(string);
				driver.close();

			}


		}


		Set<String> windowHandles3 = driver.getWindowHandles();

		int size2 = windowHandles3.size();
		System.out.println(size2);





		driver.quit();












	}



















}
