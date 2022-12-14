package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search=By.id("search-field");
	private By offersPageProduct =By.cssSelector("tr td:nth-child(1)");
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	public String getProductName()
	{
		return driver.findElement(offersPageProduct).getText();
		
	}

}
