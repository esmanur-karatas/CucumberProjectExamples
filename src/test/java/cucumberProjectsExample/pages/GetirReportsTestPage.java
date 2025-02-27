package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetirReportsTestPage {
    public GetirReportsTestPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@class='style__Button-sc-__sc-6ivys6-0 eGRCCQ'])[1]")
    public WebElement cockieAccept;

    @FindBy(className = "style__Title1-sc-__sc-1nwjacj-2 hIkhWh sc-c8a335b9-5 eysMHc")
    public WebElement verifyPage;


}
