package project.stepDefinitions;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import project.pages.HomePage;
//import project.pages.US01_Page;
////import project.pages.US12_HomePage;
//import project.utilities.ReusableMethods;
//import project.utilities.WaitUtils;
//
//import java.util.List;
//
//import static org.junit.Assert.assertTrue;
//import static project.utilities.Driver.driver;
//public class US_12_HomepageNavigation {
//
//    HomePage homePage = new HomePage();
//
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//    //    @Given("user goes to urlOrhan")
////    public void user_goes_to_urlOrhan(String url) {
////
////        Driver.getDriver().get(ConfigReader.getProperty(url));
////
////    }
//    @Then("all elements on the homepage should load without errors")
//    public void all_elements_on_the_homepage_should_load_without_errors() {
//
//        String xpathExpression = "//*[@id=\"__next\"]/div[1]/div[1]";
//
//        List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));
//
//        assertTrue("No elements found with the specified XPath", elements.size() > 0);
//
//        // Loop through the found elements and check their visibility
//        for (WebElement element : elements) {
//            assertTrue("Element not displayed: " + xpathExpression, element.isDisplayed());
//        }
//
//    }
//
//    @Then("user should select {string} on where to button")
//    public void userShouldSelectOnWhereToButton(String arg0) {
//        ReusableMethods.waitFor(3);
////        US12_HomePage.whereToOM.sendKeys("Buffalo");
//
//    }
//
//    @Then("user should click checkIn button")
//    public void userShouldClickCheckInButton() {
//        ReusableMethods.waitFor(3);
////        US12_HomePage.checkInOM.click();
//
//    }
//
//    @Then("user should click to close button on the checkIn and checkout field")
//    public void userShouldClickToCloseButtonOnTheCheckInAndCheckoutField() {
//        ReusableMethods.waitFor(3);
////        US12_HomePage.closeButtonOM.click();
//
//    }
//
//    @Then("user should click Search button")
//    public void userShouldClickSearchButton() {
//        ReusableMethods.waitFor(3);
////        US12_HomePage.searchButtonOM.click();
//
//    }
//
//    @And("verify the  search button on the web page")
//    public void verifyTheSearchButtonOnTheWebPage() {
//        ReusableMethods.waitFor(3);
////        js.executeScript("window.scrollBy(0,500)");
//        ReusableMethods.takeScreenshotAllScreen();
////        Assert.assertTrue(US12_HomePage.hotelSeenOM.isDisplayed());
//    }
//
//    @Then("close the app")
//    public void closeTheApp() {
//        WaitUtils.waitFor(2);
//        driver.quit();
//    }

//
//}





