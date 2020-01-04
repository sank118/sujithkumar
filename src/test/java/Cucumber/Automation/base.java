package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	static Properties prop=new Properties();
	
	public static WebDriver getDriver() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
