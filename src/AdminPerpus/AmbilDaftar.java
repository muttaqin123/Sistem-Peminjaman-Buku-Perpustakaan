package AdminPerpus;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public abstract class AmbilDaftar {
    protected String sql;
    private final Connection Koneksi=new Koneksi().getKoneksi();
    private ResultSet  rs;
    private Statement st;
    
    public abstract void setSQL(String username,String password);
    
    public  abstract boolean  validasiData();
   
    public void Pesan(String text){
        JOptionPane.showMessageDialog(null, text);
    }
   
    public int getDaftar(){
       setSQL();
        try {
            st = Koneksi.createStatement();
            st.executeUpdate(sql);
            Pesan("Berhasil");
            return 0;
        } catch (SQLException ex) {
            Pesan("Gagal Mendaftar \n"+ex.getMessage());   
            
        
        }
        return -1;
   }
   public abstract  void setSQL();
}