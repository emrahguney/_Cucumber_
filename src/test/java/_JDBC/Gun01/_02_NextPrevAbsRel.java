package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {


    @Test
    public void NextPrev() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from language");

        rs.next();
        System.out.println("1. satir dil adi = "+rs.getString(2)); // 2-> colomn sirasi  English
        rs.next();
        System.out.println("2. satir dil adi = "+rs.getString(2)); // Italian
        rs.next();
        System.out.println("3. satir dil adi = "+rs.getString(2)); // Japanese

        rs.previous(); // 2. satira gitti
        System.out.println("1 geri satir dil adi = "+rs.getString(2)); // Italian


    }

    @Test
    public void AbsoluteRelative() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from film");
        //rs.next(); sonraki satir
        //rs.previous(); onceki satir
        //rs.absolute(10); bastan itibaren 10. satira gider
        //rs.relative(10): bulundugu yerden 10. satira gider
        //rs.absolute(-10); -(eksi) sondan demektir, sondan 10. satiri getirir
        //rs.relative(-5); -(eksi) bulundugu yerden 5 satir geri gider



        rs.absolute(10); // 10. satira git

        System.out.println("10. satir film adi = "+rs.getString("title"));

        rs.relative(5); // 15. satira gider.Niye ? Cunku en son bulundugu yerden 5 satir sonrasina gider

        System.out.println("15. satir film adi = "+rs.getString("title"));

        //rs.absolute(5); // direk 5. satira gider

        rs.absolute(-10); // sondan 10. satira git
        System.out.println("sondan 10. satir - title ="+rs.getString("title"));


    }

}
