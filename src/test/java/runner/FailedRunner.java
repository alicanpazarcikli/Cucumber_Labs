package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.text",
        glue = "stepDefinitions",
        dryRun = false,
        plugin = {"pretty","html:target/default-cucumber-reports.html",
        "json:target/cucumber.json","rerun:target/rerun.text"}
)

public class FailedRunner {
}
