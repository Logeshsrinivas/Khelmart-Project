package com.Khelmart.Logesh;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartLocators {
	@FindBy(xpath="//input[@id='search']") public WebElement searchbar;
	@FindBy(xpath ="//*[@id='product-list-container']/div/div[2]/ol/li[1]/div/div[2]/div/div[2]/div/div/div[1]/form/button/span")
	public WebElement productAddToCart;
	@FindBy(xpath ="//a[@title='View and Edit Cart']")
	public WebElement viewCart;
	public String cartList="//div[@class='product-item-details']/strong/a";
	public String cartRemove ="//a[@class='action action-delete']";
	@FindBy(xpath ="//*[@id=\"cart-totals\"]/div/table/tbody/tr[3]/td/strong/span")
	public WebElement totalPrice;
	
}
