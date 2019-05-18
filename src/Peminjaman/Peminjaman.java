package Peminjaman;

public class Peminjaman {
    private String id_peminjaman;
    private String kodebuku;
    private String kode_anggota;
    private String tgl_pinjam;

    public Peminjaman(String id_peminjaman, String kodebuku, String kode_anggota, String tgl_pinjam) {
        this.id_peminjaman = id_peminjaman;
        this.kodebuku = kodebuku;
        this.kode_anggota = kode_anggota;
        this.tgl_pinjam = tgl_pinjam;
    }

    Peminjaman() {
    }

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getKode_anggota() {
        return kode_anggota;
    }

    public void setKode_anggota(String kode_anggota) {
        this.kode_anggota = kode_anggota;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }
    
    
}
