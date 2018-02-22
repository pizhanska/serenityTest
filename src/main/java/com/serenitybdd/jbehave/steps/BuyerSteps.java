package com.serenitybdd.jbehave.steps;

import com.serenitybdd.jbehave.pages.MainPage;
import com.serenitybdd.jbehave.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class BuyerSteps  {
    MainPage mainPage;
    ShoppingCartPage shoppingCartPage;

    @Step
    public void click_on_add_1984_to_shopping_cart(){
       mainPage.clickOnAdd1984ToShoppingCart();
    }


    @Step
    public void click_on_add_da_vinci_to_shopping_cart(){
        mainPage.clickOnAddDaVinciToShoppingCart();
    }

    @Step
    public void click_on_shopping_cart(){
     mainPage.clickOnShoppingCart();
    }

    @Step
    public void main_page_is_opened(){
        mainPage.open();
    }

    @Step
    public List<String> check_items_in_shopping_cart(){
        return shoppingCartPage.getItemName();
    }

    @Step
    public void go_to_the_shopping_cart(){
        mainPage.clickOnShoppingCart();
    }

    @Step
    public void click_on_reduce_by_one_code_da_vinci(){
        shoppingCartPage.clickOnReduceByOne();
    }

    @Step
    public void click_on_add_by_one_1984(){
        shoppingCartPage.clickOnAdd();
    }

    @Step
    public String get_quantity_of_reduced_book(){
        return shoppingCartPage.getQuantityOfReducedBook();
    }

    @Step
    public String get_quantity_of_added_book(){
        return shoppingCartPage.getQuantityOfAddedBook();
    }
}
