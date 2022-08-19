package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetUp;

public class OffersPageStepDefination {
	
	
	public String OfferProduct;
	TestContextSetUp testContextSetUp;
	
	public OffersPageStepDefination(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
		
	}
	
	@Then("^user searched for (.+) shortname in offers page to check if the product is exists$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_the_product_is_exists(String shorName) {
		LandingPage lp=testContextSetUp.pom.getLandingPage();
		lp.selectTopDealsPage();
		testContextSetUp.genericUtils.switchWindowToChild();
		OffersPage op=testContextSetUp.pom.getOffersPage();
		op.searchItem(shorName);
		//OfferProduct=testContextSetUp.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();// CssSelector of tagname:nth-child(1)
		OfferProduct =op.getProductName();
		System.out.println(OfferProduct);
		//Assert.assertEquals(OfferProduct, testContextSetUp.homepageProduct);
	}
	
	
//	@Given("^user is on \"([^\"]*)\" landing page$")
//    public void user_is_on_something_landing_page(String strArg1) throws Throwable {
//		System.out.println(strArg1);
//        
//    }
//
//    @When("^user searched with shortname \"([^\"]*)\" and extracted the actual name of product$")
//    public void user_searched_with_shortname_something_and_extracted_the_actual_name_of_product(String strArg1) throws Throwable {
//    	System.out.println(strArg1);
//    }
//
//    @Then("^user searched for \"([^\"]*)\" shortname in offers page to check if the product is exists$")
//    public void user_searched_for_something_shortname_in_offers_page_to_check_if_the_product_is_exists(String strArg1) throws Throwable {
//    	System.out.println(strArg1);
//    }


}
