package scrollupand_scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupanDowntraining {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		JavascriptExecutor execute =(JavascriptExecutor) driver;

		//		execute.executeScript("window.scroll(0,2345)", "");
		//		Thread.sleep(3000);
		//		execute.executeScript("window.scroll(0,0)","");

		//		execute.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		//		Thread.sleep(3000);
		//		execute.executeScript("window.scrollTo(0,0)");
		//

		WebElement findElement = driver.findElement(By.xpath("(//span[@class='a-color-base'])[2]"));
		execute.executeScript("arguments[0].scrollIntoView();", findElement);

		WebElement findElement2 = driver.findElement(By.id("twotabsearchtextbox"));
		
		execute.executeScript("arguments[0].setAttribute('value','samsung')", findElement2);  // send value  using java script executer
		// instead of sendkey mouse action
		
		
		WebElement findElement3 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		execute.executeScript("arguments[0].click()",findElement3);   // click using javascript executer mouse action

		Thread.sleep(3000);

		Thread.sleep(5000);












	}



}
