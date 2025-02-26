package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyNetReRunPage {
    public MyNetReRunPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "myGlobalSearchBtn")
    public WebElement searchButton;

    @FindBy(id = "myGlobalSearchInput")
    public WebElement searchInput;

   @FindBy(css = "h-title mb-0")
   public WebElement resultVerify;
}
