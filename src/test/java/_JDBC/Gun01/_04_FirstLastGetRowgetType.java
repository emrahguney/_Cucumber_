package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowgetType extends JDBCParent {
    @Test
    public void Test() throws SQLException {

        ResultSet rs = statement.executeQuery("select city from city");

        rs.last(); //son satira gider
        System.out.println("son satir sehir adi = "+rs.getString(1));

        rs.first(); //ilk satira gider
        System.out.println("son satir sehir adi = "+rs.getString(1));

        rs.last();
        int kacincisatirdayim= rs.getRow(); // kacinci satirda oldugumu verir.
        System.out.println(kacincisatirdayim);


    }
}