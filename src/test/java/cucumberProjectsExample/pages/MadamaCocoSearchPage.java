package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MadamaCocoSearchPage {
    public MadamaCocoSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='search_text']")
    public WebElement searchBoxInput;

    @FindBy(className = "searched-text")
    public WebElement verifySearchResult;

    @FindBy(xpath = "(//form[@action='/setlang/']//button)[2]")
    public WebElement enButton;
}
