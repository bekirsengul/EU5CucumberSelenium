package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class NavigationMenuStepDefs {

    @Then("navigate to fleet menu")
    public void navigate_to_fleet_menu() {
        System.out.println("navigate to fleet menu");
    }

    @Then("click the vehicles menu")
    public void click_the_vehicles_menu() {
        System.out.println("click the vehicles menu");
    }
    @And("navigate to marketing menu")
    public void navigate_to_marketing_menu() {
        System.out.println("navigate to marketing menu");
    }
    @Then("click the campaigns menu")
    public void click_the_campaigns_menu() {
        System.out.println("click the campaigns menu");
    }

    @And("navigate to activities")
    public void navigate_to_activities() {
        System.out.println("navigate to activities menu");
    }

    @Then("click the calender events menu")
    public void click_the_calender_events_menu() {
        System.out.println("click the calender events menu");
    }
    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Verify title is Vehicles");
    }
    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("Verify title is Campaigns");
    }
    @Then("the title should be Calender Events")
    public void the_title_should_be_Calender_Events() {
        System.out.println("Verif title is Calender Events");
    }
    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);

    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        BrowserUtils.waitFor(5);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);


    }
}
