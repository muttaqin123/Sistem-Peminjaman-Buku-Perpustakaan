package AdminPerpus;

public class Admin {
    private String nama;
    private String username;
    private String password;
    private String nip;
    

    public Admin() {
    }

    public Admin(String nip,String nama, String username, String password) {
        this.nip = nip;
        this.nama = nama;
        this.username = username;
        this.password = password;
        
    }
    

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
