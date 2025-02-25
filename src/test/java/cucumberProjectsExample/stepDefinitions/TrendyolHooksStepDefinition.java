package cucumberProjectsExample.stepDefinitions;

import cucumberProjectsExample.pages.TrendyolHooksPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class TrendyolHooksStepDefinition {

    TrendyolHooksPage trendyolHooksPage = new TrendyolHooksPage();
    String result = "";

    @Given("arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        trendyolHooksPage.searchInput.sendKeys(string, Keys.ENTER);
    }

    @Then("sonuc sayfasinda {string} olduğu dogrulanir")
    public void sonuc_sayfasinda_olduğu_dogrulanir(String string) {
        Assert.assertEquals(string, trendyolHooksPage.verifyResult.getText());
    }

    @When("sonuc sayfasindaki arama sonuc sayisi alinir")
    public void sonuc_sayfasindaki_arama_sonuc_sayisi_alinir() {
        String result = trendyolHooksPage.verifyNumber.getText().replaceAll("^\\D", "");
        System.out.println("Arama sonucu: " + result);
    }

    @Then("{int} den az urunun ekranda goruntulendigi dogrulanir")
    public void den_az_urunun_ekranda_goruntulendigi_dogrulanir(Integer int1) {
        int resultNumber = Integer.parseInt(result);
        Assert.assertTrue(resultNumber<=int1);
    }

}
