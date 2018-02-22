package com.serenitybdd.jbehave.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShoppingCartPage extends PageObject {
    @FindBy (xpath = "//ul[@class='list-group']/li")
    private WebElementFacade itemInCart;

    @FindBy(xpath = "//strong[contains(text(),'The Da Vinci Code')]/../div")
    private Select reduceByOne;

    @FindBy(xpath = "//strong[contains(text(),'Nineteen Eighty-Four')]/../div/ul/li[2]")
    private WebElementFacade addByOne;

    @FindBy(xpath = "//strong[contains(text(),'The Da Vinci Code')]/../span")
    private WebElementFacade quantityOfReducedBook;

    @FindBy(xpath = "//strong[contains(text(),'Nineteen Eighty-Four')]/../span")
    private WebElementFacade quantityOfAddedBook;

   public List<String> getItemName(){
      List<WebElement> items = itemInCart.findElements(By.xpath("/strong"));
      List<String> itemTitle = new ArrayList<String>();
      for(WebElement item : items){
         itemTitle.add(item.getText());
      }
      return  itemTitle;
   }

   public void clickOnReduceByOne() {
       WebElement webElement = getDriver().findElement(By.xpath("//strong[contains(text(),'The Da Vinci Code')]/../div"));
       //webElement.click();
       Actions action = new Actions(getDriver());
       action.moveToElement(webElement).moveToElement(getDriver().findElement(By.xpath("//strong[contains(text(),'The Da Vinci Code')]/../div/ul/li[1]"))).click().build().perform();
   }


    public void clickOnAdd(){
        WebElement webElement = getDriver().findElement(By.xpath("//strong[contains(text(),'Nineteen Eighty-Four')]/../div"));
        //webElement.click();
        Actions action = new Actions(getDriver());
        action.moveToElement(webElement).moveToElement(getDriver().findElement(By.xpath("//strong[contains(text(),'Nineteen Eighty-Four')]/../div/ul/li[2]"))).click().build().perform();

    }

    public String getQuantityOfReducedBook(){
       return quantityOfReducedBook.getText();
    }


    public String getQuantityOfAddedBook(){
        return quantityOfAddedBook.getText();
    }
}
