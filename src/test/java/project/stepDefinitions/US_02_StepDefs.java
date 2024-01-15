package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import project.pages.US_02PageSearch;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import project.utilities.ReusableMethods;
import project.utilities.WaitUtils;

public class US_02_StepDefs {

    US_02PageSearch page = new US_02PageSearch();


    @Given("user goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("user input {string} on where to field")
    public void user_input_on_where_to_field(String string) {
        ReusableMethods.waitFor(2);
        page.InputBanf.sendKeys("Banf");
        WaitUtils.waitFor(1);

    }

    @And("user clicks CheckIn button")
    public void userClicksCheckInButton() {
        ReusableMethods.waitFor(2);
        page.inputCheckIn.click();
        WaitUtils.waitFor(1);

    }

    @And("user selects check in data")
    public void userSelectsCheckInData() {
        ReusableMethods.waitFor(2);
        page.InpurData.click();
        WaitUtils.waitFor(1);

    }


    @And("user clicks apply button for guest")
    public void userClicksApplyButtonForGuest() {
        ReusableMethods.waitFor(2);
        page.clickApply.click();

    }

    @And("user clicks on Search button")
    public void userClicksOnSearchButton() {
        ReusableMethods.waitFor(2);
        page.SearchButton.click();
    }

    @And("user preses close button to be able to close the guest windows")
    public void userPresesCloseButtonToBeAbleToCloseTheGuestWindows() {
        ReusableMethods.waitFor(2);
        page.clickX.click();

    }

    @Then("verify the  hotels appear on the window")
    public void verifyTheHotelsAppearOnTheWindow() {
     ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenshotAllScreen();
        Assert.assertTrue(US_02PageSearch.Hotels.isDisplayed());
        WaitUtils.waitFor(1);

    }
}




