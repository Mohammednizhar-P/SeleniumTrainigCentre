package rightclickandrobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rclickandrobottraining_centre {


	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  // it is used to hole program


		driver.manage().window().maximize();


		driver.get("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.linkText("Mobiles"));


		Actions actions = new	Actions(driver);

		actions.contextClick(findElement).perform();

		WebDriverWait stop = new WebDriverWait(driver, 6);  // explicit for the element
		stop.until(ExpectedConditions.visibilityOf(findElement));

		Robot robot = new Robot(); 

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);


		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);


		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);


		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);


		driver.quit();

















	}






}
