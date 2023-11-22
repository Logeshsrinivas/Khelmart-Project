package com.Khelmart.Logesh;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeamSportDefinition {
	searchdata data= new searchdata();
	TeamSportAction act = new TeamSportAction();
	@When("user select cricket bat under Team Sport Category")
	public void user_select_cricket_bat_under_team_sport_category() {
		HelperClass.log.getClass();
		HelperClass.OpenPage(data.url);
	 act.clickTeamSport();
	 HelperClass.log.info("USer clicks Team sport");
	 act.clickCricketBat();
	 HelperClass.log.info("USer clicks cricket Bat");
	}

	@When("User filter porduct ny shopping options")
	public void user_filter_porduct_ny_shopping_options() {
	   act.clickPriceOption();
	   HelperClass.log.info("USer CLick price option");
	   act.clickPriceSelect();
	   HelperClass.log.info("USer selects price");
	}

	@When("User Sort prodcut by desending order")
	public void user_sort_prodcut_by_desending_order() {
	   act.clickDesending();
	   HelperClass.log.info("USer clicks desending button");
	}

	@Then("User print the list of product and check product count")
	public void user_print_the_list_of_product_and_check_product_count() {
	    act.getList();
	    HelperClass.log.info("USer wites a products details in a FIle");
	}
}
