package com.feroja.stepDafination;

import com.feroja.BasePage.Basetest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GreenCardDafination {
    WebDriver driver;
    Basetest basePage;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    @Given("Customar is on the green card page")
    public void customar_is_on_the_green_card_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        basePage = new Basetest(driver);
    }
    @When("Customar will add to card")
    public void customar_will_add_to_card() throws InterruptedException {
        Thread.sleep(1000);
        basePage.add_to_card();

        basePage.firft_click();

    }
    @Then("Customar proceed to checkout")
    public void customar_proceed_to_checkout() throws InterruptedException {
    basePage.checkout_click();
    Thread.sleep(1000);
    }

    @Then("Castomar click place order")
    public void castomar_click_place_order() {
     basePage.orderClick();
    }
    @Then("Customar select the city")
    public void customar_select_the_city() throws InterruptedException {
    basePage.selectClick("Bangladesh");
    Thread.sleep(2000);
    }
    @Then("Customar finally agree and procced")
    public void customar_finally_agree_and_procced() {
    basePage.agreeClick();
    basePage.proceedClick();
    }


}
