package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(

        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class _08_TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass//(alwaysRun = true)->BeforeClass hatasi alirsan bunu ekle
    @Parameters("browserTipi")
    public void beforeClass(String browser){
        //browser tip su an elimde
        GWD.threadBrowserSet(browser);

    }
}