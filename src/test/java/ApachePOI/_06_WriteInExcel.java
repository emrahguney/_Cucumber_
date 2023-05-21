package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInExcel {
    public static void main(String[] args) throws IOException {

        //once exceli acarim,sheete ulasirim
        //islemlerimi eklerim (hafizada)
        //yazma modunda acip , hafizadaki islemleri kaydederim.

        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);

        //HAFIZADA ISLEMLERE DEVAM EDIYORUM.

        Row yeniSatir= sheet.createRow(sheet.getPhysicalNumberOfRows());//tekrar tekrar run edince dolu rowu pas gecip diger bos rowa yaziyor
        Cell yeniHucre= yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dunya");

        //SIRA KAYDETMEYE GELDI AMA ONCE OKUMA MODUNDAN CIKIP YAZMA MODUNU ACMAMIZ LAZIM
        //YAZMA MODUNA GECMEM LAZIM
        inputStream.close();//okuma modu kapatildi

        //YAZMA MODUNDA ACTIM
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream); //SAVE ISLEMI YAPILDI
        workbook.close();//HAFIZAYI BOSALTMAK ICIN YAZILDI
        outputStream.close();//HAFIZAYI BOSALTMAK ICIN YAZILDI

        System.out.println("yazma islemi yapildi");

    }
}
