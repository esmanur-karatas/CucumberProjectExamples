package cucumberProjectsExample.stepDefinitions;

import cucumberProjectsExample.pages.CicekSepetiDataTablePage;
import cucumberProjectsExample.utilities.ConfigurationReader;
import cucumberProjectsExample.utilities.Driver;
import cucumberProjectsExample.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CicekSepetiDataTableStepDefinition {

    CicekSepetiDataTablePage cicekSepetiDataTablePage = new CicekSepetiDataTablePage();

    @Given("{string} sitesine gidilir")
    public void sitesine_gidilir(String string) {
        switch (string) {
            case "cicek sepeti":
                Driver.getDriver().get(ConfigurationReader.getProperty("ciceksepeti"));
                break;
            case "boyner":
                Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigurationReader.getProperty("trendyol"));
                break;
            case "ets tur":
                Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
                break;
            case "madama coco":
                Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));
                break;
            case "mynet":
                Driver.getDriver().get(ConfigurationReader.getProperty("mynet"));
                break;
            case "pazarama":
                Driver.getDriver().get(ConfigurationReader.getProperty("pazarama"));
                break;
            case "etstur":
                Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
                break;
            case "getir":
                Driver.getDriver().get(ConfigurationReader.getProperty("getir"));
                break;
        }
    }

    @When("cicek sepeti sayfası seçilir.")
    public void cicek_sepeti_sayfası_seçilir() {
        cicekSepetiDataTablePage.cicekSepetiSelect.click();
    }

    @When("dogum gunu linki tıklanır")
    public void dogum_gunu_linki_tıklanır() {
        cicekSepetiDataTablePage.birthDayButton.click();
    }

    @Then("dogum gunu sayfasında olduğu dogrulanır")
    public void dogum_gunu_sayfasında_olduğu_dogrulanır() {
        String expectedUrl = "https://www.ciceksepeti.com/d/dogum-gunu";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("tasarim tipi drop down tıklanır")
    public void tasarim_tipi_drop_down_tıklanır() {
        ReusableMethods.wait(10);
        cicekSepetiDataTablePage.designTypeClick.click();

    }

    @Then("sirasiyla renklerin secildigi dogrulanir")
    public void sirasiyla_renklerin_secildigi_dogrulanir(DataTable dataTable) {
        List<String> bilgiler = dataTable.asList();
        for (int i = 0; i < bilgiler.size(); i++) {
            switch (bilgiler.get(i)) {
                case "Buketler":
                    cicekSepetiDataTablePage.buketler.click();
                    break;
                case "Kutuda Cicek":
                    cicekSepetiDataTablePage.kutudaCicek.click();
                    break;
                case "Saksida Cicek":
                    cicekSepetiDataTablePage.saksidaCicek.click();
                    break;
                case "Vazoda Cicek":
                    cicekSepetiDataTablePage.saksidaCicek.click();
                    break;
                case "Celenk":
                    cicekSepetiDataTablePage.celenk.click();
                    break;
                default:
                    break;
            }
            Driver.getDriver().get("https://www.ciceksepeti.com/d/dogum-gunu");
            cicekSepetiDataTablePage.designTypeClick.click();
        }
        Driver.closeDriver();
    }

}
