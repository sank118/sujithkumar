package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	public WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By txtbox_search=By.xpath("//input[@type='search']");
	By btn_increment=By.className("increment");
	By btn_addToCart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	By btn_cartIcon=By.xpath("//a[@class='cart-icon']/img");
	By txt_itemSelected=By.cssSelector("[class='product-info'] [class='product-name']");
	By btn_proceedToCart=By.xpath("//button[contains(text(),'PROCEED')]");
	
	public WebElement getSearch() {
		return driver.findElement(txtbox_search);
	}
	
	
	public WebElement increaseItem()
	{
		return driver.findElement(btn_increment);
	}
	
	public WebElement addToCart() {
		return driver.findElement(btn_addToCart);
	}
	
	public WebElement cartIcon() {
		return driver.findElement(btn_cartIcon);
	}
	
	public void verifyItemSelectedhp(String strArg1) {
		Assert.assertTrue(driver.findElement(txt_itemSelected).getText().contains(strArg1));
	}
	
	public WebElement proceedToCard() {
		return driver.findElement(btn_proceedToCart);
	}
	
}
