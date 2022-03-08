package com.windows_handling_trainingcentre;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling_Demo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.amazon.in/");


		Actions action = new Actions(driver);
		WebElement findElement = driver.findElement(By.linkText("Best Sellers"));
		action.contextClick(findElement).build().perform();

		Robot key = new Robot();

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);



		WebElement findElement2 = driver.findElement(By.linkText("Mobiles"));
		action.contextClick(findElement2).perform();


		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);


		Thread.sleep(3000);

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		int size = windowHandles.size();
		System.out.println(size);


		for (String string : windowHandles) {
			String title2 = driver.switchTo().window(string).getTitle();
			System.out.println(title2);
		}
		Thread.sleep(4000);

		String w ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in\r\n";  
				

		for (String string : windowHandles) {

			if (driver.switchTo().window(string) .getTitle().equals(w)) {
				Thread.sleep(3000);
				break;   // it is break when w comes
			}
		//	break; // it breaks into online (first iteration) shopping because for iterate aki varappa first wiindow oda break panna sollitom
		} 
		Thread.sleep(3000);


		List<String> li = new ArrayList<>(windowHandles); 
		String title2 = driver.switchTo().window(li.get(2)).getTitle();
		System.out.println(title2);

		driver.close();

		Set<String> windowHandles2 = driver.getWindowHandles();
		int size2 = windowHandles2.size();
		System.out.println(size2);

		Thread.sleep(4000);

		driver.quit();




	}
}







