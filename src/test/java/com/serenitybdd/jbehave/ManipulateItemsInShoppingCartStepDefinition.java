package com.serenitybdd.jbehave;

import com.serenitybdd.jbehave.steps.BuyerSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.assertj.core.api.Assertions.*;

public class ManipulateItemsInShoppingCartStepDefinition {

    @Steps
    BuyerSteps buyerSteps;

    @Given("Given I have opened home page")
    public void openHomePage(){
        buyerSteps.main_page_is_opened();
    }

    @Given("I add three items to shopping cart, two are similar")
    public void addItemsToShoppingCart(){
        buyerSteps.click_on_add_da_vinci_to_shopping_cart();
        buyerSteps.click_on_add_1984_to_shopping_cart();
        buyerSteps.click_on_add_da_vinci_to_shopping_cart();
    }

    @Given("I go to the shopping cart")
    public void goToTheShoppingCart(){
        buyerSteps.go_to_the_shopping_cart();
    }

    @When("I choose in dropdown Action item Reduce by one for The Code Da Vinci book")
    public void reduceByOne(){
        buyerSteps.click_on_reduce_by_one_code_da_vinci();
    }

    @When("I choose in dropdown Action item Add for 1984 book")
    public void addOneMoreItem(){
        buyerSteps.click_on_add_by_one_1984();
    }

    @Then("The Da Vinci Code in shopping cart quantity should be equal $quantity")
    public void reducedBookQuantituShouldBeEqualOne(String quantity){
        assertThat(buyerSteps.get_quantity_of_reduced_book().equals(quantity));
    }

    @Then("1984 quantity in shopping cart should be equal $quantity")
    public void addedBookQuantituShouldBeEqualTwo(String quantity){
        assertThat(buyerSteps.get_quantity_of_added_book().equals(quantity));
    }
}
