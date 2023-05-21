package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Regression or @SmokeTest" ,//or dersek en az biri varsa calistir ;and dersek sadece iki tagida olanlar calisir    //hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        //or->ifdeki veya isareti gibi
        //and-> ifdeki ve isareti gibi
        //or da bunlardan en az biri olani calistir
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}


)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
