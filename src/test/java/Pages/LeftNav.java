package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class LeftNav extends Parent{
//sol taraftaki menuler burda
    public LeftNav() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy (css="[data-icon='user-tag']")
    public WebElement citizenShip;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;
    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement schoolLocations;

@FindBy(xpath = "//span[text()='States']")
private WebElement states;
@FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
private WebElement bankaccount;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "(//span[text()='Departments'])[1]")
    private WebElement Departments;


    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citizenShip" : return citizenShip;
            case "nationalities" : return nationalities;
            case "fees" : return fees;
            case "entranceExamsOne" : return entranceExamsOne;
            case "setupTwo" : return setupTwo;
            case "entranceExamsTwo" : return entranceExamsTwo;
            case "schoolSetup" : return schoolSetup;
            case "schoolLocations" : return schoolLocations;
            case "states" : return states;
            case "bankaccount": return bankaccount;
            case "gradeLevels":return gradeLevels;
            case "Departments": return Departments;



            default: return null;
        }

    }

}
