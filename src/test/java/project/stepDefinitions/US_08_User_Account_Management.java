package project.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import project.pages.HomePage;
import project.pages.LoginPage;
import project.pages.UserAccount;
import project.utilities.*;

public class US_08_User_Account_Management {

    HomePage homePage=new HomePage();

    LoginPage loginPage = new LoginPage();
    UserAccount userAccount = new UserAccount();

    @Given("Go to home page")
    public void go_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }
    @Then("Log in as a user")
    public void log_in_as_a_user() {
        //ActionUtils.doubleClick(userAccount.logIn);
        //WaitUtils.waitFor(2);

        userAccount.logIn.click();
        WaitUtils.waitFor(2);

        loginPage.email.click();
        WaitUtils.waitFor(2);
        //loginPage.email.sendKeys("marcoantonio.llewellyn@falkcia.com"+ Keys.ENTER);
        loginPage.email.sendKeys(ConfigReader.getProperty("email"));
        WaitUtils.waitFor(2);
        loginPage.nextButton.click();
        WaitUtils.waitFor(2);

        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.password.click();
        WaitUtils.waitFor(2);


    }
    @Then("Click on the log in button")
    public void click_on_the_log_in_button() {
        loginPage.userLogIn.click();
        WaitUtils.waitFor(2);

    }
    @When("Click on the user account button")
    public void click_on_the_user_account_button() {
        //ReusableMethods.clickWithTimeOut(ReusableMethods.waitForClickablility(userAccount.userAccountButton, 3), 3);
        userAccount.userAccountBox.click();
        WaitUtils.waitFor(2);

    }
    @When("Click on the account settings box")
    public void click_on_the_account_settings_box() {
        userAccount.accountSettings.click();
        WaitUtils.waitFor(2);

    }
    @Then("Update user last name")
    public void update_user_last_name() {
        userAccount.lastNameButton.click();
        WaitUtils.waitFor(2);
        userAccount.updatePersonalInfo.click();
        WaitUtils.waitFor(2);

    }
    @Then("Click on the user account button to see dropdown")
    public void click_on_the_user_account_button_to_see_dropdown() {
        userAccount.userAccountBox.click();
        WaitUtils.waitFor(2);

    }
    @Then("Click on the recently viewed to see before booking")
    public void click_on_the_recently_viewed_to_see_before_booking() {
        userAccount.recentlyViewed.click();
        WaitUtils.waitFor(2);

    }
    @Then("Verify before booking is visible")
    public void verify_before_booking_is_visible() {
        //Assert.assertTrue(userAccount.itemVisible.isDisplayed());
        //WaitUtils.waitFor(2);

       //ReusableMethods.verifyElementDisplayed(userAccount.itemVisible);
       //WaitUtils.waitFor(2);

        //userAccount.itemVisible.isDisplayed();
        WaitUtils.waitFor(2);

    }



}
