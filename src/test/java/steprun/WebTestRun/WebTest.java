package steprun.WebTestRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdef"},
        features = {"src/test/resources/web.feature"},
        plugin = {"pretty","html:reports/web/report_web.html", "json:reports/web/report_web.json"}
)

public class WebTest {
}
