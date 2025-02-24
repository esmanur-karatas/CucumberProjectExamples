package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoynerMembershipPage {
    public BoynerMembershipPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "icon-account")
    public WebElement membershipButton;

    @FindBy(className = "user-cart-active_link__Y0FkN")
    public WebElement signUpButton;

    @FindBy(xpath = "//div[@class='login-desktop_leftHeaderRegisterTitle__ABHjJ']")
    public WebElement verifySignUp;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(id = "phone")
    public WebElement phoneInput;

    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[1]")
    public WebElement membershipChechbox;

    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[2]")
    public WebElement consentTextCheckbox;

    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[2]")
    public WebElement submitButton;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cockieAccept;
}
