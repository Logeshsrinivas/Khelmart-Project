package com.Khelmart.Logesh;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddToCartDefinition {
AddToCartAction act = new AddToCartAction();
searchdata data= new searchdata();
@When("User search prodcut with keyword")
public void user_search_prodcut_with_keyword() {
	HelperClass.OpenPage(data.url);
	HelperClass.log.info("HomePage Launches");
    act.searchproduct(data.search1);
    HelperClass.log.info("Products search");
}

@When("User select one product and add to cart")
public void user_select_one_product_and_add_to_cart() {
    act.addToCart();
    HelperClass.log.info("Added to caRT");
    act.viewCart();
    HelperClass.log.info("View cart");
    
}

@When("User Sees the list and count of products")
public void user_sees_the_list_and_count_of_products() {
	act.listofProducts();
	HelperClass.log.info("List of product");
    
}

@Then("User remove prodcut from cart based amount")
public void user_remove_prodcut_from_cart_based_amount() {
    act.removefromCart();
    HelperClass.log.info("Remove product based on amount");
}

	}
