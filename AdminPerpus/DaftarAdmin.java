package AdminPerpus;

public class DaftarAdmin extends AmbilDaftar{
    Admin mp;
    
    public DaftarAdmin (){
        mp= new Admin();
    }
    
    public DaftarAdmin (Admin mp) {
        this.mp = mp;
    }

    @Override
    public void setSQL(String username,String password) {
        sql = "SELECT password FROM Admin Where username = '"+username+"'"+"' AND password='"+password+"'";
    }

    @Override
    public boolean validasiData() {
        
        return (!mp.getNama().isEmpty() &&
                !mp.getUsername().isEmpty() //&&
               // !mp.getnip().isEmpty()
                );
    }

    @Override
    public void setSQL() {
        sql = ("Insert Into Admin("
                + "NIP,nama,username,password)"
                + " Values("
                + "'"+mp.getNip()+"',"
                + "'"+mp.getNama()+"',"
                + "'"+mp.getUsername()+"',"
                + "'"+mp.getPassword()+"');");    
    }
    
}
