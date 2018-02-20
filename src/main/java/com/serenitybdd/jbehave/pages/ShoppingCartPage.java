package com.serenitybdd.jbehave.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage extends PageObject {
    @FindBy (xpath = "//ul[@class='list-group']/li")
    private List<WebElementFacade> itemsInCart;

    public List<String> getItemsInCart() {
        List<String> items = new ArrayList<String>();
        for (WebElementFacade item : itemsInCart) {
            items.add(item.findElement(By.xpath("/strong")).getText());
        }
        return items;
    }
}
