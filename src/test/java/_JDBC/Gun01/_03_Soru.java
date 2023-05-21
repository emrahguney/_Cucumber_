package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru extends JDBCParent {

    // city tablosundaki tum kayitlardaki isimleri next ile yazdiriniz

    @Test
    public void Test() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city");

        //do {rs.next();System.out.println(rs.getString(2));} while (!rs.getString(2).equalsIgnoreCase("a"));

        int rowCount=0;
        while(rs.next()==true){
            System.out.println(rs.getString("city"));
            rowCount++;
        }
        System.out.println("rowcount = "+rowCount);
        // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
        // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

    }
}