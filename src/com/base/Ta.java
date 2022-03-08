package com.base;

import org.openqa.selenium.WebElement;

public class Ta extends BaseClass{


	public static void main(String[] args) throws InterruptedException {


		getBrowsers("chrome");


		getUrl("https://echoecho.com/htmlforms11.htm");


		scrollAtHeight();
		Thread.sleep(3000);
		WebElement ele = findElement("stringxpathexpression","//span[.='online tool']");
		scroll(ele);
		Thread.sleep(3000);
		
		WebElement findElement = findElement("stringxpathexpression","(//a[@target='_top'])[7]");
		scroll(findElement);
		Thread.sleep(3000);

			
		WebElement findElement1 = findElement("stringxpathexpression","(//a[@target='_top'])[4]");
		click(findElement1);

		Thread.sleep(4000); 
		
		naviNextUrl( "https://www.flipkart.com/");
		
		
	//	scrollAtHeight();
		Thread.sleep(3000);
		WebElement findElement2 = findElement("stringxpathexpression",  "//div[@class='_3JHi0r']");
		Thread.sleep(3000);
		scroll(findElement2);
		
		
		






















	}








}
