package project.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import project.pages.HomePage;

import project.pages.US01_Page;

import project.utilities.Driver;
import project.utilities.ReusableMethods;


public class US_01_Homepage_Navigation {


    US01_Page us01Page = new US01_Page();
    HomePage homePage=new HomePage();

    @Given("User goes to {string} page")
    public void userGoesToPage(String url) {
//        WebDriver driver = Driver.getDriver();
//        driver.get(url);
        Driver.getDriver().get(url);
    }

    @Then("User should be on {string} page")
    public void userShouldBeOnPage(String expectedUrl) {
//        WebDriver driver = Driver.getDriver();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("The URL is not as expected!", expectedUrl, actualUrl);
    }

    @Then("User select to {string} on Where to? button")
    public void userSelectToOnWhereToButton(String city) {
        ReusableMethods.waitFor(2);
        us01Page.whereTo_tb.sendKeys("Washington D.C.");
    }
    @And("User  clicks checkIn button_tb")
    public void userClicksCheckInButton_tb() {
        ReusableMethods.waitFor(2);
        us01Page.checkIn_tb.click();
    }
    @And("User clicks to close button on the check in field")
    public void userClicksToCloseButtonOnTheCheckInField() {
        ReusableMethods.waitFor(2);
        us01Page.closeButton_tb.click();
    }

    @And("User clicks to Search button_tb")
    public void userClicksToSearchButton_tb() {
        ReusableMethods.waitFor(2);
        us01Page.searchButton_tb.click();
    }

    @Then("User verify the  search button on the web page")
    public void userVerifyTheSearchButtonOnTheWebPage() {
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenshotAllScreen();
        Assert.assertTrue(homePage.searchButton.isDisplayed());
    }



}



/*
@Then("User should be on {string} page") aciklama:
Bu kod parçası, kullanıcının belirli bir URL'ye gittiğini doğrulamak için Cucumber'ın @Then adımını kullanır.
Assert.assertEquals metodu ile beklenen URL ile gerçek URL karşılaştırılır. Eğer URL'ler uyuşmazsa,
bir hata mesajı alırsınız. Bu yöntem, kullanıcının doğru sayfada olduğunu doğrulamanın basit ve etkili bir yoludur.

Unutmayın ki, bu kod parçasının çalışması için projenizde JUnit ve Selenium WebDriver kütüphanelerinin
bulunması gerekmektedir. Ayrıca, Driver sınıfınızın projenizdeki gerçek WebDriver sınıfınıza karşılık
gelmesi gerektiğini unutmayın.
 */