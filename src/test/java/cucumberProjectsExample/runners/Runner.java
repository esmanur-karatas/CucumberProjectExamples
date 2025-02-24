package cucumberProjectsExample.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports"
        },
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"cucumberProjectsExample/stepDefinitions", "hooks"},
        tags = "@boyner",
        dryRun = false
)
public class Runner
{
}
