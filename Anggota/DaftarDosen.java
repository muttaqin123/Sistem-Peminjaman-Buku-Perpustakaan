package Anggota;

import InterfacedanAbstract.AmbilData;
import java.util.HashMap;
import java.util.Map;

public class DaftarDosen extends AmbilData {
    Anggota Dosen;
    String NIP;
    
    public DaftarDosen (){
        Dosen= new Anggota();
    }

    Map <String, Anggota> dosen = new HashMap();

    public DaftarDosen (String NIP, Anggota Dosen) {
        dosen.put(NIP, Dosen);
        this.NIP=NIP;
        this.Dosen = Dosen;
    }
    
    @Override
    public boolean validasiData() {
        
        return (!NIP.isEmpty() &&
                !Dosen.getNama().isEmpty() &&
                !Dosen.getProdi().isEmpty() &&
                !Dosen.getAlamat().isEmpty() &&
                !Dosen.getTelp().isEmpty() && 
                !Dosen.getStatus().isEmpty()
                );
    }

    @Override
    public void setSQL() {
        sql = ("Insert Into Dosen("
                + "NIP,nama,prodi,alamat,telepon,status)"
                + " Values("
                + "'"+NIP+"',"
                + "'"+Dosen.getNama()+"',"
                + "'"+Dosen.getProdi()+"',"
                + "'"+Dosen.getAlamat()+"',"
                + "'"+Dosen.getTelp()+"',"
                + "'"+Dosen.getStatus()+"');");
    }
}
