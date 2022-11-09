package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartBear_StepDef {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is on home page")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearPage.login.sendKeys("Tester");
        smartBearPage.password.sendKeys("test");
        smartBearPage.loginBtn.click();
    }
    @When("User clicks on order button")
    public void user_clicks_on_order_button() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.orderBtn.click();
    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.productSelect.click();
        smartBearPage.familyAlbum.click();
    }
    @When("User enters number four to quantity")
    public void user_enters_number_four_to_quantity() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.txtQuantity.click();
        smartBearPage.txtQuantity.clear();
        smartBearPage.txtQuantity.sendKeys("4");
    }
    @When("User enters John Wick to costumer name")
    public void user_enters_john_wick_to_costumer_name() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.txtName.sendKeys("John Wick");
    }
    @When("User enters Kinzie Ave to street")
    public void user_enters_kinzie_ave_to_street() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.street.sendKeys("Kinzie Ave");
    }
    @When("User enters Chicago to city")
    public void user_enters_chicago_to_city() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.city.sendKeys("Chicago");
    }
    @When("User enters IL to state")
    public void user_enters_il_to_state() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.state.sendKeys("IL");
    }
    @When("User enters number 60056")
    public void user_enters_number_60056() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.zipCode.sendKeys("60056");
    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.cardType.click();
    }
    @When("User enters 1111222233334444 to card number")
    public void user_enters_1111222233334444_to_card_number() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.cardNum.sendKeys("1111222233334444");
    }
    @When("User enters twelve to expiration date")
    public void user_enters_twelve_to_expiration_date() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.expireDate.sendKeys("12/22");
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.processBtn.click();

    }
    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        smartBearPage.allOrders.click();
        smartBearPage.JohnWick.isDisplayed();


    }

}
