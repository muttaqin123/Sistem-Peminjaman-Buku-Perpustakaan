package Database;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conek {
    private static Connection koneksi;
    
    public static Connection GetConnection()throws SQLException{
        if(koneksi==null){
            new Driver();
            
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/Perpustakaan","root","");
        }
        return koneksi;
    }
    
}
