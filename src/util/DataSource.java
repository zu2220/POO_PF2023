
package util;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DataSource {
    private static Connection conn;
    public static Connection DataSource(){
        SQLServerDataSource sqds=new SQLServerDataSource();
    
        try{
            sqds.setServerName("OSCARZARI\\SQLEXPRESS");
            sqds.setDatabaseName("ControlPV3");
            sqds.setPortNumber(1433);
            sqds.setUser("usuarioPOO");
            sqds.setPassword("123");
            conn=sqds.getConnection();

           }
        catch(SQLException ex){
            ex.printStackTrace();
    
           }
        return conn;
    }
}
