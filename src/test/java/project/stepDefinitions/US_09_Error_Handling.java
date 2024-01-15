package project.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import project.pages.BookingPage;
import project.pages.HomePage;
import project.pages.SearchPage;
import project.utilities.ActionUtils;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;

import project.utilities.WaitUtils;



public class US_09_Error_Handling {


    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();


    @Given("User clicks on search query box")
    public void user_clicks_on_search_query_box() throws InterruptedException {
        Thread.sleep(10);
        homePage.searchButton.click();
        ReusableMethods.waitFor(2);
    }
    @When("User enters invalid data")
    public void user_enters_invalid_data() {
        searchPage.destination.clear();
        searchPage.destination.sendKeys("cdncisi8939823" + Keys.ENTER);

        ReusableMethods.waitFor(2);
    }
    @Then("User should see the error message.")
    public void user_should_see_the_error_message() {
        Assert.assertTrue(homePage.noResultsAlert.isDisplayed());
        System.out.println("Error message: " +homePage.noResultsAlert.getText());
        WaitUtils.waitFor(1);
    }

// **************************************************************************/

//
//
//    @Given("User enters destination on the search box")
//    public void user_enters_destination_on_the_search_box() {
//
//        searchPage.destination.clear();
//        ReusableMethods.waitFor(3);
//        searchPage.destination.sendKeys("Hilton Waikoloa Village" + Keys.ENTER);
//        ReusableMethods.waitFor(5);
//        searchPage.checkInClick.click();
//        ReusableMethods.waitFor(5);
//        searchPage.tonightButton.click();
//        ReusableMethods.waitFor(5);
//        searchPage.checkOutClick.click();
//        ReusableMethods.waitFor(5);
//        searchPage.tomorrowNightButton.click();
//        ReusableMethods.waitFor(5);
//        searchPage.guestAndRoomsApply.click();
//        ReusableMethods.waitFor(5);
//
//    }
//    @When("User clicks on Search button")
//    public void user_clicks_on_search_button() {
//        ActionUtils.doubleClick(homePage.searchButton);
//        ReusableMethods.waitFor(5);
//
//        searchPage.clickRandom.click();
//        ReusableMethods.waitFor(6);
//    }
//    @When("User clicks on View Deal button of the Hotel information box")
//    public void user_clicks_on_view_deal_button_of_the_hotel_information_box() {
////        if(bookingPage.hotelHilton.equals("Hilton")){
//            searchPage.viewDealButton.click();
//            ReusableMethods.waitFor(5);
////        }else{
////            System.out.println("It's not Hotel 'Hilton'");
////        }
//    }
//    @When("Website switches to another tab")
//    public void website_switches_to_another_tab() {
////        ReusableMethods.switchToTab("Available Rooms - Hilton Waikoloa Village");
//          ReusableMethods.switchToNewTab();
//    }
//    @When("User selects a room and clicks on Quick Book button")
//    public void user_selects_a_room_and_clicks_on_quick_book_button() {
////        ActionUtils.scrollDownActions();
////        bookingPage.quickBookButton.click();
//        bookingPage.vioViewDeal.click();
//        ReusableMethods.waitFor(10);
//    }
//    @When("User clicks Continue button on the pop-up message box")
//    public void user_clicks_continue_button_on_the_pop_up_message_box() {
////        ActionUtils.scrollDownActions();
//        ReusableMethods.switchToNewTab();
//        ReusableMethods.waitFor(5);
//        JSUtils.scrollIntoViewJS(bookingPage.vioBook);
//        ReusableMethods.waitFor(10);
//        bookingPage.vioBook.click();
//        ReusableMethods.waitFor(5);
//    }
//    @When("User enters invalid card number")
//    public void user_enters_invalid_card_number() {
////        ActionUtils.scrollDownActions();
//        ReusableMethods.switchToNewTab();
//        ReusableMethods.waitFor(5);
////        JSUtils.scrollDownByJS();
////        JSUtils.scrollIntoViewJS(bookingPage.vioCcardNumBox);
//        ActionUtils.scrollDownActions();
//        ReusableMethods.waitFor(5);
////        bookingPage.vioCcardNumBox.click();
////        WaitUtils.waitForClickablility(bookingPage.vioCcardNumBox,5);
////        bookingPage.vioCcardNumBox.sendKeys("2334 3567 85489");
//        bookingPage.vioNextBox.click();
//        bookingPage.vioNextBox.sendKeys("4333", Keys.ENTER);
//        ReusableMethods.waitFor(5);
//
//    }
//    @Then("User should see the error message under card number box")
//    public void user_should_see_the_error_message_under_card_number_box() {
//        ActionUtils.scrollDownActions();
//        ReusableMethods.waitFor(5);
//        Assert.assertTrue(bookingPage.vioErrorMsg.isDisplayed());
//
//    }
}
