package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US01_Page extends BasePage{

//    @FindBy(xpath = "//h2[text()='Popular searches']")
//    public static WebElement page_center; //sayfa ortasindaki 'Popular searches' text TB
//
//    @FindBy(xpath = "//h2[text()='Popular searches']")
//    public static WebElement page_end; //sayfa sonundaki 'Help' text TB
    @FindBy(id = "input-auto-complete")
    public WebElement whereTo_tb;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement checkIn_tb;

    @FindBy(xpath = "//button[@type='button' and @class='SearchButtonWithLoader_button___1Bps' and @data-testid='search-button-with-loader']\n")
    public WebElement searchButton_tb;

    @FindBy(xpath = "(//span[@class='leading-none inline-flex transform'])[5]")
    public WebElement closeButton_tb; //in the check in field
    @FindBy(xpath = "//span[@title='Homewood Suites Washington']")
    public static WebElement hotelSeen_tb;  //must be static



}
