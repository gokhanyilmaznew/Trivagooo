package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import project.pages.HomePage;
import project.pages.SearchPage;
import project.utilities.ActionUtils;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import project.utilities.WaitUtils;


public class Us_06_House_Details {

    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();
    @Given("user go to home page")
    public void user_go_to_home_page(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("user clicks on search button")
    public void user_clicks_on_search_button(){
//        ActionUtils.doubleClick(homePage.searchButton);
        WaitUtils.waitFor(1);
        searchPage.destination.sendKeys("Toronto", Keys.ENTER);
        searchPage.checkInClick.click();

       searchPage.checkOutClick.click();
        homePage.searchButton.click();
    }
    @Then("user clicks property type dropdown menu")
    public void user_clicks_property_type_dropdown_menu(){
        searchPage.propertyType.click();
        WaitUtils.waitFor(1);
    }
    @When("user selects the house or apartment checkbox")
    public void user_selects_the_house_apartment_checkbox(){
        searchPage.entireHouseCheckbox.click();
    }
    @Then("user clicks the apply button")
    public void user_clicks_the_apply_button(){
        searchPage.applyButton.click();
    }
    @Then("user verify the house price is visible")
    public void user_verify_the_house_price_is_visible(){
        Assert.assertTrue(searchPage.priceTravel.isDisplayed());
        WaitUtils.waitFor(1);
    }
    @When("user clicks the house name")
    public void user_clicks_the_house_name(){
        searchPage.firstHouseTitle.click();
        WaitUtils.waitFor(1);
    }
    @Then("user clicks the overview button")
    public void user_clicks_the_overview_button(){
        searchPage.overview.click();
        ActionUtils.scrollDownActions();
    }
    @Then("verify top amenities is visible")
    public void verify_top_amenities_is_visible(){
        WaitUtils.waitForVisibility(searchPage.topAmenities,2);
        Assert.assertTrue(searchPage.topAmenities.isDisplayed());

    }
    @And("user clicks city center button")
    public void userClicksCityCenterButton() {
        searchPage.citycenterButton.click();

    }

    @Then("user verify top amenities list is visible")
    public void userVerifyTopAmenitiesListIsVisible() {
        Assert.assertTrue(searchPage.topAmenitiesList.isDisplayed());
    }

}
