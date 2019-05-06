package Anggota;

import Database.conek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TableDosen{
    
    
    private final DefaultTableModel model;
    
    public TableDosen(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIP");
        model.addColumn("Nama");
        model.addColumn("Prodi");
        model.addColumn("Alamat");
        model.addColumn("Telepon");
        model.addColumn("Status");
        //getData(); 
    }
    
    public final void getData( ){//menghapus isi table tblGaji
    //model.getDataVector( ).removeAllElements( );
    //model.fireTableDataChanged( );

        try{
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "Select * from dosen";
            ResultSet res   = stat.executeQuery(sql);

            //penelusuran baris pada tabel tblGaji dari database
            while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("NIP"); 
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
            String sql        = "SELECT * FROM dosen WHERE NIP LIKE '%"+key+"%'"
                + "OR nama LIKE '%"+key+"%' "
                + "OR prodi LIKE '%"+key+"%'"
                + "OR alamat LIKE '%"+key+"%'"
                + "OR telepon LIKE '%"+key+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("NIP"); 
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
            String sql     = "DELETE FROM dosen WHERE NIP = '"+key+"';";
            stat.executeUpdate(sql);
            
            Statement stat2 = (Statement) conek.GetConnection().createStatement( );
            String sql2     = "SELECT * FROM dosen;";
            ResultSet res   = stat2.executeQuery(sql2);
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
}