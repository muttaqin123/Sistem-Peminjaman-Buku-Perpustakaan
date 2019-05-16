package Peminjaman;

import Database.conek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablePeminjaman{
    private final DefaultTableModel model;
    
    public TablePeminjaman(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("id peminjaman");
        model.addColumn("kode buku");
        model.addColumn("NIM");
        model.addColumn("NIP");
        model.addColumn("Tanggal Pinjam");
        //getData(); 
    }
    
    public final void getData( ){
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "Select * from peminjaman";
            ResultSet res   = stat.executeQuery(sql);
            
            while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("id_peminjaman"); 
                obj[1] = res.getString("kodebuku");
                obj[2] = res.getString("NIM");
                obj[3] = res.getString("NIP"); 
                obj[4] = res.getString("Tgl_pinjam"); 

                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getCari(String key ){
        try{
         
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "SELECT * FROM mahasiswa WHERE NIM LIKE '%"+key+"%'"
                + "OR nama LIKE '%"+key+"%'"
                + "OR prodi LIKE '%"+key+"%'"
                + "OR alamat LIKE '%"+key+"%'"
                + "OR telepon LIKE '%"+key+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("NIM"); 
                obj[1] = res.getString("nama");
                obj[2] = res.getString("prodi"); 
                obj[3] = res.getString("alamat");
                obj[4] = res.getString("telepon"); 
                obj[5] = res.getString("status"); 
                
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    
    public final void getHapus(String key ){
        try{
          
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql     = "DELETE FROM mahasiswa WHERE NIM = '"+key+"';";
            stat.executeUpdate(sql);
            
            Statement stat2 = (Statement) conek.GetConnection().createStatement( );
            String sql2     = "SELECT * FROM mahasiswa;";
            ResultSet res   = stat2.executeQuery(sql2);
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
}