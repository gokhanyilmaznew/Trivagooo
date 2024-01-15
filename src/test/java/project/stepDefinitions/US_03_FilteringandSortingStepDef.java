package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import project.pages.FilteringandSortingPage;
import project.utilities.*;

public class US_03_FilteringandSortingStepDef {

    FilteringandSortingPage filteringandSortingPage = new FilteringandSortingPage();

    @Given("User navigate to {string}")
    public void userNavigateTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("User clicks on Destination home page")
    public void userClicksOnDestinationHomePage() {
       filteringandSortingPage.destinationayca.sendKeys("USA",Keys.ENTER);
        ReusableMethods.waitFor(5);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        filteringandSortingPage.destinationayca.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB);
        ActionUtils.doubleClick(filteringandSortingPage.searchButtonayca);
        ReusableMethods.waitFor(1);

    }

    @And("User clicks on price and choose scroll button and change the price")
    public void userClicksOnPriceAndChooseScrollButtonAndChangeThePrice() {
        filteringandSortingPage.priceayca.click();
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(filteringandSortingPage.sliderBox).moveByOffset(84,0).release().perform();
        ReusableMethods.waitFor(4);
        filteringandSortingPage.priceApplyButtonayca.click();
    }

    @And("User clicks on Filters")
    public void userClicksOnFilters() {
        filteringandSortingPage.filters4ayca.click();
        ReusableMethods.waitFor(2);
    }

    @And("User clicks fivestar and Popular filters and choose Free cancellation box")
    public void userClicksFivestarAndPopularFiltersAndChooseFreeCancellationBox() {
        filteringandSortingPage.fiveStarayca.click();
        filteringandSortingPage.Freecancellationayca.click();
        filteringandSortingPage.filtersapplyayca.click();
        ReusableMethods.waitFor(2);
    }

    @And("User clicks on Guest Rating and choose Excellent")
    public void userClicksOnGuestRatingAndChooseExcellent() {

       // filteringandSortingPage.guestFilterDropDown.click();bunda olmadi
        filteringandSortingPage.guestRatingayca.click();
        ReusableMethods.waitFor(1);
        filteringandSortingPage.excellentayca.click();
//        ReusableMethods.waitFor(2);
        filteringandSortingPage.guestRatingApplyButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("User clicks on Property Type and choose Hotel box")
    public void userClicksOnPropertyTypeAndChooseHotelBox() {
        filteringandSortingPage.propertyT1.click();
        filteringandSortingPage.hotelbox.click();
        filteringandSortingPage.propertytypesapplyayca.click();
        ReusableMethods.waitFor(2);
    }

    @And("User review the result according to the selected sorting criteria and confirm accuracy")
    public void userReviewTheResultAccordingToTheSelectedSortingCriteriaAndConfirmAccuracy() {
        String staysFound = filteringandSortingPage.staysFound.getText();
        Assert.assertFalse(staysFound.equals("1000"));
        WaitUtils.waitFor(1);
    }
}
