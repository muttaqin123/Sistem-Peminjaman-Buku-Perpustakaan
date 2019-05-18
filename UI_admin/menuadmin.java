package UI_admin;

import AdminPerpus.TableAdmin;
import Anggota.Anggota;
import Anggota.DaftarDosen;
import Anggota.DaftarMahasiswa;
import Anggota.TableDosen;
import Anggota.TableMahasiswa;
import Buku.Buku;
import Buku.DaftarBukuBaru;
import Buku.DaftarRakBuku;
import Buku.RakBuku;
import Buku.TableBuku;
import Peminjaman.PinjamMhs;
import Peminjaman.Peminjaman;
import Peminjaman.TablePeminjaman;
import javax.swing.JOptionPane;

public class menuadmin extends javax.swing.JFrame {
    private static String user = null;
    /**
     * Creates new form menuadmin
     */
    public menuadmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        Menuawal.setVisible(true);
        
    }
    

    public menuadmin(String u) {
        initComponents();
        this.setLocationRelativeTo(null);
    }


      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menuawal = new javax.swing.JPanel();
        tambahbuku = new javax.swing.JLabel();
        Anggota = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caribuku = new javax.swing.JLabel();
        caridosen = new javax.swing.JLabel();
        pinjam = new javax.swing.JLabel();
        carimhs = new javax.swing.JLabel();
        daftaradmin = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();
        logoutadmin = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        menuTambahBuku = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        judulbuku = new javax.swing.JTextField();
        penerbit = new javax.swing.JTextField();
        pengarang = new javax.swing.JTextField();
        tahun = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tipebuku = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        idrak = new javax.swing.JTextField();
        tambahbukubaru = new javax.swing.JButton();
        cancelTambahBuku = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableTambahBuku = new javax.swing.JTable();
        updatebuku = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        menuTambahAnggota = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        NAMA = new javax.swing.JTextField();
        NIP = new javax.swing.JTextField();
        TELEPON = new javax.swing.JTextField();
        ALAMAT = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        STATUS = new javax.swing.JComboBox<>();
        cancelMenuAnggota = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tabletambahanggota = new javax.swing.JTable();
        Prodi = new javax.swing.JComboBox<>();
        tampildosen = new javax.swing.JButton();
        tampilmhs = new javax.swing.JButton();
        updatedosen = new javax.swing.JButton();
        updatemahasiswa = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        tampilDataDosen = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cancelMeuTampilBuku1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        dosen_cari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cari_anggota = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        delete_dosen = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        peminjaman = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cancelMenuPinjam = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLEPINJAM = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        kode_buku = new javax.swing.JTextField();
        id_peminjam = new javax.swing.JTextField();
        tgl_pinjam = new javax.swing.JTextField();
        id_pinjambuku = new javax.swing.JTextField();
        tambah1 = new javax.swing.JButton();
        STATUS1 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        pengembalian = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        tampilDataBuku = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cancelMeuTampilBuku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        caribuku_ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cari_buku = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        buku_delete = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().setLayout(new java.awt.CardLayout());

        Menuawal.setBackground(new java.awt.Color(255, 255, 255));
        Menuawal.setLayout(null);

        tambahbuku.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahbuku.setForeground(new java.awt.Color(255, 255, 255));
        tambahbuku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambahbuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Books-icon.png"))); // NOI18N
        tambahbuku.setText("Tambah Buku");
        tambahbuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tambahbuku.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tambahbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahbukuMouseClicked(evt);
            }
        });
        Menuawal.add(tambahbuku);
        tambahbuku.setBounds(20, 300, 90, 130);

        Anggota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Anggota.setForeground(new java.awt.Color(255, 255, 255));
        Anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/anggota.png"))); // NOI18N
        Anggota.setText("Tambah Anggota");
        Anggota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Anggota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnggotaMouseClicked(evt);
            }
        });
        Menuawal.add(Anggota);
        Anggota.setBounds(160, 360, 110, 130);

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERPUSTAKAAN ITERA");
        Menuawal.add(jLabel2);
        jLabel2.setBounds(340, 0, 640, 170);

        caribuku.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caribuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Background.png"))); // NOI18N
        caribuku.setText("Cari Buku");
        caribuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        caribuku.setVerifyInputWhenFocusTarget(false);
        caribuku.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        caribuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caribukuMouseClicked(evt);
            }
        });
        Menuawal.add(caribuku);
        caribuku.setBounds(680, 490, 96, 143);

        caridosen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caridosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caridosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/dosen.png"))); // NOI18N
        caridosen.setText("Cari Dosen");
        caridosen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        caridosen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        caridosen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        caridosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caridosenMouseClicked(evt);
            }
        });
        Menuawal.add(caridosen);
        caridosen.setBounds(1110, 300, 103, 134);

        pinjam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pinjam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pinjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/pinjambuku.png"))); // NOI18N
        pinjam.setText("Peminjaman Buku");
        pinjam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pinjam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinjamMouseClicked(evt);
            }
        });
        Menuawal.add(pinjam);
        pinjam.setBounds(830, 440, 112, 148);

        carimhs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        carimhs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carimhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/STIKER_KARTUN_WISUDA_4.jpg"))); // NOI18N
        carimhs.setText("Cari Mahasiswa");
        carimhs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        carimhs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carimhs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        carimhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carimhsMouseClicked(evt);
            }
        });
        Menuawal.add(carimhs);
        carimhs.setBounds(970, 370, 103, 121);

        daftaradmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        daftaradmin.setForeground(new java.awt.Color(255, 255, 255));
        daftaradmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daftaradmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Teacher-icon.png"))); // NOI18N
        daftaradmin.setText("Tambah Admin");
        daftaradmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        daftaradmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        daftaradmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftaradminMouseClicked(evt);
            }
        });
        Menuawal.add(daftaradmin);
        daftaradmin.setBounds(330, 450, 103, 134);

        Admin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin.setForeground(new java.awt.Color(255, 255, 255));
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/CARIADMIN.png"))); // NOI18N
        Admin.setText("Daftar Admin");
        Admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminMouseClicked(evt);
            }
        });
        Menuawal.add(Admin);
        Admin.setBounds(520, 490, 96, 148);

        logoutadmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Logout-icon.png"))); // NOI18N
        logoutadmin.setText("Log Out");
        logoutadmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutadmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logoutadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutadminMouseClicked(evt);
            }
        });
        Menuawal.add(logoutadmin);
        logoutadmin.setBounds(1130, 540, 68, 82);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/a11.jpg"))); // NOI18N
        Menuawal.add(jLabel39);
        jLabel39.setBounds(0, 0, 1240, 690);

        getContentPane().add(Menuawal, "card2");

        menuTambahBuku.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDIT DATA BUKU PERPUSTAKAAN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 130, 600, 58);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pengarang");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 330, 87, 28);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Judul Buku");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 290, 87, 28);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Penerbit");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 380, 87, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode Buku");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 240, 87, 28);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID rak buku");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 540, 87, 28);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipe Buku");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 490, 87, 28);

        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });
        jPanel1.add(kode);
        kode.setBounds(190, 230, 222, 34);
        jPanel1.add(judulbuku);
        judulbuku.setBounds(190, 280, 222, 34);
        jPanel1.add(penerbit);
        penerbit.setBounds(190, 380, 222, 34);
        jPanel1.add(pengarang);
        pengarang.setBounds(190, 330, 222, 34);
        jPanel1.add(tahun);
        tahun.setBounds(190, 430, 222, 34);
        jPanel1.add(jumlah);
        jumlah.setBounds(190, 580, 222, 34);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tahun Terbit");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 430, 100, 28);

        tipebuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IF", "EL", "GT", "TG", "GL", "PWK", "SI", "FI", "UMUM" }));
        jPanel1.add(tipebuku);
        tipebuku.setBounds(190, 480, 162, 38);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Jumlah Buku");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(60, 580, 100, 28);
        jPanel1.add(idrak);
        idrak.setBounds(190, 530, 222, 34);

        tambahbukubaru.setText("TAMBAH BUKU BARU");
        tambahbukubaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahbukubaruActionPerformed(evt);
            }
        });
        jPanel1.add(tambahbukubaru);
        tambahbukubaru.setBounds(431, 517, 170, 30);

        cancelTambahBuku.setText("CANCEL");
        cancelTambahBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTambahBukuActionPerformed(evt);
            }
        });
        jPanel1.add(cancelTambahBuku);
        cancelTambahBuku.setBounds(431, 563, 170, 30);

        TableTambahBuku.setAutoCreateRowSorter(true);
        TableTambahBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableTambahBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTambahBukuMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TableTambahBuku);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(550, 230, 656, 187);

        updatebuku.setText("Update Buku");
        updatebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebukuActionPerformed(evt);
            }
        });
        jPanel1.add(updatebuku);
        updatebuku.setBounds(620, 520, 150, 30);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/perpustera.png"))); // NOI18N
        jPanel1.add(jLabel30);
        jLabel30.setBounds(0, -10, 1280, 660);

        javax.swing.GroupLayout menuTambahBukuLayout = new javax.swing.GroupLayout(menuTambahBuku);
        menuTambahBuku.setLayout(menuTambahBukuLayout);
        menuTambahBukuLayout.setHorizontalGroup(
            menuTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTambahBukuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuTambahBukuLayout.setVerticalGroup(
            menuTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTambahBukuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(menuTambahBuku, "card3");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH ANGGOTA BARU");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(320, 120, 570, 58);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PRODI");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 320, 87, 28);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NIM/NIP");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 270, 87, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NO. TELP");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(40, 370, 87, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 220, 87, 28);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("STATUS");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 470, 87, 28);

        NAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMAActionPerformed(evt);
            }
        });
        jPanel2.add(NAMA);
        NAMA.setBounds(160, 210, 190, 34);
        jPanel2.add(NIP);
        NIP.setBounds(160, 260, 190, 34);
        jPanel2.add(TELEPON);
        TELEPON.setBounds(160, 360, 188, 34);

        ALAMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALAMATActionPerformed(evt);
            }
        });
        jPanel2.add(ALAMAT);
        ALAMAT.setBounds(160, 410, 188, 34);

        tambah.setText("TAMBAH ANGGOTA");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel2.add(tambah);
        tambah.setBounds(20, 540, 145, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ALAMAT");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(40, 420, 87, 28);

        STATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Dosen" }));
        STATUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATUSActionPerformed(evt);
            }
        });
        jPanel2.add(STATUS);
        STATUS.setBounds(160, 460, 101, 40);

        cancelMenuAnggota.setText("CANCEL");
        cancelMenuAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMenuAnggotaActionPerformed(evt);
            }
        });
        jPanel2.add(cancelMenuAnggota);
        cancelMenuAnggota.setBounds(220, 540, 145, 23);

        Tabletambahanggota.setAutoCreateRowSorter(true);
        Tabletambahanggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabletambahanggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabletambahanggotaMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(Tabletambahanggota);

        jPanel2.add(jScrollPane7);
        jScrollPane7.setBounds(600, 270, 614, 187);

        Prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IF", "EL", "GT", "TG", "GL", "PWK", "SI", "FI", "UMUM" }));
        jPanel2.add(Prodi);
        Prodi.setBounds(160, 310, 190, 38);

        tampildosen.setText("Tabel Dosen");
        tampildosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampildosenActionPerformed(evt);
            }
        });
        jPanel2.add(tampildosen);
        tampildosen.setBounds(970, 490, 109, 23);

        tampilmhs.setText("Tabel Mahasiswa");
        tampilmhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilmhsActionPerformed(evt);
            }
        });
        jPanel2.add(tampilmhs);
        tampilmhs.setBounds(760, 490, 126, 23);

        updatedosen.setText("EDIT DATA DOSEN");
        updatedosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedosenActionPerformed(evt);
            }
        });
        jPanel2.add(updatedosen);
        updatedosen.setBounds(410, 493, 170, 30);

        updatemahasiswa.setText("EDIT DATA MAHASISWA");
        updatemahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemahasiswaActionPerformed(evt);
            }
        });
        jPanel2.add(updatemahasiswa);
        updatemahasiswa.setBounds(410, 533, 170, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/perpustera.png"))); // NOI18N
        jPanel2.add(jLabel28);
        jLabel28.setBounds(0, -30, 1270, 690);

        javax.swing.GroupLayout menuTambahAnggotaLayout = new javax.swing.GroupLayout(menuTambahAnggota);
        menuTambahAnggota.setLayout(menuTambahAnggotaLayout);
        menuTambahAnggotaLayout.setHorizontalGroup(
            menuTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
        );
        menuTambahAnggotaLayout.setVerticalGroup(
            menuTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTambahAnggotaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(menuTambahAnggota, "card4");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        cancelMeuTampilBuku1.setText("CANCEL");
        cancelMeuTampilBuku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMeuTampilBuku1ActionPerformed(evt);
            }
        });
        jPanel4.add(cancelMeuTampilBuku1);
        cancelMeuTampilBuku1.setBounds(310, 580, 145, 23);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(460, 320, 614, 187);

        dosen_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosen_cariActionPerformed(evt);
            }
        });
        jPanel4.add(dosen_cari);
        dosen_cari.setBounds(150, 370, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cari Dosen");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(40, 380, 90, 20);

        cari_anggota.setText("CARI");
        cari_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_anggotaActionPerformed(evt);
            }
        });
        jPanel4.add(cari_anggota);
        cari_anggota.setBounds(150, 420, 57, 23);

        delete1.setText("DELETE");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel4.add(delete1);
        delete1.setBounds(150, 520, 69, 23);

        delete_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_dosenActionPerformed(evt);
            }
        });
        jPanel4.add(delete_dosen);
        delete_dosen.setBounds(150, 470, 160, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("NIP Dosen");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(40, 480, 80, 20);

        jLabel42.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("CARI DATA DOSEN");
        jPanel4.add(jLabel42);
        jLabel42.setBounds(440, 130, 380, 104);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/perpustera.png"))); // NOI18N
        jPanel4.add(jLabel43);
        jLabel43.setBounds(0, 0, 1287, 624);

        javax.swing.GroupLayout tampilDataDosenLayout = new javax.swing.GroupLayout(tampilDataDosen);
        tampilDataDosen.setLayout(tampilDataDosenLayout);
        tampilDataDosenLayout.setHorizontalGroup(
            tampilDataDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataDosenLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tampilDataDosenLayout.setVerticalGroup(
            tampilDataDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(tampilDataDosen, "card6");

        peminjaman.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        cancelMenuPinjam.setText("CANCEL");
        cancelMenuPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMenuPinjamActionPerformed(evt);
            }
        });

        TABLEPINJAM.setAutoCreateRowSorter(true);
        TABLEPINJAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TABLEPINJAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEPINJAMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TABLEPINJAM);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Peminjaman");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Kode Buku");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tanggal peminjaman");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("NIP / NIM Peminjam");

        id_pinjambuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pinjambukuActionPerformed(evt);
            }
        });

        tambah1.setText("PEMINJAMAN BUKU");
        tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah1ActionPerformed(evt);
            }
        });

        STATUS1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Dosen" }));
        STATUS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATUS1ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("PEMINJAMAN BUKU");

        pengembalian.setText("PENGEMBALIAN BUKU");
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/perpustera.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(id_peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(id_pinjambuku, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(kode_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(tgl_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(cancelMenuPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(STATUS1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(id_peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(id_pinjambuku, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel23))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(kode_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(tgl_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(cancelMenuPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(STATUS1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout peminjamanLayout = new javax.swing.GroupLayout(peminjaman);
        peminjaman.setLayout(peminjamanLayout);
        peminjamanLayout.setHorizontalGroup(
            peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        peminjamanLayout.setVerticalGroup(
            peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(peminjaman, "card7");

        tampilDataBuku.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        cancelMeuTampilBuku.setText("CANCEL");
        cancelMeuTampilBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMeuTampilBukuActionPerformed(evt);
            }
        });
        jPanel3.add(cancelMeuTampilBuku);
        cancelMeuTampilBuku.setBounds(190, 450, 145, 23);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(600, 230, 546, 185);
        jPanel3.add(caribuku_);
        caribuku_.setBounds(190, 300, 126, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari Buku");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(90, 300, 45, 14);

        cari_buku.setText("CARI");
        cari_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_bukuActionPerformed(evt);
            }
        });
        jPanel3.add(cari_buku);
        cari_buku.setBounds(330, 300, 57, 23);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(330, 350, 69, 23);
        jPanel3.add(buku_delete);
        buku_delete.setBounds(190, 350, 127, 20);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Kodei Buku");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(90, 350, 52, 14);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Cari Data Buku");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(390, 140, 320, 58);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/perpustera.png"))); // NOI18N
        jPanel3.add(jLabel21);
        jLabel21.setBounds(0, 0, 1230, 640);

        javax.swing.GroupLayout tampilDataBukuLayout = new javax.swing.GroupLayout(tampilDataBuku);
        tampilDataBuku.setLayout(tampilDataBukuLayout);
        tampilDataBukuLayout.setHorizontalGroup(
            tampilDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
        );
        tampilDataBukuLayout.setVerticalGroup(
            tampilDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(tampilDataBuku, "card5");

        setSize(new java.awt.Dimension(1250, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahbukuMouseClicked
        // TODO add your handling code here:
        Menuawal.setVisible(false);
        menuTambahBuku.setVisible(true);
        
        TableBuku a = new TableBuku(TableTambahBuku);
        a.getData();
        
    }//GEN-LAST:event_tambahbukuMouseClicked

    private void AnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnggotaMouseClicked
        // TODO add your handling code here:
        Menuawal.setVisible(false);
        menuTambahAnggota.setVisible(true);
        TableMahasiswa a = new TableMahasiswa(Tabletambahanggota);
        a.getData();

    }//GEN-LAST:event_AnggotaMouseClicked

    private void caribukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caribukuMouseClicked
        // TODO add your handling code here:
        Menuawal.setVisible(false);
        tampilDataBuku.setVisible(true);
        
        TableBuku a = new TableBuku(jTable1);
        a.getData();
    }//GEN-LAST:event_caribukuMouseClicked

    private void cancelMeuTampilBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMeuTampilBukuActionPerformed
        // TODO add your handling code here:
        menuTambahBuku.setVisible(false);
        menuTambahAnggota.setVisible(false);
        tampilDataBuku.setVisible(false);
        Menuawal.setVisible(true);
    }//GEN-LAST:event_cancelMeuTampilBukuActionPerformed

    private void cari_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_bukuActionPerformed
        // TODO add your handling code here:
        tampilDataBuku.setVisible(true);
        Menuawal.setVisible(false);
        
        TableBuku a = new TableBuku(jTable1);
        a.getCari(caribuku_.getText());
        caribuku_.setText("");
    }//GEN-LAST:event_cari_bukuActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        tampilDataBuku.setVisible(true);
        Menuawal.setVisible(false);

        TableBuku a = new TableBuku(jTable1);
        a.getHapus(buku_delete.getText());
        buku_delete.setText("");
        a.getData();
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelMeuTampilBuku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMeuTampilBuku1ActionPerformed
        // TODO add your handling code here:
        Menuawal.setVisible(true);
        menuTambahBuku.setVisible(false);
        menuTambahAnggota.setVisible(false);
        tampilDataDosen.setVisible(false);
        tampilDataBuku.setVisible(false);
    }//GEN-LAST:event_cancelMeuTampilBuku1ActionPerformed

    private void cari_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_anggotaActionPerformed
        // TODO add your handling code here:
        Menuawal.setVisible(false);
        tampilDataDosen.setVisible(true);
        
        TableDosen a = new TableDosen(jTable2);
        a.getCari(dosen_cari.getText());
        dosen_cari.setText("");
    }//GEN-LAST:event_cari_anggotaActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        tampilDataDosen.setVisible(true);
        Menuawal.setVisible(false);

        TableDosen a = new TableDosen(jTable2);
        a.getHapus(delete_dosen.getText());
        delete_dosen.setText("");
        a.getData();
    }//GEN-LAST:event_delete1ActionPerformed

    private void dosen_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosen_cariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dosen_cariActionPerformed

    private void caridosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caridosenMouseClicked
        Menuawal.setVisible(false);
        tampilDataDosen.setVisible(true);
        
        TableDosen a = new TableDosen(jTable2);
        a.getData();
    }//GEN-LAST:event_caridosenMouseClicked

    private void pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamMouseClicked
        // TODO add your handling code here:
        Menuawal.setVisible(false);
        peminjaman.setVisible(true);
        
        TablePeminjaman a = new TablePeminjaman(TABLEPINJAM);
        a.getData();
    }//GEN-LAST:event_pinjamMouseClicked

    private void cancelMenuPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMenuPinjamActionPerformed
        // TODO add your handling code here:
        Menuawal.setVisible(true);
        peminjaman.setVisible(false);
    }//GEN-LAST:event_cancelMenuPinjamActionPerformed

    private void tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah1ActionPerformed
        if(STATUS.getSelectedItem().toString().equals("Dosen")){
            PinjamMhs a = new PinjamMhs(
                new Peminjaman(
                id_pinjambuku.getText(),
                kode_buku.getText(),
                id_peminjam.getText(),
                tgl_pinjam.getText()
                )
            );
            if(a.validasiData()){
                if(a.getDaftar()!=-1 ){
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");

                    new menuadmin().setVisible(true);
                    this.setVisible(false);
                }
            }else{
                a.Pesan("Data Tidak Valid!");
            }
        }else if(STATUS.getSelectedItem().toString().equals("Mahasiswa")){
            PinjamMhs a = new PinjamMhs(
                new Peminjaman(
                id_pinjambuku.getText(),
                kode_buku.getText(),
                id_peminjam.getText(),        
                tgl_pinjam.getText()
                )
            );
            
            if(a.validasiData()){
                if(a.getDaftar()!=-1 ){
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");

                    new menuadmin().setVisible(true);
                    this.setVisible(false);
                }
            }else{
                a.Pesan("Data Tidak Valid!");
            }
        }
    }//GEN-LAST:event_tambah1ActionPerformed

    private void id_pinjambukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pinjambukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pinjambukuActionPerformed

    private void STATUS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATUS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STATUS1ActionPerformed

    private void carimhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carimhsMouseClicked
        Menuawal.setVisible(false);
        tampilDataMhs.setVisible(true);
        
        TableMahasiswa a = new TableMahasiswa(jTable4);
        a.getData();
    }//GEN-LAST:event_carimhsMouseClicked

    private void delete_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_dosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_dosenActionPerformed

    private void cancelMenuAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMenuAnggotaActionPerformed
        // TODO add your handling code here:
        menuTambahBuku.setVisible(false);
        menuTambahAnggota.setVisible(false);
        Menuawal.setVisible(true);
    }//GEN-LAST:event_cancelMenuAnggotaActionPerformed

    private void STATUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STATUSActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        if(STATUS.getSelectedItem().toString().equals("Dosen")){
            DaftarDosen sp = new DaftarDosen(NIP.getText(),
                new Anggota(
                    NAMA.getText(),
                    Prodi.getSelectedItem().toString(),
                    TELEPON.getText(),
                    ALAMAT.getText(),
                    STATUS.getSelectedItem().toString()
                )
            );
            if(sp.validasiData()){
                if(sp.getDaftar()!=-1 ){
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");
                    this.setVisible(false);
                    new menuadmin().setVisible(true);
                }
            }else{
                sp.Pesan("Data Tidak Valid!");
            }
        }
        else if(STATUS.getSelectedItem().toString().equals("Mahasiswa")){
            DaftarMahasiswa sp = new DaftarMahasiswa(NIP.getText(),
                new Anggota(
                    NAMA.getText(),
                    Prodi.getSelectedItem().toString(),
                    TELEPON.getText(),
                    ALAMAT.getText(),
                    STATUS.getSelectedItem().toString()
                )
            );
            if(sp.validasiData()){
                if(sp.getDaftar()!=-1 ){
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");

                    new menuadmin().setVisible(true);
                    this.setVisible(false);
                }
            }else{
                sp.Pesan("Data Tidak Valid!");
            }
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void ALAMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALAMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALAMATActionPerformed

    private void NAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMAActionPerformed

    private void tampildosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampildosenActionPerformed
        // TODO add your handling code here:

        TableDosen b = new TableDosen(Tabletambahanggota);
        b.getData();

    }//GEN-LAST:event_tampildosenActionPerformed

    private void tampilmhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilmhsActionPerformed
        TableMahasiswa b = new TableMahasiswa(Tabletambahanggota);
        b.getData();
    }//GEN-LAST:event_tampilmhsActionPerformed

    private void TabletambahanggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabletambahanggotaMouseClicked
        int baris2 = Tabletambahanggota.rowAtPoint(evt.getPoint());
        String nama = Tabletambahanggota.getValueAt(baris2, 1).toString();
        NAMA.setText(nama);
        String NIP2 = Tabletambahanggota.getValueAt(baris2, 0).toString();
        NIP.setText(NIP2);
        String telepon = Tabletambahanggota.getValueAt(baris2, 4).toString();
        TELEPON.setText(telepon );
        String alamat = Tabletambahanggota.getValueAt(baris2, 3).toString();
        ALAMAT.setText(alamat);
        String Status = Tabletambahanggota.getValueAt(baris2, 5).toString();
        STATUS.setSelectedItem(Status);
    }//GEN-LAST:event_TabletambahanggotaMouseClicked

    private void updatedosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedosenActionPerformed
        if(STATUS.isEnabled()){
            TableDosen a = new TableDosen(Tabletambahanggota);
            a.getUpdate(NAMA.getText(),NIP.getText(),ALAMAT.getText(), TELEPON.getText() );
            a.getData();
            NAMA.setText("");
            NIP.setText("");
            ALAMAT.setText("");
            TELEPON.setText("");
        }else {
            JOptionPane.showMessageDialog(null, "Update Data salah" );
        }
    }//GEN-LAST:event_updatedosenActionPerformed

    private void updatemahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemahasiswaActionPerformed
        if(STATUS.isEnabled()){
            TableMahasiswa a = new TableMahasiswa(Tabletambahanggota);
            a.getUpdate(NAMA.getText(),NIP.getText(),ALAMAT.getText(), TELEPON.getText() );
            a.getData();
            NAMA.setText("");
            NIP.setText("");
            ALAMAT.setText("");
            TELEPON.setText("");
        }else {
            JOptionPane.showMessageDialog(null, "Update Data salah" );
        }
    }//GEN-LAST:event_updatemahasiswaActionPerformed

    private void daftaradminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftaradminMouseClicked
        new daftar_admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_daftaradminMouseClicked

    private void logoutadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutadminMouseClicked
        new login1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutadminMouseClicked

    private void AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMouseClicked
        Menuawal.setVisible(false);
        tampildataadmin.setVisible(true);
        
        TableAdmin a = new TableAdmin(tabeladmin);
        a.getData();
    }//GEN-LAST:event_AdminMouseClicked

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
        TablePeminjaman a = new TablePeminjaman(TABLEPINJAM);
        a.getHapus(id_pinjambuku.getText());
        id_pinjambuku.setText("");
        a.getData();
    }//GEN-LAST:event_pengembalianActionPerformed

    private void TABLEPINJAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEPINJAMMouseClicked
        int baris2 = TABLEPINJAM.rowAtPoint(evt.getPoint());
        String ID = TABLEPINJAM.getValueAt(baris2, 0).toString();
        id_pinjambuku.setText(ID);

    }//GEN-LAST:event_TABLEPINJAMMouseClicked

    private void updatebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebukuActionPerformed
        // TODO add your handling code here:
        TableBuku a = new TableBuku(TableTambahBuku);
        a.getUpdate(kode.getText(), judulbuku.getText(), pengarang.getText(), penerbit.getText(), tahun.getText());
        a.getData();
    }//GEN-LAST:event_updatebukuActionPerformed

    private void TableTambahBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTambahBukuMouseClicked
        int baris = TableTambahBuku.rowAtPoint(evt.getPoint());
        String kode1 = TableTambahBuku.getValueAt(baris, 0).toString();
        kode.setText(kode1);
        String judul = TableTambahBuku.getValueAt(baris, 1).toString();
        judulbuku.setText(judul);
        String pengarang1 = TableTambahBuku.getValueAt(baris, 2).toString();
        pengarang.setText(pengarang1);
        String penerbit1 = TableTambahBuku.getValueAt(baris, 3).toString();
        penerbit.setText(penerbit1);
        String tahun1 = TableTambahBuku.getValueAt(baris, 4).toString();
        tahun.setText(tahun1);
    }//GEN-LAST:event_TableTambahBukuMouseClicked

    private void cancelTambahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTambahBukuActionPerformed
        // TODO add your handling code here:
        menuTambahBuku.setVisible(false);
        menuTambahAnggota.setVisible(false);
        Menuawal.setVisible(true);
    }//GEN-LAST:event_cancelTambahBukuActionPerformed

    private void tambahbukubaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahbukubaruActionPerformed
        // TODO add your handling code here:
        DaftarBukuBaru sp = new DaftarBukuBaru(kode.getText(),
            new Buku(
                judulbuku.getText(),
                pengarang.getText(),
                penerbit.getText(),
                tahun.getText()
            )
        );
        DaftarRakBuku sl = new DaftarRakBuku(idrak.getText(),
            new RakBuku(
                kode.getText(),
                tipebuku.getSelectedItem().toString(),
                jumlah.getText()
            )
        );
        if(sp.validasiData() && sl.validasiData()){
            if(sp.getDaftar()!=-1 && sl.getDaftar()!=-1){
                JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");

                new menuadmin().setVisible(true);
                this.setVisible(false);
            }
        }else{
            sp.Pesan("Data Tidak Valid!");
        }
    }//GEN-LAST:event_tambahbukubaruActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login1().setVisible(true
                );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALAMAT;
    private javax.swing.JLabel Admin;
    private javax.swing.JLabel Anggota;
    private javax.swing.JPanel Menuawal;
    private javax.swing.JTextField NAMA;
    private javax.swing.JTextField NIP;
    private javax.swing.JComboBox<String> Prodi;
    private javax.swing.JComboBox<String> STATUS;
    private javax.swing.JComboBox<String> STATUS1;
    private javax.swing.JTable TABLEPINJAM;
    private javax.swing.JTextField TELEPON;
    private javax.swing.JTable TableTambahBuku;
    private javax.swing.JTable Tabletambahanggota;
    private javax.swing.JTextField buku_delete;
    private javax.swing.JButton cancelMenuAnggota;
    private javax.swing.JButton cancelMenuPinjam;
    private javax.swing.JButton cancelMeuTampilBuku;
    private javax.swing.JButton cancelMeuTampilBuku1;
    private javax.swing.JButton cancelTambahBuku;
    private javax.swing.JButton cari_anggota;
    private javax.swing.JButton cari_buku;
    private javax.swing.JLabel caribuku;
    private javax.swing.JTextField caribuku_;
    private javax.swing.JLabel caridosen;
    private javax.swing.JLabel carimhs;
    private javax.swing.JLabel daftaradmin;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JTextField delete_dosen;
    private javax.swing.JTextField dosen_cari;
    private javax.swing.JTextField id_peminjam;
    private javax.swing.JTextField id_pinjambuku;
    private javax.swing.JTextField idrak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField judulbuku;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField kode_buku;
    private javax.swing.JLabel logoutadmin;
    private javax.swing.JPanel menuTambahAnggota;
    private javax.swing.JPanel menuTambahBuku;
    private javax.swing.JPanel peminjaman;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField pengarang;
    private javax.swing.JButton pengembalian;
    private javax.swing.JLabel pinjam;
    private javax.swing.JTextField tahun;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tambah1;
    private javax.swing.JLabel tambahbuku;
    private javax.swing.JButton tambahbukubaru;
    private javax.swing.JPanel tampilDataBuku;
    private javax.swing.JPanel tampilDataDosen;
    private javax.swing.JButton tampildosen;
    private javax.swing.JButton tampilmhs;
    private javax.swing.JTextField tgl_pinjam;
    private javax.swing.JComboBox<String> tipebuku;
    private javax.swing.JButton updatebuku;
    private javax.swing.JButton updatedosen;
    private javax.swing.JButton updatemahasiswa;
    // End of variables declaration//GEN-END:variables

}
