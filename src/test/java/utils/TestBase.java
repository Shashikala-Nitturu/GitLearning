package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
	public Properties prop;

	public WebDriver webDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_properties=prop.getProperty("browser");
		String brower_maven=System.getProperty("browser");
		//result=testCondition?value1:value2
		String browserName=brower_maven!=null?brower_maven:browser_properties;
		

		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\msedgedriver.exe");
				driver = new EdgeDriver();

			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);

		}
		return driver;
	}

}
