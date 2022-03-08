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

public class windowshandlingpraveen {

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


		WebElement window = driver.findElement(By.linkText("Today's Deals"));

		rightclick.contextClick(window).perform();


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

		List<String> al = new ArrayList<String>(windowHandles);

		System.out.println(driver.getTitle());

		driver.switchTo().window(al.get(2));
		String title = driver.getTitle();
		System.out.println(title);

		driver.switchTo().window(al.get(3)).close();

		Set<String> windowHandles2 = driver.getWindowHandles();

		List<String> al1 = new ArrayList<>(windowHandles2);

		driver.switchTo().window(al1.get(2));

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);


		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("Mobilles");


		driver.close();

		Set<String> windowHandles3 = driver.getWindowHandles();

		System.out.println(	windowHandles3.size());

		for (String string : windowHandles3) {

			if (string.equals(windowHandle)) {

				continue;
			}
			else {
				driver.switchTo().window(string).close();
			}



		}


		//driver.quit();




	}





}
