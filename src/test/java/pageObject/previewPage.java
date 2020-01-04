package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class previewPage {
public WebDriver driver;
	
	public previewPage(WebDriver driver) {
		this.driver=driver;
	}
		
	By itemSelected=By.xpath("//p[@class='product-name']");
	By btn_placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	By chkbx_agree=By.className("chkAgree");
	By btn_proceed=By.xpath("//button[contains(text(),'Proceed')]");
		
		
	public void verifyItemSelectedpp(String itemPicked) {
			Assert.assertTrue(driver.findElement(itemSelected).getText().contains(itemPicked));
		}
	public WebElement placeOrder() {
		return driver.findElement(btn_placeOrder);
	}
	
	public WebElement agreeTerms() {
		return driver.findElement(chkbx_agree);
	}
	
	public WebElement proceed() {
		return driver.findElement(btn_proceed);
	}
		
}
