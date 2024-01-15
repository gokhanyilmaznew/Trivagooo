package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccount extends BasePage {

    @FindBy(xpath = "//button[@data-testid='header-login']")
    public WebElement logIn;

    @FindBy(xpath = "//button[@data-testid='header-profile-menu']")
    public WebElement userAccountButton;
    @FindBy(xpath = "//span[@class='flex-grow text-m whitespace-nowrap text-blue-900 font-bold rounded-full h-8 w-8 flex items-center justify-center bg-blue-200 border border-blue-500']")
    public WebElement userAccountBox;

    @FindBy(xpath = "//div[@class='h-full']")
    public WebElement accountSetting;
    @FindBy(xpath = "//span[text()='Account settings']")
    public WebElement accountSettings;

    @FindBy(xpath = "//label[text()='Last name']")
    public WebElement lastNameButton;
    @FindBy(xpath = "//span[text()='Update personal information']")
    public WebElement updatePersonalInfo;

    @FindBy(xpath = "//a[@href='/en-US/profile/recently-viewed']") //a[@data-testid='recently-viewed-account-setting']
    public WebElement recentlyViewed;

    @FindBy(xpath ="//img[@class='block h-full w-full object-cover 2xl:rounded-l-md']") //h3[@data-testid='accommodation-name'] //article[@class='flex flex-col pl-3 pb-1 justify-between truncate'] //span[@data-testid='accommodation-location']
    public WebElement itemVisible;

}
