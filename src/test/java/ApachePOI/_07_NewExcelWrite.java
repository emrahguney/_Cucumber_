package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //hafizada workbook ve sheet ini olusturcam
        XSSFWorkbook workbook=new XSSFWorkbook();//hafizada bir workbook olusturuldu
        XSSFSheet sheet= workbook.createSheet("Sayfa1");//icinde sheet olusturdum

        //Hafizada islemlere devam ediyorum
        Row yenisatir= sheet.createRow(0);
        Cell yeniHucre= yenisatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dunya");

        //path i verip yazdirma islemi yani SAVE islemi
        String path="src/test/java/ApachePOI/resource/MyCreateExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("islemler tamamlandi");//resorce un icinde acildi

    }
}
/*MySQL  4-5
JDBC   2-3

API Testing
POSTMAN      3
RestAssured  5-6

Jenkins  2-3*/