package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlingdemo {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");

		String windowHandle = driver.getWindowHandle();  // current window identify

		WebElement findElement = driver.findElement(By.id("home"));
		findElement.click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {

			driver.switchTo().window(string);

		}

		WebElement findElement2 = driver.findElement(By.linkText("Edit"));
		findElement2.click();
		driver.close();

		driver.switchTo().window(windowHandle);

		WebElement findElement3 = driver.findElement(By.xpath("//button[.='Open Multiple Windows']"));
		findElement3.click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2.size());
		Thread.sleep(3000);

		WebElement findElement4 = driver.findElement(By.id("color"));
		findElement4.click();

		Set<String> windowHandles3 = driver.getWindowHandles();
		Thread.sleep(3000);
		for (String string : windowHandles3) {

			if (!string.equals(windowHandle)) {
				driver.switchTo().window(string);      // this is learn automation practice program

				driver.close();
			}

		}

		//Thread.sleep(3000);














	//	driver.quit();














	}









}
