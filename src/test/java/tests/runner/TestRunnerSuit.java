package tests.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        monochrome = true,
        tags= {"@prod, @test,@Login,@ProductDetail, @HomePage, @BoutiqueDetail"},
        features= "src/test/java/tests/cucumber/features",
        glue = "tests.cucumber.steps"
)

public class TestRunnerSuit extends AbstractTestNGCucumberTests {

}
