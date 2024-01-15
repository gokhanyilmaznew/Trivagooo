package project.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "html:testOutput/reports/cucumberRegression.html",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        glue = "project.stepDefinitions",
        tags = "@Smoke" ,
        dryRun = false
)
public class RunnerUI {
}
