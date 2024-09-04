
package hotel.management.system;
import java.sql.*;

public class Conn {
    Connection c; //for connecting sql database
    Statement s;
    Conn()
    {
        //1st rule: register the driver
        try { //because drivers throw exception or error
        Class.forName("com.mysql.cj.jdbc.Driver");//for accessing drivers
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShubhamHMS","root","Swiggy@1234");
        s=c.createStatement();
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
}
}
