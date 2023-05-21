package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send The query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {

        //DB den gerekli bilgileri alalim
       // ArrayList<ArrayList<String>> dbList= DBUtility.getListData(sorgu);
       // System.out.println("dblist = "+dbList);
       /* for (int i = 0; i <dbList.size() ; i++) {

            System.out.print(dbList.get(i).get(0)+" ");
            System.out.println(dbList.get(i).get(1).trim());

        }*/

        //DB den gerekli bilgileri alalim
        ArrayList<ArrayList<String>> dbList= DBUtility.getListData(sorgu);
        //UI dan gerekli bilgileri alalim
        DialogContent dc=new DialogContent();
        List<WebElement> UIList=dc.nameList;

        for (int i = 0; i < dbList.size() ; i++) {

            System.out.print(dbList.get(i).get(1).trim());
            System.out.println("\t"+UIList.get(i).getText());

            Assert.assertEquals(dbList.get(i).get(1),UIList.get(i).getText());
        }

    }
}
