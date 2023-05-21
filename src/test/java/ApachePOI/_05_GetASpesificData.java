package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpesificData {
    public static void main(String[] args) throws IOException {
        /**
         * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
         * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
         * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
         * bulup ve sonucun döndürülmesi için metod kullanınız.
         * src/test/java/ApachePOI/resources/LoginData.xlsx
         */
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        Scanner scan = new Scanner(System.in);
        System.out.print("Hangi bilgiyi istiyosun = ");
        String bilgi = scan.nextLine().toLowerCase();

        switch (bilgi) {
            case "username":bilgiler(sheet,0);break;
            case "password":bilgiler(sheet,1);break;
            case "adress":bilgiler(sheet,2);break;
            case "zipcode":bilgiler(sheet,3);break;
            case "city":bilgiler(sheet,4);break;
            case "state":bilgiler(sheet,5);break;


        }
    }

    public static void bilgiler(Sheet a,int b) {

            for (int j = 1; j < a.getRow(b).getPhysicalNumberOfCells(); j++) {
                System.out.print(a.getRow(b).getCell(j) + "\t");
            }
            System.out.println();
        }

}