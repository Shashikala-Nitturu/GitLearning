package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObjects.OffersPage;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void switchWindowToChild()
	{
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> itr=windowHandles.iterator();
		String parentid=itr.next();
		String childId=itr.next();
		driver.switchTo().window(childId);
		//testContextSetUp.driver.findElement(By.id("search-field")).sendKeys(shorName);
		
	}

}
