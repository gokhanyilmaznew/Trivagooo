package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import project.pages.BookingPage;
import project.utilities.*;





public class US_07_Booking {

    BookingPage bookingPage = new BookingPage();



//    @Then("User enters a destination on home page")
//    public void user_enters_a_destination_on_home_page() {
//
//    }


    @When("User enters a destination")
    public void user_enters_a_destination() {
        bookingPage.EnterDestination.click();
        bookingPage.EnterDestination.sendKeys("New York ");
        ReusableMethods.waitFor(3);


    }
    @When("User enters check in date")
    public void user_enters_check_in_date() {

        bookingPage.clickCheckInButton.click();
        bookingPage.clickCheckInTonightButton.click();
        ReusableMethods.waitFor(3);


    }
    @When("User enter check out date")
    public void user_enter_check_out_date() {
        bookingPage.clickCheckOutButton.click();
        bookingPage.clickCheckOutTomorrowNightButton.click();
        ReusableMethods.waitFor(3);

    }
    @When("User clicks on search button")
    public void user_clicks_on_search_button() {

        bookingPage.searchButton.click();
        ReusableMethods.waitFor(2);
        bookingPage.closeCalender.click();
        ReusableMethods.waitFor(6);


    }
    @When("User clicks on first view deal button")
    public void user_clicks_on_first_view_deal_button() {

        bookingPage.clickViewDealButton.click();
        ReusableMethods.waitFor(5);

    }

    @When("User verifies the booking page in another tab")
    public void user_verifies_the_booking_page_in_another_tab() {
        WaitUtils.waitFor(2);
        ReusableMethods.switchToNewTab();

    }

    @And("User clicks on booking button")
    public void userClicksOnBookingButton() {

        WaitUtils.waitFor(2);
        JSUtils.clickElementByJS(bookingPage.quickBookButton);

    }


    @Then("User verify booking information")
    public void userVerifyBookingInformation() {
//        BrowserUtils.verifyElementClickable(bookingPage.hiltonCardNumber);
        Assert.assertTrue(bookingPage.hiltonCardNumber.isDisplayed());
        WaitUtils.waitFor(1);

    }
}
