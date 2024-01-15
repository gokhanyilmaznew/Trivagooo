package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends BasePage {

    @FindBy (xpath = "//input[@placeholder='Where to?']")
    public WebElement EnterDestination;

    @FindBy (xpath = "//input[@data-testid='search-form-destination']")
    public WebElement enterDestination2;


    @FindBy(xpath =" //button[@data-testid='search-button-with-loader']")
    public WebElement searchButton;


    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement clickCheckInButton;

    @FindBy(xpath = "//label[@data-testid='tonight-index-label']")
    public WebElement clickCheckInTonightButton;

    @FindBy (xpath = "//button[@data-testid='search-form-calendar-checkout']")
    public WebElement clickCheckOutButton;

    @FindBy(xpath = "//label[@data-testid='tomorrowNight-index-label']")
    public WebElement clickCheckOutTomorrowNightButton;

    @FindBy (xpath= "(//span[@class='leading-none inline-flex transform'])[5]")
    public WebElement closeCalender;


    @FindBy (xpath= "(//button[@data-testid='champion-deal'])[1]")
    public WebElement clickViewDealButton;


//   @FindBy (xpath = "(//span[@data-testid="rateName"])[1]")//(//span[@data-testid="rateName"])[1]
//    public WebElement clickQuickBookButton;
    @FindBy (xpath = "(//button[@data-testid='quickBookButton'])[1]")
    public WebElement clickQuickBookButton;

    ////button[@data-testid='champion-deal']

// @FindBy(xpath = "(//button[@data-testid='roomTypeLink'])[1]")
//    public WebElement roomDetails;
   @FindBy(xpath = "//button[@id='roomCardNameLinkNER']")
   public WebElement roomDetails;

    @FindBy(xpath = "(//button[@data-testid='quickBookButton'])[4]")
    public WebElement quickBook;
  @FindBy(xpath = "//input[@data-testid='cardNumberTextInput']")
    public WebElement hiltonCardNumber;


    @FindBy(xpath = "(//div[@data-testid='quickBookMainText'])[1]")
    public WebElement quickBookButton;

//    @FindBy(xpath = "//strong[@data-testid='recommended-price-partner']")
//    public WebElement hotelHilton;

    //vio hotel

    @FindBy(xpath = "(//span[@data-translations-id='viewDeal'])[1]")
    public WebElement vioViewDeal;

    @FindBy(xpath = "//span[@data-translations-id='book'][1]")
    public WebElement vioBook;

    @FindBy(xpath = "(//input[@autocomplete='cc-number'])[1]")
    public WebElement vioCcardNumBox;

    @FindBy(xpath ="//input[@id='payment.cc-exp']")
    public WebElement vioNextBox;

    @FindBy(xpath = "//span[@data-translations-id='emptyCreditCard']")
    public WebElement vioErrorMsg;

    @FindBy(xpath = "//p[@class='ec-5pfx34 e1og4rpj0'][4]")
    public WebElement vioErrmsg;

}
