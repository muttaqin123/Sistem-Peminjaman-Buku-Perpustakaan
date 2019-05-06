package Anggota;

public class Anggota {
    String nama;
    String prodi;
    String telp;
    String alamat;
    String status;

    public Anggota() {
    }

    public Anggota(String nama, String prodi, String telp, String alamat, String status) {
        this.nama = nama;
        this.prodi = prodi;
        this.telp = telp;
        this.alamat = alamat;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
