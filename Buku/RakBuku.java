package Buku;

public class RakBuku {
    
    private String kode_buku;
    private String rakbuku;
    private String jumlah_bk;

    public RakBuku() {
    }

    public RakBuku(String kode_buku, String rakbuku, String jumlah_bk) {
        this.kode_buku = kode_buku;
        this.jumlah_bk = jumlah_bk;
        this.rakbuku=rakbuku;
    }

    public String getRakbuku() {
        return rakbuku;
    }

    public void setRakbuku(String rakbuku) {
        this.rakbuku = rakbuku;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJumlah_bk() {
        return jumlah_bk;
    }

    public void setJumlah_bk(String jumlah_bk) {
        this.jumlah_bk = jumlah_bk;
    }
    
}
