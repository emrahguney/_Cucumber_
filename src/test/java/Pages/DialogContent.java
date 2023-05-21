package Pages;

import Utilities.GWD;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {
    /**PageFactory.initElements() bir Selenium özelliğidir ve belirtilen sınıfın
     sayfadaki web öğeleriyle eşleşen WebElements öğelerini başlatmak için kullanılır.
     Bu yöntem, Page Object Model (POM) kullanarak test senaryolarınızda kullanabileceğiniz
     web sayfasının öğelerini (button, input, dropdown vb.) belirli bir sınıfta tanımlamanıza olanak tanır.
     Bu öğeleri daha sonra test senaryolarınızda kullanabilirsiniz.
     GWD.getDriver() örneği WebDriver nesnesini döndürür ve
     this parametresi Page Object'in kendisini belirtir.
     Bu nedenle PageFactory.initElements(GWD.getDriver(),this) yöntemi,
     WebDriver nesnesi üzerinde belirtilen sayfadaki web öğelerini bulmak için Page Object'in öğelerini başlatır.*/
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    private WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement PriorityInput;

    @FindBy(xpath = "//span[@class='mat-slide-toggle-bar']/span")
    private WebElement feeActive;
    @FindBy(xpath="//mat-select//span[text()='Academic Period']")
    private WebElement academicPeriod;

    @FindBy(xpath="(//mat-option/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath="(//span[text()='Grade Level'])[1]")
    private WebElement gradeLevel;

    @FindBy(xpath="(//mat-option//span)[2]")
    private WebElement gradeLevel2;
    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;
    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;

    @FindBy (xpath = "//ms-integer-field[@formcontrolname='capacity']/input")
    private WebElement capacityInput;

    @FindBy(xpath = "(//mat-form-field[contains(@class,'mat-form-field')]//div[contains(@class,'mat-select-value')])[2]")
    public WebElement locationType;

    @FindBy(xpath = "//mat-option/span[text()=' Laboratory ']")
    public WebElement laboratory;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//span[@class='mat-slide-toggle-bar']")
    public WebElement activeButton;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement failerMessage;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    public WebElement failerAlreadyMessage;


    @FindBy(xpath = "//tbody[@role='rowgroup']//td[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "//span[text()=' 1000 ']")
    public WebElement maxSize;

    @FindBy(xpath = "//mat-paginator[contains(@class,'mat-paginator')]//mat-select")
    public WebElement sizeInput;

    @FindBy (xpath = "//ms-table[@matsortactive='priority']//div[text()=' # ']")
    public WebElement idRowCursor;

    @FindBy(xpath = "//tr/td[contains(@class,'name')]")
    public List<WebElement> nameListesi;

    @FindBy(xpath = "//tr/td[text()='Physic']")
    public WebElement fizik;
//tr/td[text()='asas']
@FindBy(xpath = "//tr/td[text()='asas']")
public WebElement asas;

@FindBy(xpath = "//td[@role='cell'][2]") //tr[contains(@class,'mat-row')]/td[2] ; //tr[contains(@class,'mat-row')]/td[contains(@class,'name')] ;//ms-table[@matsortactive='priority']//tbody//td[2]//td[@role='cell'][2]
public List<WebElement> registerListName;


@FindBy(xpath = "(//mat-paginator[contains(@class,'mat-paginator')]//span[@class='mat-button-wrapper'])[3]")
public WebElement nextPage;
    @FindBy(css = "[role='columnheader']")
    public WebElement orderSearchName;
    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")//ms-edit-button[@class='ng-star-inserted']
    public List<WebElement> editButton;

    @FindBy(xpath = "//div[@class='mat-paginator-range-actions']/button[contains(@class,'mat-button-disabled')][1]")//button[contains(@class,'focused')]
    public WebElement nextActive;

    @FindBy(xpath = "//div[@class='mat-paginator-range-actions']/button[contains(@class,'mat-button-disabled')][1]")
    public WebElement firstNext;

    @FindBy(xpath = "//ms-delete-button/button")
    public List<WebElement> deleteButton;

    @FindBy (xpath = "(//mat-paginator[contains(@class,'mat-paginator')]//button[@disabled='true'])[1]")
    public WebElement buttonDisabled;

    @FindBy(xpath = "//mat-paginator[contains(@class,'mat-paginator')]//button[3]")
    public WebElement NextButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    private WebElement iban;
    @FindBy(xpath = "(//mat-select[@role='combobox']//span[text()='Currency'])[2]")
    private WebElement currency;
    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement usd;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement nameInput2;
    @FindBy(xpath = "//ms-edit-button//span[@class='mat-button-wrapper']")
    public WebElement editButton2;
    @FindBy(xpath = "//div[contains(text(),'no data to display')]")
    public WebElement noDataToDisplay;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    public WebElement orderInput;
    public void deleteItem(String searchText){
        //kelimeyi text boxa gonder
        //butona bas
        //beklet
        //sil imajina bas
        //sil butonuna bas
        sendKeysFunction(searchInput,searchText);
        clickFunction(searchButton);

        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
       // wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        //fuse-progress-bar/*    bu 0 olana kadar beklet    //progress-bar-> developerin koydugu beklemedir boyle beklemelerde locator olarak progress-bar dan bulunur
        //bu progress bar da sayfada search yaparken beklemede progress bar in altinda elementleri cikiyor
        //altta 0 koymamizin sebebi element sayisidir
        //element sayisi 0 olana kadar bekle diyoruz
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));


        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);


    }

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "addButton": return addButton;
            case "saveButton": return saveButton;
            case "nameInput" : return nameInput;
            case "codeInput" : return codeInput;
            case "integrationCode": return integrationCode;
            case "PriorityInput": return PriorityInput;
            case"feeActive":return feeActive;
            case "academicPeriod" : return academicPeriod;
            case "academicPeriod1" : return academicPeriod1;
            case "gradeLevel" : return gradeLevel;
            case "gradeLevel2" : return gradeLevel2;
            case "priorityCode" : return priorityCode;
            case "toggleBar" : return toggleBar;
            case "capacityInput" : return capacityInput;
            case "shortName" : return shortName;
            case "locationType" : return locationType;
            case "failerMessage" : return failerMessage;
            case "iban" : return iban;
            case "currency": return currency;
            case "usd": return usd;
            case "nameInput2": return nameInput2;
            case "searchButton": return searchButton;
            case "editButton2": return editButton2;
            case "noDataToDisplay": return noDataToDisplay;
            case "laboratory":return laboratory;
            case "activeButton":return activeButton;
            case "orderInput": return orderInput;
            default: return null;
        }



    }



}
