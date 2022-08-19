package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
//to share common variables from multiple stepdefinations file and we need to create constructor in the pages
public class TestContextSetUp {
	
	public WebDriver driver;
	public String homepageProduct;
	public PageObjectManager pom;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetUp() throws IOException
	{
		testBase=new TestBase(); 
		pom=new PageObjectManager(testBase.webDriverManager());
		genericUtils=new GenericUtils(testBase.webDriverManager());
	}
}
