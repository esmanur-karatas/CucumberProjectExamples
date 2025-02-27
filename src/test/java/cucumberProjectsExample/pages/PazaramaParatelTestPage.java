package cucumberProjectsExample.pages;

import cucumberProjectsExample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PazaramaParatelTestPage {
    public PazaramaParatelTestPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "label-input")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[2]/button[2]")
    public WebElement cockieAccept;

    @FindBy(xpath = "//div[@class='line-clamp-2 text-gray-600 h-8 text-xs leading-4 mb-1.5']")
    public List<WebElement> productName;

    @FindBy(xpath= "(//span[@name='heart'])[1]")
    public WebElement ilkUrun;
    @FindBy(id= "Username")
    public WebElement email;
    @FindBy(id= "Password")
    public WebElement password;
    @FindBy(id= "submit-button")
    public WebElement submitButton;
    @FindBy(xpath= "(//button[text()='Evet'])[1]")
    public WebElement reklam;
}
