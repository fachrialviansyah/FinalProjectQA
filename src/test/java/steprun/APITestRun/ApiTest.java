package steprun.APITestRun;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdef"},
        features = {"src/test/resources/api.feature"},
        plugin = {"pretty","html:reports/api/report-api.html", "json:reports/api/report-api.json"}
)

public class ApiTest {
}
