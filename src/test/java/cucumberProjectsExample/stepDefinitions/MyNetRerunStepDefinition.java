package cucumberProjectsExample.stepDefinitions;

import cucumberProjectsExample.pages.MyNetReRunPage;
import cucumberProjectsExample.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class MyNetRerunStepDefinition {
    MyNetReRunPage myNetReRunPage = new MyNetReRunPage();
    @Given("arama butonuna basar")
    public void arama_butonuna_basar() {
        myNetReRunPage.searchButton.click();
    }
    @Given("arama kutusuna {string} yazar")
    public void arama_kutusuna_yazar(String string) {
        myNetReRunPage.searchInput.sendKeys(string);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#myGlobalSearchBtn\")");
    }
    @Then("sonuclarda {string} oldugu dogrulanir")
    public void sonuclarda_oldugu_dogrulanir(String string) {
       Assert.assertTrue(myNetReRunPage.resultVerify.getText().contains(string));
    }
}
