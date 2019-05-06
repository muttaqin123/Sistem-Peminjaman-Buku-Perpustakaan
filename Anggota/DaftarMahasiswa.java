package Anggota;

import InterfacedanAbstract.AmbilData;
import java.util.HashMap;
import java.util.Map;

public class DaftarMahasiswa extends AmbilData {
    Anggota mhs;
    String NIM;
    
    public DaftarMahasiswa (){
        mhs= new Anggota();
    }

    Map <String, Anggota> mahasiswa = new HashMap();

    public DaftarMahasiswa (String NIM, Anggota mhs) {
        mahasiswa.put(NIM, mhs);
        this.NIM=NIM;
        this.mhs = mhs;
    }
    
    @Override
    public boolean validasiData() {
        
        return (!NIM.isEmpty() &&
                !mhs.getNama().isEmpty() &&
                !mhs.getProdi().isEmpty() &&
                !mhs.getAlamat().isEmpty() &&
                !mhs.getTelp().isEmpty() && 
                !mhs.getStatus().isEmpty()
                );
    }

    @Override
    public void setSQL() {
        sql = ("Insert Into mahasiswa("
                + "NIM,nama,prodi,alamat,telepon,status)"
                + " Values("
                + "'"+NIM+"',"
                + "'"+mhs.getNama()+"',"
                + "'"+mhs.getProdi()+"',"
                + "'"+mhs.getAlamat()+"',"
                + "'"+mhs.getTelp()+"',"
                + "'"+mhs.getStatus()+"');");    
    }

    
}
