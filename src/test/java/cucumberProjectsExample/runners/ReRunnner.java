package cucumberProjectsExample.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber1.json",  //plugin ekledikten sonra bunu cucumber report için ekle
                "junit:test-output/htmlReport/cucumber.xml", //xml report için
                "rerun:Failed/failedScenarios.txt" // bu satirdaki kod kosulan testlerden hata verenlerin yeniden ReRunner classi tarafindan kosulmasini saglar
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "@Failed/failedScenarios.txt",//hata veren dosyalarin yolu
        glue = {"cucumberProjectsExample/stepDefinitions","hooks"},   //stepdefinitions path
        dryRun = false
)
public class ReRunnner {
}
