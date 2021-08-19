package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String expectedTitel = "Dashboard";
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedTitel,Driver.get().getTitle());
    }
    @When("the user enters the SalesManager information")
    public void the_user_enters_the_SalesManager_information() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsSalesMnager();
    }
    @When("the user enters the StoreManager information")
    public void the_user_enters_the_StoreManager_information() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
    }
    @When("the user enter as a asd")
    public void the_user_enter_as_a_asd() {
        System.out.println("Enter as asd");
    }
    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String string, String string2) {

        LoginPage loginPage =new LoginPage();
        loginPage.login(string,string2);
    }
    @Then("the title contains {string}")
    public void the_title_contains(String string) {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(Driver.get().getTitle().contains(string));

    }
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {
        String type=string.toLowerCase();
        LoginPage loginPage = new LoginPage();

        switch  (type){

            case "driver":
                loginPage.loginAsDriver();
                break;
            case "storemanager":
                loginPage.loginAsStoreManager();
                break;
            case "salesmanager":
                loginPage.loginAsSalesMnager();
                break;
            default:

        }
    }
}
