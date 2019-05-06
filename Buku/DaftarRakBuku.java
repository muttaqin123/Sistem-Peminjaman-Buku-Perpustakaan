package Buku;

import InterfacedanAbstract.AmbilData;

public class DaftarRakBuku extends AmbilData{

    RakBuku lemari;
    
    public DaftarRakBuku (){
        lemari= new RakBuku();
    }
    
    public DaftarRakBuku(RakBuku lemari) {
        this.lemari = lemari;
        
    }
    @Override
    public boolean validasiData() {
        
        return (
                !lemari.getJumlah_bk().isEmpty() &&
                !lemari.getKode_buku().isEmpty() //&&
                );
    }
    
    @Override
    public void setSQL() {
        sql = ("Insert Into rakbuku("
                + "kodebuku,rakprodi,jumlahbuku)"
                + " Values("
                + "'"+lemari.getKode_buku()+"',"
                +"'"+lemari.getRakbuku()+"',"
                + "'"+lemari.getJumlah_bk()+"');");    
    }
}
