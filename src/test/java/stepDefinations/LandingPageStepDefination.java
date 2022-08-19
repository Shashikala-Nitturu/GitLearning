package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;


public class LandingPageStepDefination {
	
	public String homepageProduct;
	public LandingPage lp;
	TestContextSetUp testContextSetUp;
	public LandingPageStepDefination(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
		this.lp=testContextSetUp.pom.getLandingPage();
		
	}
	
	
	@Given("User is on GreenKart landing Page")
	public void user_is_on_green_kart_landing_page() {
	    lp.getTitleLandingPage();
	}
	@When("^user searched with shortname (.+) and extracted the actual name of product$")
	public void user_searched_with_shortname_and_extracted_the_actual_name_of_product(String shortName) {
		//testContextSetUp.driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shorName);
		//LandingPage lp=new LandingPage(testContextSetUp.driver);
		//PageObjectManager pom=new PageObjectManager(testContextSetUp.driver);
		
		
		lp.searchItem(shortName);
		//testContextSetUp.homepageProduct=testContextSetUp.driver.findElement(By.cssSelector("div[class='no-results'] h2")).getText();
		testContextSetUp.homepageProduct=lp.getProductName();
		System.out.println(homepageProduct);
		
	  
	}
	
	@When("added {string} items to the cart")
	public void added_items_to_the_cart(String quantity) {
		lp.incrementQuantity(Integer.parseInt(quantity));
    	lp.addToCart();
	}

//    @When("added {String} items to the cart")
//    public void added_something_items_to_the_cart(String quantity) throws Throwable {
//    	//converting string value to int 
//    	lp.incrementQuantity(Integer.parseInt(quantity));
//    	lp.addToCart();
//      
//    }
//	@And("^added \"([^\"]*)\" items to the cart $")
//    public void added_something_items_to_the_cart(String quantity) throws Throwable {
//		lp.incrementQuantity(Integer.parseInt(quantity));
//    	lp.addToCart();
//    }
	
	
	



}
