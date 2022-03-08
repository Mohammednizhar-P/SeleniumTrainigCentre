package select_draopdown;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown_trainingcentre {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html") ;


		WebElement  singledropdown = driver.findElement(By.id("dropdown1"));

		Select select = new Select( singledropdown );

		select.selectByIndex(4);
		select.selectByValue("1");                     // this is single dropdown 
		select.selectByVisibleText("Appium");


		// multi select

		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));

		Select multiselect = new Select(findElement);

		boolean multiple = multiselect.isMultiple();

		System.out.println(multiple);

		List<WebElement> options = multiselect.getOptions();  // getoption andd stored in list

		int size = options.size();

		System. out.println(size);    // size

		for (WebElement webElement : options) {

			System.out.println(webElement.getText());

		}

		for (int i = 0; i < size; i++) {

			if (i==1 || i==3 || i==4) {
				multiselect.selectByIndex(i);


			}
		}	

		List<WebElement> allSelectedOptions = multiselect.getAllSelectedOptions();

		for (WebElement webElement : allSelectedOptions) {

			System.out.println(webElement.getText());
		}

		WebElement firstSelectedOption = multiselect.getFirstSelectedOption();

		System.out.println(firstSelectedOption.getText());

		driver.quit();




















	}





















}
