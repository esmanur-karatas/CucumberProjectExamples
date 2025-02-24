package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CicekSepetiDataTablePage {
    public CicekSepetiDataTablePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/header/div[3]/div/nav/div[4]/a/span")
    public WebElement birthDayButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[1]/div/div[2]/button/span/span[2]/span")
    public WebElement designTypeClick;

    @FindBy(className = "home-page-switch__csImg")
    public WebElement cicekSepetiSelect;

    @FindBy(xpath = "//label[@for='2556835']")
    public  WebElement buketler;

    @FindBy(xpath = "//label[@for='2556838']")
    public  WebElement kutudaCicek;

    @FindBy(xpath = "//label[@for='2556834']']")
    public  WebElement saksidaCicek;

    @FindBy(xpath = "//label[@for='2556833']")
    public  WebElement vazodaCicek;

    @FindBy(xpath = "//label[@for='2575080']")
    public  WebElement celenk;


}
