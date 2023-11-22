package com.Khelmart.Logesh;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamSportLocators {
@FindBy(xpath="/html/body/div[2]/header/div/div/div[2]/div/div/div/div/nav/div/div[1]/ul[1]/li[1]/a/span")
public WebElement TeamSport;
@FindBy(xpath="/html/body/div[2]/header/div/div/div[2]/div/div/div/div/nav/div/div[1]/ul[1]/li[1]/ul/li[2]/div/div/div[1]/div/ul/li[1]/a")
public WebElement cricketBat;
@FindBy(xpath="(//div[@class='filter-options-title'])[2]")
public WebElement price;
@FindBy(xpath="(//div[@class='filter-options-content-inner'])[2]/ol/li[5]/a")
public WebElement priceSelect;
@FindBy(xpath="(//a[@title='Set Descending Direction'])[1]")
public WebElement desending;
public String list = "//li[@class='item product product-item']/div/div[2]/div/strong/a";
}
