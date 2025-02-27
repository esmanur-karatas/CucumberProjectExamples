package cucumberProjectsExample.stepDefinitions;

import cucumberProjectsExample.pages.EtsTurLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumberProjectsExample.utilities.ConfigurationReader;
import cucumberProjectsExample.utilities.Driver;
import cucumberProjectsExample.utilities.ReusableMethods;
import org.junit.Assert;

public class EtsTurLoginStepDefinition {

    EtsTurLoginPage etsTurLoginPage = new EtsTurLoginPage();
    @Given("{string} sitesine gidilir.")
    public void sitesineGidilir(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
    }

    @Given("hesabım butonu üstüne gidilir.")
    public void hesabım_butonu_üstüne_gidilir() {
        ReusableMethods.hover(etsTurLoginPage.account);
    }

    @When("hesabım butonuna basilir")
    public void hesabım_butonuna_basilir() {
        etsTurLoginPage.account.click();

    }

    @When("e posta girilir.")
    public void e_posta_girilir() {
        etsTurLoginPage.inputEmail.sendKeys("deneme@gmail.com");

    }

    @When("password girilir.")
    public void password_girilir() {
        etsTurLoginPage.inputPassword.sendKeys("denemeA23");
    }

    @When("giriş yap butonuna basilir.")
    public void giriş_yap_butonuna_basilir() {
        etsTurLoginPage.loginButton.click();
    }

    @Then("sayfaya gidilmediği dogrulanir")
    public void sayfaya_gidilmediği_dogrulanir() {
        Assert.assertTrue(etsTurLoginPage.verifyLogin.isDisplayed());
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        etsTurLoginPage.signUp.click();
    }

    @And("ad girilir")
    public void adGirilir() {
        etsTurLoginPage.signupInputName.sendKeys("deneme");
    }

    @And("soyad girilir")
    public void soyadGirilir() {
        etsTurLoginPage.signupInputSurname.sendKeys("dene");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
        etsTurLoginPage.signupInputEmail.sendKeys("deneme@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        etsTurLoginPage.signupInputPhone.sendKeys("5555555555");
    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        etsTurLoginPage.signupInputPassword.sendKeys("ıurfhncuı2W");
    }

    @And("password yeniden girlir")
    public void passwordYenidenGirlir() {
        etsTurLoginPage.signupInputPasswordRepeat.sendKeys("ıurfhncuı2W");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        etsTurLoginPage.signUpAcceptKvkChecbox.click();
    }

    @And("kampanyalara checkbox secilir")
    public void kampanyalaraCheckboxSecilir() {
        etsTurLoginPage.signUpAllowMarketingChecbox.click();
    }

    @When("uyelik sayfasinda uye ol butonuna basilir")
    public void uyelikSayfasindaUyeOlButonunaBasilir() {
        etsTurLoginPage.signUpButton.click();
    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {
        Assert.assertTrue(etsTurLoginPage.verifySignUp.isDisplayed());

    }


}
