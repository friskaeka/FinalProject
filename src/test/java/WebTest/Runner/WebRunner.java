package WebTest.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"WebTest.StepDef"},
        features = {"src/test/java/WebTest/Feature"},
        tags = "@web",
        plugin = {"pretty"},
        monochrome = true

)

public class WebRunner {
}
