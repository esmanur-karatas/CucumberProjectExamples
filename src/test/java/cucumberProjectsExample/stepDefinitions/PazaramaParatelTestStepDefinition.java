package cucumberProjectsExample.stepDefinitions;

import cucumberProjectsExample.pages.PazaramaParatelTestPage;
import cucumberProjectsExample.utilities.Driver;
import cucumberProjectsExample.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PazaramaParatelTestStepDefinition {
    PazaramaParatelTestPage pazaramaParatelTestPage = new PazaramaParatelTestPage();

    @When("search box içine {string} yazilir")
    public void search_box_içine_yazilir(String string) {
        if (pazaramaParatelTestPage.cockieAccept.isDisplayed()) {
            pazaramaParatelTestPage.cockieAccept.click();
        }
        pazaramaParatelTestPage.searchBox.sendKeys(string, Keys.ENTER);
    }

    @Then("goruntulenen sonuclarda {string} oldugu dogrulanir")
    public void goruntulenen_sonuclarda_oldugu_dogrulanir(String string) {
        for (int i = 0; i < pazaramaParatelTestPage.productName.size(); i++)
        {
            assertTrue(pazaramaParatelTestPage.productName.get(i).getText().contains(string));

        }
    }

    @When("ilk urun favorilere ekler")
    public void ilkUrunFavorilereEkler() {

        pazaramaParatelTestPage.ilkUrun.click();
    }

    @And("giris sayfasi acilir")
    public void girisSayfasiAcilir() {
        String expectedUrl="https://giris.pazarama.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fprotocol%3Doauth2%26response_type%3Dcode%26access_type%26client_id%3Dpazarama.web.prod.client%26redirect_uri%3Dhttps%253A%252F%252Fwww.pazarama.com%252Fcallback%26scope%3Dopenid%2520profile%2520pazaramaweb.fullaccess%2520offline_access%26state%3DvSjsdmtTwf%26code_challenge_method%3DS256%26guest_id%3D8df7c685-2706-45d1-a04e-3680439a5960%26channel_code%3D2%26code_challenge%3DMhBTBZzGAJOJqFWfUzE5R2Cs_Q_KveHSWt5ETAwSGqM%26response_mode%3Dquery";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertTrue(expectedUrl.contains(actualUrl));
    }

    @And("email ve password kutularina veri girilir")
    public void emailVePasswordKutularinaVeriGirilir(DataTable dataTable) {
        List<String> emailPassword= dataTable.row(0);
        System.out.println("emailPassword = " + emailPassword);
        System.out.println("dataTable.row(1).get(0) = " + dataTable.row(1).get(0));
        for (int i = 1; i < emailPassword.size(); i++) {

            ReusableMethods.flash(pazaramaParatelTestPage.email, Driver.getDriver());
            pazaramaParatelTestPage.email.sendKeys(dataTable.row(1).get(i-1));

            ReusableMethods.flash(pazaramaParatelTestPage.password, Driver.getDriver());
            pazaramaParatelTestPage.password.sendKeys(dataTable.row(1).get(i));
            pazaramaParatelTestPage.submitButton.click();
        }


    }

    @Then("giris yapilamadigi dogrulanir")
    public void girisYapilamadigiDogrulanir() {

        assertTrue(pazaramaParatelTestPage.submitButton.isDisplayed());
    }
}

