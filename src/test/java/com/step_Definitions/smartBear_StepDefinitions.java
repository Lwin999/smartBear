package com.step_Definitions;

import com.SmartBearPage.SmartBearPage;
import com.utility.BrowserUtils;
import com.utility.ConfigurationReader;
import com.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class smartBear_StepDefinitions {
    SmartBearPage smartBearPage = new SmartBearPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);


        smartBearPage.username.sendKeys("Tester");
        smartBearPage.password.sendKeys("test");
        smartBearPage.loginButton.click();

        smartBearPage.order.click();
    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {

        Select select = new Select(smartBearPage.product);
        select.selectByValue("FamilyAlbum");

    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantity.sendKeys(string);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.CustomerName.sendKeys(string);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.street.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.city.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.state.sendKeys(string);
    }
    @When("User enters {string}")
    public void user_enters(String string) {
        smartBearPage.zipcode.sendKeys(string);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartBearPage.visa.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumber.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expiryDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        BrowserUtils.sleep(1);
        smartBearPage.allOrdersList.click();
        String expectName = "John Wick";
        String actualName = smartBearPage.johnWick.getText();
        Assert.assertEquals("John Wick is the list",actualName,expectName);
    }

}
