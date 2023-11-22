package com.Khelmart.Logesh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TeamSportAction {
		TeamSportLocators loc;
		public int size;
		public TeamSportAction() {
			loc = new TeamSportLocators();
			 PageFactory.initElements(HelperClass.getDriver(), loc);
		}
		
		public void clickTeamSport() {
			HelperClass.action.moveToElement(loc.TeamSport).perform();			
		}
		public void clickCricketBat() {
			HelperClass.wait.until(ExpectedConditions.elementToBeClickable(loc.cricketBat));
//			HelperClass.jse.executeScript("arguments[0].click()", loc.cricketBat);	
			HelperClass.action.moveToElement(loc.cricketBat).click().build().perform();			
		}
		public void clickPriceOption() {
			HelperClass.jse.executeScript("arguments[0].click()", loc.price);		
		}
		public void clickPriceSelect() {
			HelperClass.action.moveToElement(loc.priceSelect).click().build().perform();			
		}
		public void clickDesending() {
			HelperClass.action.moveToElement(loc.desending).click().build().perform();			
		}
		public void getList() {
			HelperClass.getDriver().navigate().refresh();
//			HelperClass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.list)));
			
			List<WebElement> element = HelperClass.getDriver().findElements(By.xpath(loc.list));
			List<String> stringsToWrite = new ArrayList<String>();
			size=element.size();
			System.out.println("No.of.Product Displayed : " + size);
			for (WebElement ele : element) {
				stringsToWrite.add("Product Name : "+ele.getText());
			}
			 String filePath = "C:\\Users\\lsrinivasan\\final project\\Logesh\\src\\test\\resource\\output.txt";
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
		            for (String str : stringsToWrite) {
		                writer.write(str);
		                writer.newLine();
		            }
		            System.out.println("Strings have been written to the file successfully.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			    }
			
		}


