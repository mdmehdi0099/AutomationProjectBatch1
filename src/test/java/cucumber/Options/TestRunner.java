package cucumber.Options;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        glue = {"stepDefinitions","utils"},
        plugin = {"pretty","html:target/Reports/HtmlReports.html"},
        tags = ("@Test123"))
public class TestRunner {
}
