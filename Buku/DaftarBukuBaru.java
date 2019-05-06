package Buku;

import InterfacedanAbstract.AmbilData;
import java.util.HashMap;
import java.util.Map;

public class DaftarBukuBaru extends AmbilData{
    Buku ITERA;
    String kode;
    
    public DaftarBukuBaru (){
        ITERA= new Buku();
    }

    Map <String, Buku> book = new HashMap();

    public DaftarBukuBaru (String kode,Buku ITERA) {
        book.put(kode, ITERA);
        this.kode = kode;
        this.ITERA = ITERA;
    }
    
    @Override
    public boolean validasiData() {
        
        return (!kode.isEmpty() &&
                !ITERA.getJudul().isEmpty() &&
                !ITERA.getPenerbit().isEmpty() &&
                !ITERA.getPengarang().isEmpty() &&
                !ITERA.getTahun().isEmpty()
                );
    }
 
    @Override
    public void setSQL() {
        sql = ("Insert Into buku("
                + "kodebuku,judulbuku,pengarang,penerbit,tahunterbit)"
                + " Values("
                + "'"+kode+"',"
                + "'"+ITERA.getJudul()+"',"
                + "'"+ITERA.getPengarang()+"',"
                + "'"+ITERA.getPenerbit()+"',"
                + "'"+ITERA.getTahun()+"');");    
    }

    
}