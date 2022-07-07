package dev.joshua_coombs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import dev.joshua_coombs.pages.ProductsPage;
import dev.joshua_coombs.runner.AddRemoveRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRemoveSteps {
	public static WebDriver realHumanBeing = AddRemoveRunner.realHumanBeing;
	public static ProductsPage productsPage = AddRemoveRunner.productsPage;
	
	@Given("The user is on the products page")
	public void the_user_is_on_the_products_page() {
	    realHumanBeing.get("https://www.saucedemo.com/inventory.html");
	}

	@When("an Item is added to the cart and then removed with the Remove button")
	public void an_item_is_added_to_the_cart_and_then_removed_with_the_remove_button() {
	    productsPage.backpackAddButton.click();
	    productsPage.backpackRemoveButton.click();
	}

	@Then("the Item is successfully removed and the Add button shows")
	public void the_item_is_successfully_removed_and_the_add_button_shows() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("an Item is added to the cart and then removed with the Reset App State button")
	public void an_item_is_added_to_the_cart_and_then_removed_with_the_reset_app_state_button() {
		 productsPage.backpackAddButton.click();
		 productsPage.resetAppState.click();
	}

	@Then("the Item is successfully removed but the Remove button still shows")
	public void the_item_is_successfully_removed_but_the_remove_button_still_shows() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then removed with the Remove button")
	public void multiple_items_are_added_to_the_cart_and_then_removed_with_the_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Items are successfully removed and the Add button shows")
	public void the_items_are_successfully_removed_and_the_add_button_shows() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then removed with the Reset App State button")
	public void multiple_items_are_added_to_the_cart_and_then_removed_with_the_reset_app_state_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Items are successfully removed but the Remove button still shows")
	public void the_items_are_successfully_removed_but_the_remove_button_still_shows() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then some Items are removed with the Remove button and some Items are removed with the Reset App State button")
	public void multiple_items_are_added_to_the_cart_and_then_some_items_are_removed_with_the_remove_button_and_some_items_are_removed_with_the_reset_app_state_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Items are successfully removed but the Remove button still shows for Items removed with the Reset App State Button")
	public void the_items_are_successfully_removed_but_the_remove_button_still_shows_for_items_removed_with_the_reset_app_state_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("an Item is added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the item is added again")
	public void an_item_is_added_to_the_cart_and_then_removed_with_the_remove_button_and_then_the_reset_app_state_button_is_clicked_and_then_the_item_is_added_again() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Item is succesfully added back to cart")
	public void the_item_is_succesfully_added_back_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("an Item is added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the item is added and removed again with Remove button")
	public void an_item_is_added_to_the_cart_and_then_removed_with_the_remove_button_and_then_the_reset_app_state_button_is_clicked_and_then_the_item_is_added_and_removed_again_with_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Item is succesfully added and removed again")
	public void the_item_is_succesfully_added_and_removed_again() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added again")
	public void multiple_items_are_added_to_the_cart_and_then_removed_with_the_remove_button_and_then_the_reset_app_state_button_is_clicked_and_then_the_items_are_added_again() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Items are succesfully added back to cart")
	public void the_items_are_succesfully_added_back_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added and removed again with Remove button")
	public void multiple_items_are_added_to_the_cart_and_then_removed_with_the_remove_button_and_then_the_reset_app_state_button_is_clicked_and_then_the_items_are_added_and_removed_again_with_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Items are succesfully added and removed")
	public void the_items_are_succesfully_added_and_removed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added and removed again with Reset App State button")
	public void multiple_items_are_added_to_the_cart_and_then_removed_with_the_remove_button_and_then_the_reset_app_state_button_is_clicked_and_then_the_items_are_added_and_removed_again_with_reset_app_state_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Items are added and removed from cart but Remove buttons still show")
	public void the_items_are_added_and_removed_from_cart_but_remove_buttons_still_show() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added and removed again with Reset App State button and then added and removed with the Remove button")
	public void multiple_items_are_added_to_the_cart_and_then_removed_with_the_remove_button_and_then_the_reset_app_state_button_is_clicked_and_then_the_items_are_added_and_removed_again_with_reset_app_state_button_and_then_added_and_removed_with_the_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("an Item is added to cart and then removed with the Remove button, then added and removed again with the Remove button")
	public void an_item_is_added_to_cart_and_then_removed_with_the_remove_button_then_added_and_removed_again_with_the_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Item is succesfully added and removed both times")
	public void the_item_is_succesfully_added_and_removed_both_times() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
