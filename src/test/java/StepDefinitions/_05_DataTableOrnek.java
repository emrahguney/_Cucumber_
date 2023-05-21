package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;
public class _05_DataTableOrnek {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
    }
    @And("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username and password= " + username +" "+password);
    }
    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable items) {

        List<String> listItems=items.asList(String.class);//datatable daki verileri Stringe donusturup bir list e atmamizi istedigi icin liste attik
        for (String a:listItems){
            System.out.println("a = " + a);
        }
    }
    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable items) {
        List <List <String> > a =items.asLists(String.class);
        for (int i = 0; i <a.size() ; i++) {
            System.out.println("a = " + a.get(i).get(0)+" "+a.get(i).get(1));
        }
    }
}
/*List<String> dialog=items.asList(String.class); kodu,
Selenium WebDriver kütüphanesi içindeki bir özellik olan asList() yöntemini kullanarak
 bir dize (String) listesi oluşturur. Bu yöntem, bir WebElement listesindeki öğeleri
 belirtilen bir veri türüne dönüştürmek için kullanılır.
Burada, items öğesi bir WebElement listesi olmalıdır. asList() yöntemi,
 bu WebElement listesindeki her bir öğeyi String veri türüne dönüştürür ve sonuç olarak
  bir List<String> döndürür.
List<String> dialog ifadesi, dönüştürülmüş dizelerin depolanacağı değişkeni tanımlar.
Bu değişkene, asList() yöntemi tarafından dönüştürülen String listesi atandı.
Bu özellik özellikle bir web sayfasındaki metinleri toplamak için kullanışlıdır.
Örneğin, bir web sayfasındaki bir dizi metin kutusunun metinlerini toplamak ve bunları
bir dize listesinde depolamak isteyebilirsiniz. asList() yöntemi, bu metin kutularının öğelerini belirleyebilir
 ve bunları bir String listesi halinde dönüştürebilir.

 asList() yöntemi, Java dilinde java.util.Arrays sınıfı tarafından sağlanan bir yöntemdir ve
 bir dizi (array) nesnesini bir liste (list) nesnesine dönüştürmek için kullanılır.
Bu yöntem, bir dizi nesnesindeki öğeleri bir liste nesnesine kopyalar ve
bu liste nesnesini döndürür. Dönüştürülen liste nesnesi, orijinal dizi nesnesindeki öğelerin sıralamasını
 ve sayısını korur.
 Örneğin, aşağıdaki kod örneğinde bir dizi nesnesi olan myArray oluşturulur ve
 asList() yöntemi kullanılarak bu dizi nesnesi bir liste nesnesine (myList) dönüştürülür:

 String[] myArray = {"elma", "armut", "çilek"};
List<String> myList = Arrays.asList(myArray);
asList() yöntemi, özellikle verileri toplamak, filtrelemek veya
sıralamak için listeleri kullanırken dizi nesnelerinin kullanılmadığı durumlarda kullanışlıdır.

String.class, Java dilinde bir Class nesnesidir ve String veri türünün sınıfını temsil eder.

Selenium'da, asList() yöntemi çağrısında, String.class parametresi,
 dönüştürülecek dizelerin veri türünü belirtir. Yani, asList() yöntemi, orijinal dizi nesnesindeki öğeleri,
 belirtilen veri türüne dönüştürerek yeni bir liste nesnesi oluşturur.

Örneğin, aşağıdaki kod örneğinde, bir dizi nesnesi olan myArray oluşturulur ve asList() yöntemi kullanılarak
 bu dizi nesnesi bir liste nesnesine (myList) dönüştürülür. String.class parametresi,
 dizelerin String veri türüne dönüştürüleceğini belirtir:

String[] myArray = {"elma", "armut", "çilek"};
List<String> myList = Arrays.asList(myArray);
List<String> myStringList = myList.asList(String.class);

asList() yöntemi, belirtilen veri türüne göre dönüştürme yapar. Bu nedenle,
örneğin Integer.class parametresi kullanırsanız, dönüştürülen öğeler Integer veri türüne dönüştürülür.


 */