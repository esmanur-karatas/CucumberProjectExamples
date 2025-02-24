package cucumberProjectsExample.stepDefinitions;


import cucumberProjectsExample.pages.BoynerMembershipPage;
import cucumberProjectsExample.utilities.ConfigurationReader;
import cucumberProjectsExample.utilities.Driver;
import cucumberProjectsExample.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BoynerMembershipStepDefinition {
    BoynerMembershipPage boynerMembershipPage = new BoynerMembershipPage();

    @Given("boyner sitesine gidilir")
    public void boyner_sitesine_gidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
    }

    @When("login butonunun ustune gidilir.")
    public void login_butonunun_ustune_gidilir() {
        ReusableMethods.hover(boynerMembershipPage.membershipButton);
    }

    @When("uye ol linkine tiklanir")
    public void uye_ol_linkine_tiklanir() {
        boynerMembershipPage.signUpButton.click();
    }

    @Then("cerezler kabul edilir")
    public void çerezler_kabul_edilir() {
        boynerMembershipPage.cockieAccept.click();
    }

    @Then("uyelik sayfasinda ad bolumune {string} girilir")
    public void uyelik_sayfasinda_ad_bolumune_girilir(String string){
        boynerMembershipPage.nameInput.sendKeys(string);
    }
    @Then("uyelik sayfasinda email bolumune {string} girilir")
    public void uyelik_sayfasinda_email_bolumune_girilir(String string){
        boynerMembershipPage.emailInput.sendKeys(string);
    }
    @Then("uyelik sayfasinda sifre bolumune {string} girilir")
    public void uyelik_sayfasinda_sifre_bolumune_girilir(String string){
        boynerMembershipPage.passwordInput.sendKeys(string);
    }
    @Then("uyelik sayfasinda cep telefonu bolumune {string} girilir")
    public void uyelik_sayfasinda_cep_telefonu_bolumune_girilir(String string){
        boynerMembershipPage.phoneInput.sendKeys(string);
    }
    @Then("uyelik sayfasinda uyelik metni {string} checkbox secilir")
    public void uyelik_sayfasinda_uyelik_metni_checkbox_secilir(String string) {
        boynerMembershipPage.membershipChechbox.click();
    }
    @Then("uyelik sayfasinda riza metni {string} checkbox secilir")
    public void uyelik_sayfasinda_riza_metni_checkbox_secilir(String string){
        boynerMembershipPage.consentTextCheckbox.click();
    }

    @Then("uye ol butonuna tiklanir")
    public void uye_ol_butonuna_tiklanir() {
        boynerMembershipPage.submitButton.click();
    }

    @Then("uye olunamadigi dogrulanir")
    public void uye_olunamadigi_dogrulanir() {
        String expectedUrl = "https://www.boyner.com.tr/uyelik?type=uye-ol";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.closeDriver();
    }

}
