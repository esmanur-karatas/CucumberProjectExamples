package cucumberProjectsExample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumberProjectsExample.utilities.Driver;

public class EtsTurLoginPage {
    public EtsTurLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[3]/div[1]/div/button")
    public WebElement account;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//form//div[3]//button")
    public WebElement loginButton;

    @FindBy (xpath = "(//p[@data-test-id='input-info-text'])[1]")
    public  WebElement verifyLogin;

    @FindBy (xpath = "//html//body//div[4]//div[3]//div[2]//p//a")
    public WebElement signUp;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement signupInputName;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement signupInputSurname;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement signupInputEmail;

    @FindBy(xpath = "(//input[@name='phone'])[2]")
    public WebElement signupInputPhone;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signupInputPassword;

    @FindBy(xpath = "//input[@name='rePassword']")
    public WebElement signupInputPasswordRepeat;

    @FindBy(xpath = "//input[@name='acceptKvk']")
    public WebElement signUpAcceptKvkChecbox;

    @FindBy(xpath = "//input[@name='allowMarketing']")
    public WebElement signUpAllowMarketingChecbox;

    @FindBy(xpath = "//form//div[3]//button")
    public WebElement signUpButton;

    @FindBy(xpath = "//div[3]//h2")
    public WebElement verifySignUp;


}
