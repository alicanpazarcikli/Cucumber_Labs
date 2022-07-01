package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue="stepDefinitions",
        dryRun =false,
       // plugin = { "pretty","html:target/default-cucumber-reports.html","json:target/cucumber.json",
       // "junit:target/cukes.xml","rerun:target/rerun.text"},
        tags = "@P40"
)

public class TestRunner {


}
