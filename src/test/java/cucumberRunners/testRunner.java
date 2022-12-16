package cucumberRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue={"stepsDefinition"},
        plugin = { "pretty", "html:src/test/reports/cucumber.html" },
        monochrome = true
)
public class testRunner {
}
