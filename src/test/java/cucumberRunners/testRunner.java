package cucumberRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue={"stepsDefinition"},
        monochrome = true,
        plugin = {"pretty", "json:target/JSONReports/BDD_Report.json"}
)
public class testRunner {
}
