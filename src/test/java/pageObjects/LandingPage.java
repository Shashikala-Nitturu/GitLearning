package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search=By.cssSelector("input[type='search']");
	private By homepageProduct =By.cssSelector("div[class='no-results'] h2");
	private By topDeals=By.linkText("Top Deals");
	private By increment =By.cssSelector("a.increment");
	private By addTocart=By.cssSelector(".product-action button");
	
	
	public void searchItem(String name)
	{
		 driver.findElement(search).sendKeys(name);;
	}
	public String getProductName()
	{
		return driver.findElement(homepageProduct).getText();
		
	}
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	}
	
	public void incrementQuantity(int quantity)
	{
		int i= quantity -1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
		
	}
	public void addToCart()
	{
		driver.findElement(addTocart).click();
	}
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
}
