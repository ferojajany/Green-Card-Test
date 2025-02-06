package com.feroja.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Basetest {
    WebDriver driver;

    public Basetest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//button[text()='ADD TO CART'])[5]")
    WebElement add1Locator;
   @FindBy(xpath = "(//button[text()='ADD TO CART'])[30]")
    WebElement add2Locator;
   @FindBy(xpath = "//img[@alt='Cart']")
    WebElement FirstClick;
   @FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
    WebElement checkoutLocator;
    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement orderLocator;
    @FindBy(xpath = "//select[@style='width: 200px;']")
    WebElement selectLocator;
   @FindBy(xpath = "//input[@type='checkbox']")
    WebElement agreeLocator;
   @FindBy(xpath = "//button[text()='Proceed']")
    WebElement proceedLocator;

   public void add_to_card(){
    add1Locator.click();
    add2Locator.click();

   }
public void firft_click(){
       FirstClick.click();
}
public void checkout_click(){
       checkoutLocator.click();
}
public void orderClick(){
       orderLocator.click();
}
public void selectClick(String input){
   Select select = new Select(selectLocator);
   select.selectByVisibleText(input);
}
public void agreeClick(){
       agreeLocator.click();
}
public void proceedClick(){
       proceedLocator.click();
}


}
