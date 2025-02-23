package cucumberProjectsExample.stepDefinitions;

import com.github.javafaker.Faker;
import cucumberProjectsExample.pages.MadamaCocoSearchPage;
import cucumberProjectsExample.utilities.ConfigurationReader;
import cucumberProjectsExample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class MadamaCocoStepDefination {
    MadamaCocoSearchPage madamaCocoSearchPage = new MadamaCocoSearchPage();
    Faker faker = new Faker();
    String product = "";
    @Given("madama coco sitesine gidilir.")
    public void madama_coco_sitesine_gidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));    }

    @Given("arama kutusuna vazo yazılır")
    public void arama_kutusuna_vazo_yazılır() {
        madamaCocoSearchPage.searchBoxInput.sendKeys("Vazo", Keys.ENTER);
    }

    @Then("sonuçlarda vazo olduğu doğrulanır.")
    public void sonuçlarda_vazo_olduğu_doğrulanır() {
        Assert.assertTrue(madamaCocoSearchPage.verifySearchResult.isDisplayed());
        System.out.println(madamaCocoSearchPage.verifySearchResult.getText());
        Driver.closeDriver();
    }



    @Given("madame coco sitesine gidilir.")
    public void madame_coco_sitesine_gidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));

}

    @Given("ingilizce menü seçilir")
    public void ingilizce_menü_seçilir() {
        madamaCocoSearchPage.enButton.click();
    }

    @Given("Arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        product = faker.commerce().productName();
        if(string.contains("<urun>")){
            madamaCocoSearchPage.searchBoxInput.sendKeys(product, Keys.ENTER);
        }

    }

    @Then("sonuçlarda {string} olduğu doğrulanır.")
    public void sonuçlarda_olduğu_doğrulanır(String string) {
        Assert.assertTrue(madamaCocoSearchPage.verifySearchResult.getText().contains(product));
        System.out.println(product);
        Driver.closeDriver();
    }

}
