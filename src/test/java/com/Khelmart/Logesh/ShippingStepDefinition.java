package com.Khelmart.Logesh;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ShippingStepDefinition {

	ShippingAction shipact = new ShippingAction();
	searchdata data= new searchdata();
	
	@Given("User Search the product with keyword.")
	public void user_search_the_product_with_keyword() {
		HelperClass.log.getClass();
		HelperClass.OpenPage(data.url);
		HelperClass.log.error("HomePAge Launches");
	    shipact.searchProduct(data.search);
	    HelperClass.log.info("User search data");
	}

	@When("User clicks the selected product")
	public void user_clicks_the_selected_product() {
		shipact.clickProduct();
		HelperClass.log.info("User clicks the product");
	}

	@When("User selects the size of Product")
	public void user_selects_the_size_of_product() {
		shipact.selectSize();
		HelperClass.log.info("USer selects the product size");
	}

	@When("User clicks Shipping cost")
	public void user_clicks_shipping_cost() {
		shipact.clickShippingCost();
		
	}

	@When("User Enters region")
	public void user_enters_region() {
		shipact.setRegion();
		HelperClass.log.info("USer selects the region");
	}

	@When("User Enter Zip code")
	public void user_enter_zip_code() {
		shipact.setZip(data.zip);
		HelperClass.log.info("USer gives zip code");
	}

	@When("User Clicks Calculate")
	public void user_clicks_calculate() {
		shipact.clickCalculate();
		HelperClass.log.info("USer calculates Shipping cost");
	}

	@Then("User able to see Shipping Cost")
	public void user_able_to_see_shipping_cost() {
		Assert.assertTrue(shipact.getVerifyText().contains("Free Shipping"));
	}



}
