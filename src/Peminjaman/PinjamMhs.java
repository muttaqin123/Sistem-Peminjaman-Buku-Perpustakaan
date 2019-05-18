package Peminjaman;

import InterfacedanAbstract.AmbilData;
import java.util.ArrayList;

public class PinjamMhs extends AmbilData{
    Peminjaman mp;
    
    public PinjamMhs (){
        mp= new Peminjaman();
    }
    
    ArrayList<Peminjaman> a = new ArrayList();
    
    public PinjamMhs(Peminjaman mp) {
        this.mp = mp;
        a.add(mp);
    }
    
    @Override
    public void setSQL() {
        sql = ("Insert Into peminjaman("
                + "id_peminjaman,kodebuku,NIM,tgl_pinjam)"
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
                !mp.getTgl_pinjam().isEmpty() &&
                !mp.getKode_anggota().isEmpty()
                );
    }
    
}
