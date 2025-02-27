package cucumberProjectsExample.stepDefinitions;

import cucumberProjectsExample.pages.GetirReportsTestPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static junit.framework.TestCase.assertTrue;

public class GetirReportsTestStepDefinitions {
    GetirReportsTestPage getirReportsTestPage = new GetirReportsTestPage();
    @When("cerez kapatilir")
    public void cerez_kapatilir() {
        getirReportsTestPage.cockieAccept.click();

    }
    @Then("sayfada olundugu dogrulanir")
    public void sayfada_olundugu_dogrulanir() {
        Assert.assertTrue(getirReportsTestPage.verifyPage.isDisplayed());
        System.out.println(getirReportsTestPage.verifyPage.getText());
    }

}
