package com.serenitybdd.jbehave.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage extends PageObject {
    @FindBy (xpath = "//ul[@class='list-group']/li")
    private WebElementFacade itemInCart;


   public List<String> getItemName(){
      List<WebElement> items = itemInCart.findElements(By.xpath("/strong"));
      List<String> itemTitle = new ArrayList<String>();
      for(WebElement item : items){
         itemTitle.add(item.getText());
      }
      return  itemTitle;
   }
}
