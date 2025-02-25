package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class TrendyolHooksPage {
    public TrendyolHooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "V8wbcUhU")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@class='dscrptn dscrptn-V2']//h1")
    public WebElement verifyResult;

    @FindBy(xpath = "//div[@class='dscrptn dscrptn-V2']//h2")
    public WebElement verifyNumber;
}
