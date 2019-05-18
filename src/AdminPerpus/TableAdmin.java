package AdminPerpus;

import Database.conek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TableAdmin{
    
    
    private final DefaultTableModel model;
    
    public TableAdmin(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIP");
        model.addColumn("Nama");
        model.addColumn("UserName");
    }

    public final void getData( ){
        try{
            
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "Select NIP,nama, username from admin";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[3];
                obj[0] = res.getString("NIP"); 
                obj[1] = res.getString("nama");
                obj[2] = res.getString("UserName");

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
            String sql        = "Select NIP,nama, username from admin WHERE NIP LIKE '%"+key+"%'"
                + "OR nama LIKE '%"+key+"%' "
                + "OR username LIKE '%"+key+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[3];
                obj[0] = res.getString("NIP"); 
                obj[1] = res.getString("nama");
                obj[2] = res.getString("UserName");

                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    
    public final void getHapus(String key ){
    
        try{
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql     = "DELETE FROM admin WHERE NIP = '"+key+"';";
            stat.executeUpdate(sql);
            
            Statement stat2 = (Statement) conek.GetConnection().createStatement( );
            String sql2     = "Select NIP,nama, username FROM admin;";
            ResultSet res   = stat2.executeQuery(sql2);
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

}