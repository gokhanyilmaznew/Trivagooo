package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.pages.HomePage;
import project.pages.SearchPage;
import project.utilities.WaitUtils;

public class US_04_hotel_details {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Then("user selects the Hotel checkbox")
    public void user_selects_the_hotel_checkbox() {
    searchPage.Hotel.click();
        WaitUtils.waitFor(1);

    }
//    @When("user clicks the first hotel picture")
//    public void userClicksTheFirstHotelPicture() {
//        searchPage.firstHotelPhoto.click();
//    }


    @Then("user verify the hotel price is visible")
    public void user_verify_the_hotel_price_is_visible() {
        Assert.assertTrue(searchPage.firstHotelPriceUs4.isDisplayed());
        WaitUtils.waitFor(2);
    }



}
