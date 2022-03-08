package com.windows_handling_trainingcentre;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling_Demo1 {

	public static void main(String[] args) throws AWTException, InterruptedException {




		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement click = driver.findElement(By.linkText("Best Sellers"));

		Actions  rightclick = new Actions(driver);
		rightclick.contextClick(click).perform();

		Robot key = new Robot();

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);


		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);


		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

		WebElement nclick = driver.findElement(By.linkText("Mobiles"));
		rightclick.contextClick(nclick).perform();

		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);


		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);


		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);



		String windowHandle = driver.getWindowHandle();

		System.out.println(windowHandle);
		driver.switchTo().window(windowHandle).getTitle();

		Set<String> windowHandles = driver.getWindowHandles();

		int size = windowHandles.size();
		System.out.println(size);

		for (String string : windowHandles) {

			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);

		}
		//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
		//Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in
		//Amazon.in Bestsellers: The most popular items on Amazon

		List<String>  li = new ArrayList<>(windowHandles);

		driver.switchTo().window(li.get(2));

		WebElement findElement = driver.findElement(By.xpath("(//div[contains(.,'Leather')])[22] "));

		findElement.click();

		Thread.sleep(3000);

		driver.close();

		Set<String> windowHandles2 = driver.getWindowHandles();
		int size2 = windowHandles2.size();
		System.out.println(size2);

		for (String string : windowHandles2) {
			if (!string.equals(windowHandle)) {
				driver.switchTo().window(string).close();
			}

		}
		Thread.sleep(3000);	

		Set<String> windowHandles3 = driver.getWindowHandles();
		int size3 = windowHandles3.size();
		System.out.println(size3);

		Thread.sleep(4000);

	}





















}
