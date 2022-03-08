package com.base;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		getBrowsers("chrome");

	getUrl("http://www.leafground.com/");

		scrollAtHeight();
		Thread.sleep(4000);
		naviNextUrl("http://www.leafground.com/pages/Edit.html");
		back();
		forward();
		refresh();

		String pageSource = getPageSource();
		System.out.println(pageSource);

		String title = getTitle();
		System.out.println(title);

		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);

		back();

		WebElement isEnabled = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]"));
		System.out.println(isEnabled(isEnabled));

		WebElement isDisplayed = driver.findElement(By.xpath("//h1[@class='wp-heading']"));
		System.out.println(isDisplayed(isDisplayed));

		WebElement click = driver.findElement(By.linkText("Checkbox"));
		click(click);

		WebElement isSelected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		System.out.println(isSelected(isSelected));

		WebElement isselected = driver.findElement(By.xpath("//div[.='Not Selected']"));
		System.out.println(isSelected(isselected));

		back();

		WebElement findElement = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]"));
		click(findElement);

		WebElement findElement2 = driver.findElement(By.id("email"));
		sendKeys(findElement2, "dfghjk");
		Thread.sleep(3000);
		clear(findElement2);
		WebElement findElement3 = driver.findElement(By.xpath("(//label[@for='email'])[1]"));
		String text = getText(findElement3);
		System.out.println(text);
		System.out.println(getSize(findElement3));
		System.out.println(getTageName(findElement3));
		System.out.println(getAttribute(findElement3,"for"));

		screenShot("C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\screensnap\\full.png");
		WebElement element = driver.findElement(By.id("email"));
		elementScreenShot(element,"C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\Selenium_training_centre\\\\screensnap\\\\f.png");

		back();
		WebElement click1 = driver.findElement(By.linkText("Drop down"));
		click(click1);
		WebElement select = driver.findElement(By.id("dropdown1"));
		select( select, "byindex","1");
		select(select, "byvalue", "3");
		select(select, "byvisibletext","Loadrunner");

		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		select(multiselect,"byindex","1");
		select(multiselect,"byindex","3");
		select(multiselect,"byindex","2");
		Thread.sleep(3000);


		back();
		WebElement simpleAlert= driver.findElement(By.linkText("Alert"));
		click(simpleAlert);
		WebElement alertClick = driver.findElement(By.xpath("//button[.='Alert Box']"));
		click(alertClick);
		simpleAlert();
		WebElement confirmAlert = driver.findElement(By.xpath("//button[.='Confirm Box']"));
		click(confirmAlert);
		Thread.sleep(3000);
		confirmAlert("","cancel");
		Thread.sleep(4000);
		WebElement promptAlert = driver.findElement(By.xpath("//button[.='Prompt Box']"));
		click(promptAlert);
		Thread.sleep(3000);
		promptAlert("hi! buddy this is mohammednizhar","ok","");
		Thread.sleep(3000);
		WebElement  getText = driver.findElement(By.id("result1"));
		System.out.println(getText(getText));
		back();
		WebElement moveToElement = driver.findElement(By.linkText("Radio Button"));
		Thread.sleep(3000);
		moveToElement(moveToElement);
		Thread.sleep(3000);
		actionClick();
		back();
		WebElement conextClick = driver.findElement(By.linkText("Button"));
		contextClick(conextClick);
		Thread.sleep(3000);
		WebElement dragClick = driver.findElement(By.linkText("Droppable"));
		click(dragClick);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		dragAndDrop(from,to);
		Thread.sleep(3000);
		back();

		WebElement frameclick = driver.findElement(By.linkText("Frame"));
		click(frameclick);
		frame("intindex", "0", element);
		WebElement findElement4 = driver.findElement(By.id("Click"));
		click(findElement4);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		frame("intindex","1", element);
		frame("stringnameorid","frame2", element);
		WebElement findElement5 = driver.findElement(By.id("Click1"));
		click(findElement5);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		back();
		Thread.sleep(3000);

		getUrl("https://www.amazon.in/");
		WebElement pageDown = driver.findElement(By.linkText("Amazon Science"));
		scroll(pageDown);
		Thread.sleep(3000);

		Thread.sleep(3000);
		WebElement pageUp= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		scroll(pageUp);
		Thread.sleep(5000);


		WebElement findElement6 = driver.findElement(By.linkText("Best Sellers"));

		contextClick(findElement6);
		robotClass();
		windowHandles();
       
		getUrl("https://www.amazon.in/");
		
 
		WebElement findElement7 = findElement("stringlinktext", "Best Sellers");
		Thread.sleep(4000);

		click(findElement7);
		Thread.sleep(3000);
		quit();



















	}

}








