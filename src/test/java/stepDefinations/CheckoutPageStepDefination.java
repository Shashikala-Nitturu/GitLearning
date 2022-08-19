package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;


public class CheckoutPageStepDefination {
	
	public String homepageProduct;
	TestContextSetUp testContextSetUp;
	CheckOutPage checkOutPage;
	public CheckoutPageStepDefination(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
		
	}
	
	@Then("^user proceed to checkout and validated the (.+) items in checkout page$")
    public void user_proceed_to_checkout_and_validated_the_items_in_checkout_page(String name) throws Throwable {
		
		checkOutPage=testContextSetUp.pom.getCheckOutPage();
		checkOutPage.checkOutItems();
		Assert.assertEquals(checkOutPage.VerifyItemOnCheckOutPage(), name);
		
		
    }

    @And("^verify whether user has access to enter the promocode and place order$")
    public void verify_whether_user_has_access_to_enter_the_promocode_and_place_order() throws Throwable {
    	
    	Assert.assertTrue(checkOutPage.verifyPromoCode());
    	Assert.assertTrue(checkOutPage.verifyPlaceOrder());
    	
    }
    
	
	
	



}
