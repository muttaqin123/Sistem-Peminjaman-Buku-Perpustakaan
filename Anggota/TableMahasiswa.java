package Anggota;

import Database.conek;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TableMahasiswa{
    
    
    private final DefaultTableModel model;
    
    public TableMahasiswa(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Prodi");
        model.addColumn("Alamat");
        model.addColumn("Telepon");
        model.addColumn("Status");
        //getData(); 
    }
    
    public final void getData( ){
        try{
            
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "Select * from mahasiswa";
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
    public final void getCari(String key ){
    //menghapus isi table tblGaji
    //model.getDataVector( ).removeAllElements( );
    //model.fireTableDataChanged( );

        try{
            //membuat statemen pemanggilan data pada table tblGaji dari database
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
    //menghapus isi table tblGaji
    //model.getDataVector( ).removeAllElements( );
    //model.fireTableDataChanged( );

        try{
            //membuat statemen pemanggilan data pada table tblGaji dari database
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
    
    public final void getUpdate(String nama,String NIM,String alamat,String telepon){
        try{
            String sql = "UPDATE mahasiswa SET nama= '"+nama
                    +"',alamat= '"+alamat+"',telepon= '"+telepon+"' where NIM = '"+NIM+"';";
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di update");

        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
}