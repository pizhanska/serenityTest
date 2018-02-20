package com.serenitybdd.jbehave.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:3000/")
public class MainPage extends PageObject{
    @FindBy(className = "dropdown")
    private WebElementFacade userManagement;

    @FindBy(xpath = "//a[@href='/user/signin']")
    private WebElementFacade signIn;

    @FindBy(xpath = "//a[@href='/shopping-cart/']")
    private WebElementFacade shoppingCart;

    @FindBy(xpath = "//h3[text()[contains(.,'Nineteen Eighty-Four')]]/..//a[text()[contains(.,'Add to Shopping Cart')]]")
    private WebElementFacade add1984ToShoppingCart;

    @FindBy(xpath = "//h3[text()[contains(.,'The Da Vinci Code')]]/..//a[text()[contains(.,'Add to Shopping Cart')]]")
    private WebElementFacade addDaVinciToShoppingCart;

    @FindBy(className = "//h1")
    private WebElementFacade formTitle;

    public void clickOnUserManagement(){
        userManagement.click();
    }

    public void clickOnSignIn(){
        signIn.click();
    }

    public String getFormTitle(){
        return formTitle.getText();
    }

    public void clickOnAdd1984ToShoppingCart(){
        add1984ToShoppingCart.click();
    }

    public void clickOnAddDaVinciToShoppingCart(){
        addDaVinciToShoppingCart.click();
    }

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }

}
