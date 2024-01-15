package project.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@autocorrect='off']")
    public WebElement destination;
    @FindBy(xpath = "//input[@data-testid='search-form-destination']")
    public WebElement destinationButton;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement checkInClick;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkout']")
    public WebElement checkOutClick;
    @FindBy(xpath = "//button[@name='property_type']")
    public WebElement propertyType;
    @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-entire house / apartment']")
    public WebElement entireHouseCheckbox;
    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement applyButton;
    @FindBy(xpath = "//button[@data-testid='item-name']")
    public WebElement firstHouseTitle;
    @FindBy(xpath = "//span[@data-testid='price-label']")
    public WebElement priceTravel;
    @FindBy(xpath = "(//button[@role='tab'])[1]")
    public WebElement overview;

    @FindBy(xpath= "//article[@data-testid='amenities-module']")
    public WebElement topAmenities;

    @FindBy(xpath = "//label[@data-testid='tonight-index-label']")
    public WebElement tonightButton;
    @FindBy(xpath = "//label[@data-testid='tomorrowNight-index-label']")
    public WebElement tomorrowNightButton;
    @FindBy(xpath = "//button[@data-testid='guest-selector-apply']")
    public WebElement guestAndRoomsApply;
    @FindBy(xpath = "//img[@ data-testid='accommodation-main-image'][1]")
    public WebElement clickRandom;
    @FindBy(xpath = "//button[@data-testid='champion-deal'][1]")
    public WebElement viewDealButton;





    @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-hotel']")//div[@class='fresnel-container fresnel-greaterThanOrEqual-2xl fresnel-:rf:']
    public WebElement Hotel;
    @FindBy(id = "input-auto-complete")
    public WebElement InputBanf;

    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement inputCheckIn;

    @FindBy(xpath = "//label[@data-testid=\"tonight-index-label\"]")
    public WebElement InpurData;

    @FindBy(xpath = "//span[@data-testid='search-form-guest-selector-value']\n")
    public WebElement clickApply;

    @FindBy(xpath = "//button[@type='button' and @class='SearchButtonWithLoader_button___1Bps' and @data-testid='search-button-with-loader']\n")
    public WebElement SearchButton;
    @FindBy(xpath = "//button[@type='button' and @class='absolute right-0 m-4 z-5' and @data-testid='calendar-button-close']\n")
    public WebElement clickX;
    @FindBy(xpath = "//img[@data-testid='accommodation-main-image']")
    public  WebElement firstHotelPhoto;
    @FindBy(xpath = "(//button[@data-testid='item-name'])[1]")
    public  WebElement firstHotelButton;

    @FindBy(xpath = "//p[@data-testid='recommended-price']")
    public  WebElement firstHotelPriceUs4;
 @FindBy(xpath = "//button[@data-testid='distance-label-section']")
    public  WebElement citycenterButton;
 @FindBy(xpath = "//ul[@class='AmenitiesList_list__TkNaX AmenitiesList_threeColumns__BBSwr']")
    public  WebElement topAmenitiesList;
//    @FindBy(id = "[@id=\"__next\"]/div/main/div[3]/div[1]/div[1]/div[2]/div/div/ol/li[2]/div/article/div[1]/button/span[3]")
//    public  WebElement FairmontHotSpringsResort;

//    @FindBy(id = "tabs-87-tab-0")
//    public  WebElement hotelOverview;

//    @FindBy(id = "tabs-87-tab-1")
//    public  WebElement hotelInfo;

    @FindBy(xpath = "(//button[@role='tab'])[3]")
    public  WebElement hotelPhotos;
    @FindBy(xpath = "//button[contains(text(),'Photos')]")
    public  WebElement hotelPhotos2;
    @FindBy(xpath = "(//button[@role='tab'])[4]")
    public  WebElement hotelReviews;
    @FindBy(xpath = "(//button[@role='tab'])[5]")
    public  WebElement hotelPrices;
    @FindBy(xpath = "(//p[@data-testid='recommended-price'])[1]")
    public  WebElement hotelRecommendedPrices;



}
