package Buku;

import InterfacedanAbstract.AmbilData;

public class DaftarRakBuku extends AmbilData{

    RakBuku lemari;
    String idrak;
    public DaftarRakBuku (){
        lemari= new RakBuku();
    }
    
    public DaftarRakBuku(String idrak,RakBuku lemari) {
        this.lemari = lemari;
        this.idrak = idrak;
    }
    @Override
    public boolean validasiData() {
        
        return (
                !idrak.isEmpty() &&
                !lemari.getJumlah_bk().isEmpty() &&
                !lemari.getKode_buku().isEmpty() //&&
                );
    }
    
    @Override
    public void setSQL() {
        sql = ("Insert Into rakbuku("
                + "idrak,kodebuku,rakprodi,jumlahbuku)"
                + " Values("
                + "'"+idrak+"',"
                + "'"+lemari.getKode_buku()+"',"
                +"'"+lemari.getRakbuku()+"',"
                + "'"+lemari.getJumlah_bk()+"');");    
    }
}
