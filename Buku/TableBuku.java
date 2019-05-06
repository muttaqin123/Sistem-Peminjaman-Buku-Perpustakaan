package Buku;

import Database.conek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TableBuku {

    private final DefaultTableModel model;

    public TableBuku(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("kodebuku");
        model.addColumn("judulbuku");
        model.addColumn("pengarang");
        model.addColumn("penerbit");
        model.addColumn("tahunterbit"); 
        //getData(); 
    }
    
    public final void getData( ){
    //menghapus isi table tblGaji
    //model.getDataVector( ).removeAllElements( );
    //model.fireTableDataChanged( );

        try{
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "Select * from buku";
            ResultSet res   = stat.executeQuery(sql);

            //penelusuran baris pada tabel tblGaji dari database
            while(res.next ()){
                Object[ ] obj = new Object[5];
                obj[0] = res.getString("kodebuku"); 
                obj[1] = res.getString("judulbuku");
                obj[2] = res.getString("pengarang"); 
                obj[3] = res.getString("penerbit");
                obj[4] = res.getString("tahunterbit"); 

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
            String sql        = "SELECT * FROM buku WHERE kodebuku LIKE '%"+key+"%'"
                + "OR judulbuku LIKE '%"+key+"%' "
                + "OR pengarang LIKE '%"+key+"%'"
                + "OR penerbit LIKE '%"+key+"%'"
                + "OR tahunterbit LIKE '%"+key+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[5];
                obj[0] = res.getString("kodebuku"); 
                obj[1] = res.getString("judulbuku");
                obj[2] = res.getString("pengarang"); 
                obj[3] = res.getString("penerbit");
                obj[4] = res.getString("tahunterbit"); 

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
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql     = "DELETE FROM buku WHERE kodebuku = '"+key+"';";
            stat.executeUpdate(sql);

        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    
}
