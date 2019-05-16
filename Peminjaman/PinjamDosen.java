package Peminjaman;

import InterfacedanAbstract.AmbilData;
import java.util.ArrayList;

public class PinjamDosen extends AmbilData{
    Peminjaman mp;
    
    public PinjamDosen (){
        mp= new Peminjaman();
    }
    
    ArrayList<Peminjaman> a = new ArrayList();
    
    public PinjamDosen(Peminjaman mp) {
        this.mp = mp;
        a.add(mp);
    }
    
    @Override
    public void setSQL() {
        sql = ("Insert Into peminjaman("
                + "id_peminjaman,kodebuku,NIP,tgl_pinjam)"
                + " Values("
                + "'"+mp.getId_peminjaman()+"',"
                + "'"+mp.getKodebuku()+"',"
                + "'"+mp.getKode_anggota()+"',"
                + "'"+mp.getTgl_pinjam()+"');");    
    }
    
    @Override
    public boolean validasiData() {
        return (!mp.getId_peminjaman().isEmpty() &&
                !mp.getKodebuku().isEmpty() &&
                !mp.getKode_anggota().isEmpty() &&
                !mp.getTgl_pinjam().isEmpty() 
                );
    }
    
}
