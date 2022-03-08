package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDEmo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("<============hole data===========>");


		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

		for (WebElement tabdata : tabledata) {

			System.out.println(tabdata.getText());	

		}

		System.out.println("=======particular row =====>");


		List<WebElement> parrow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]"));
		for (WebElement singlerow : parrow) {

			System.out.println(singlerow.getText());

		}

		System.out.println("|=========particular row data=============|");
		List<WebElement> parrowdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));

		for (WebElement parrowdatas : parrowdata) {
			System.out.println(parrowdatas.getText());

		}

		System.out.println("|==============particular coloumn data===========|");

		List<WebElement>parcloloumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));

		for (WebElement parcloloundata : parcloloumn) {

			System.out.println(parcloloundata.getText());

		}

		System.out.println("|==============particular data=================|");

		WebElement pardata = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		System.out.println(pardata.getText());

		System.out.println("==============coloumsize and colounhead================");

		List<WebElement> cloumnsize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println(cloumnsize.size());
		for (WebElement size : cloumnsize) {

			System.out.println(size.getText());

		}

		System.out.println("=====================rowsize and datas======================== ");


		List<WebElement> rowsizeanddata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		System.out.println(rowsizeanddata.size());

		for (WebElement data : rowsizeanddata) {

			String text = data.getText();

			System.out.println(text);

		}


		driver.quit();





	}








}





