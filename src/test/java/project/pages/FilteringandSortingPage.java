package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilteringandSortingPage extends BasePage {


    @FindBy(xpath = "//*[@id='input-auto-complete']")
    public WebElement destinationayca;
    @FindBy(xpath = "//button[@data-testid='search-button-with-loader']")
    public WebElement searchButtonayca;
    @FindBy(xpath = "(//*[@class='flex items-center group-focus:border-blue-700 border rounded-full py-1 px-3 border-grey-300'])[1]")
    public WebElement priceayca;
    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement priceApplyButtonayca;
    @FindBy(xpath ="(//span[@class='flex items-center group-focus:border-blue-700 border rounded-full py-1 px-3 border-grey-300'])[2]")
    public WebElement filters4ayca;
    @FindBy(xpath ="//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button")
    public WebElement guestFilterDropDown;
    @FindBy(xpath = "(//span[@class='flex items-center group-focus:border-blue-700 border rounded-full py-1 px-3 border-grey-300'])[3]")
    public WebElement guestRatingayca;
    @FindBy(xpath = "//button[@data-testid='5-star-hotels-filter']")
    public WebElement fiveStarayca;
    @FindBy(xpath = "//li[@data-testid='filter-container']")
    public WebElement Freecancellationayca;
    @FindBy(xpath = "//button[@data-testid='8.5-rating-hotels-filter']")
    public WebElement excellentayca;
    @FindBy(xpath = "//button[@name='property_type']")
    public WebElement propertyT1;
    @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-hotel']")
    public WebElement hotelbox;
    @FindBy(xpath = "//div[@data-testid='price-slider']")
    public WebElement sliderBox;
    @FindBy(xpath = "(//strong[@class='bg-grey-300'])[1]")
    public WebElement staysFound;
    @FindBy(xpath = "//div[@class='max-w-screen-2xl m-auto py-5']")
    public WebElement aroundclick;
    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement filtersapplyayca;
    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement propertytypesapplyayca;

@FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement guestRatingApplyButton;




}
