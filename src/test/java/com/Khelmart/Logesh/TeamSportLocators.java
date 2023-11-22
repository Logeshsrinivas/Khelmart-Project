package com.Khelmart.Logesh;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamSportLocators {
@FindBy(xpath="//*[@id=\"menu-33-655cb511befac\"]/ul[1]/li[2]/a/span")
public WebElement TeamSport;
@FindBy(xpath="//*[@id=\"menu-33-655cb511befac\"]/ul[1]/li[1]/ul/li[2]/div/div/div[1]/div/ul/li[1]/a")
public WebElement cricketBat;
@FindBy(xpath="(//div[@class='filter-options-title'])[2]")
public WebElement price;
@FindBy(xpath="(//div[@class='filter-options-content-inner'])[2]/ol/li[5]/a")
public WebElement priceSelect;
@FindBy(xpath="(//a[@title='Set Descending Direction'])[1]")
public WebElement desending;
public String list = "//li[@class='item product product-item']/div/div[2]/div/strong/a";
}
