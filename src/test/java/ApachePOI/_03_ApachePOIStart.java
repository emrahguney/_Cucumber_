package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        //dosyanin yolunu degiskene atalim
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        //JavaDosya okuma islemcisine dosyanin yolunu veriyoruz
        //boylece program ile dosya arasinda baglanti olustu
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);
        //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        // hafızada workbook u alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1");//getSheet(0); buda index ile bulabiliriz

        //istenen Satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);

        Cell hucre=satir.getCell(0);

        System.out.println(hucre);






    }
}
