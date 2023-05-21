package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;


public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {

        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");

    }


}