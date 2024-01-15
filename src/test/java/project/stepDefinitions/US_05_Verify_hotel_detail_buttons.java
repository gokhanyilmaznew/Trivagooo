package project.stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import project.pages.BookingPage;
import project.pages.HomePage;
import project.pages.SearchPage;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import project.utilities.WaitUtils;

public class US_05_Verify_hotel_detail_buttons {

    HomePage homePage = new HomePage();
    SearchPage searchpage = new SearchPage();


    @Given("Client navigate to {string}")
    public void clientNavigateTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("Client clicks on Destination and adds proper country")
    public void clientClicksOnDestinationAndAddsProperCountry() {
       searchpage.destination.clear();
        WaitUtils.waitFor(1);
        searchpage.destination.sendKeys("Toronto", Keys.ENTER);
        searchpage.checkInClick.click();
        searchpage.checkOutClick.click();
        WaitUtils.waitFor(1);

    }

    @Then("Client clicks on search button")
    public void clientClicksOnSearchButton() {
        homePage.searchButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("Client clicks on Fairmont Hot Springs Resort hotel")
    public void clientClicksOnFairmontHotSpringsResortHotel() {
        searchpage.firstHotelButton.click();
        WaitUtils.waitFor(1);
    }


    @Then("Client clicks on Info button")
    public void clientClicksOnInfoButton() {
        searchpage.citycenterButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("Client clicks on Photos button")
    public void clientClicksOnPhotosButton() {
        searchpage.hotelPhotos2.click();
        WaitUtils.waitFor(1);
    }

    @Then("Client clicks on Reviews button")
    public void clientClicksOnReviewsButton() {
        searchpage.hotelReviews.click();
        WaitUtils.waitFor(1);
    }

    @And("Client clicks on Prices button")
    public void clientClicksOnPricesButton() {
        Assert.assertTrue(searchpage.priceTravel.isDisplayed());
    }

}