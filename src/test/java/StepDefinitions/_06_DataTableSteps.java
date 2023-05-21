package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import javax.xml.crypto.Data;
import java.util.List;

public class _06_DataTableSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {

        List<String> strButtons=items.asList(String.class);


        for (String a: strButtons){
            WebElement element=ln.getWebElement(a);//webelementi bul
        ln.clickFunction(element);//webelemente tiklat
        }
    }


    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {
        List<String> dialog=items.asList(String.class);

        for (String a: dialog){
            WebElement element=dc.getWebElement(a);
            dc.clickFunction(element);

        }
    }


    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size() ; i++) {

            WebElement element=dc.getWebElement( items.get(i).get(0));
            dc.sendKeysFunction(element,  items.get(i).get(1));

        }
    }

    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable item) {
        List<String> dialog=item.asList(String.class);

        for (String a:dialog){

            dc.deleteItem(a);
        }

    }


    @Then("There is no data to display should be displayed")
    public void thereIsNoDataToDisplayShouldBeDisplayed() {
        dc.waitUntilLoading();
        dc.verifyContainsTextFunction(dc.noDataToDisplay,"no data to display");
    }
}
