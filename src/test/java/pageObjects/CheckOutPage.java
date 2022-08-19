package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

public WebDriver driver;
	
	public CheckOutPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By cartBag=By.cssSelector("img[alt='Cart']");
	private By checkOutButton =By.xpath("//button[contains(text()='PROCEED TO CHECKOUT')]");
	private By promoButton=By.xpath("//button[contains(text()='Apply')]");
	private By placeOrder=By.xpath("//button[contains(text()='Place Order')]");
	private By verfiyItem=By.cssSelector("div[class='empty-cart'] h2");
	
	public void checkOutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}

	public String VerifyItemOnCheckOutPage()
	{
		return driver.findElement(verfiyItem).getText();
	}
	public boolean verifyPromoCode()
	{
		
		return driver.findElement(promoButton).isDisplayed();
	}
	public boolean verifyPlaceOrder()
	{
		
		return driver.findElement(placeOrder).isDisplayed();
	}
}
