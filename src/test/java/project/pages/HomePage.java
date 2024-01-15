package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='search-button-with-loader']")
    public WebElement searchButton;



//    @FindBy(xpath = "//p[@data-testid='no-results-suggestion']")
//    public WebElement noResultsAlert;




    @FindBy(xpath = "//p[@data-testid='no-results-suggestion']")
    public WebElement noResultsAlert;

}

