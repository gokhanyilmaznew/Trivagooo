package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.utilities.ActionUtils;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;


    //@FindBy(xpath = "//input[@id='email']")
    //public WebElement email;
    //@FindBy(xpath = "//input[@class='BaseInput_input__0WXAa']")
    //public WebElement userEmail;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement userLogIn;

}