package com.serenitybdd.jbehave;

import com.serenitybdd.jbehave.steps.BuyerSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class ShoppingCartStepDefinitions {
    @Steps
    BuyerSteps buyer;

    @Given("I have opened home page")
    public void openHomePage(){
        buyer.main_page_is_opened();
    }

    @When("I click on Add to Shopping Cart for '1984' book")
    public void clickOnSignInButton(){
        buyer.click_on_add_1984_to_shopping_cart();
    }
    @When("I click on Add to Shopping Cart butoon for 'The Code Da Vinci' book")
    public void clickOnSignInButt(){
        buyer.click_on_add_da_vinci_to_shopping_cart();
    }

    @Then("Chosen items should appear in cart")
    public void shouldSeeLoginForm(){
        buyer.click_on_shopping_cart();
        buyer.check_items_in_shopping_cart();

    }



}
