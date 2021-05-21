package com.tricentis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private WebDriver driver;
	static String s;
	private By books = By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]");
	//private By computers= By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]");
	private By element= By.linkText("Computing and Internet");
	//private By element2=By.linkText("Fiction");
	private By addto =By.xpath("//input[@id='add-to-cart-button-13']");
	//private By msg =By.xpath("//div[@id='bar-notification']");
	
public CartPage(WebDriver driver)
{
	this.driver=driver;
}
public void selectItem()
{
	driver.findElement(books).click();
	driver.findElement(element).click();
	 
	 
}
public void addtocart()
{
	driver.findElement(addto).click();
	//s=driver.findElement(msg).getText();
	 s=driver.findElement(By.cssSelector("#bar-notification")).getText();
	
}
public String getMessage()

{
	System.out.println(s);
	return s;
}

}
