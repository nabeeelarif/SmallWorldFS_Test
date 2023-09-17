package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Fearures",
				glue = {"Steps", "AppHooks"},
				tags = "@filter_product",
				plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
				monochrome = true)

public class TestRunner_FilterProduct {

}
