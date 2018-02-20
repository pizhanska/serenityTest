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
}
