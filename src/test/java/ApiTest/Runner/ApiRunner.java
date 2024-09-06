package ApiTest.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ApiTest.StepDef"},
        features = {"src/test/java/ApiTest/Feature"},
        tags = "@api",
        plugin = {"pretty"},
        monochrome = true

)

public class ApiRunner {
}
