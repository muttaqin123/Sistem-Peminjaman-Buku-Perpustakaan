package UI_admin;

import AdminPerpus.DaftarAdmin;
import AdminPerpus.Admin;

public class daftar_admin extends javax.swing.JFrame {

    public daftar_admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        daftarnamaaadmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        daftarnip = new javax.swing.JTextField();
        isiusername = new javax.swing.JLabel();
        daftarusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        daftaradmin = new javax.swing.JButton();
        daftarpassword = new javax.swing.JPasswordField();
        canceldaftar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\ITERA.jpg")); // NOI18N
        jLabel1.setText("WELCOME!!!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Nama");

        daftarnamaaadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarnamaaadminActionPerformed(evt);
            }
        });

        jLabel3.setText("NIP");

        daftarnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarnipActionPerformed(evt);
            }
        });

        isiusername.setText("Username");

        daftarusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarusernameActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        daftaradmin.setText("DAFTAR");
        daftaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftaradminActionPerformed(evt);
            }
        });

        daftarpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarpasswordActionPerformed(evt);
            }
        });

        canceldaftar.setText("CANCEL");
        canceldaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceldaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isiusername)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(daftarnamaaadmin)
                                        .addGap(75, 75, 75))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(daftarnip, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(daftaradmin)
                                    .addComponent(daftarusername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(daftarpassword)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(canceldaftar))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(40, 40, 40))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftarnamaaadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarnip, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiusername)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftarusername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftaradmin)
                    .addComponent(canceldaftar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("nama");
        daftarnamaaadmin.getAccessibleContext().setAccessibleName("nama");
        daftarnip.getAccessibleContext().setAccessibleName("nip");
        daftarusername.getAccessibleContext().setAccessibleName("username");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarnamaaadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarnamaaadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarnamaaadminActionPerformed

    private void daftaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftaradminActionPerformed
        DaftarAdmin baru = new DaftarAdmin(        
            new Admin(
                daftarnip.getText(),
                daftarnamaaadmin.getText(),
                daftarusername.getText(),
                daftarpassword.getText()
                )         
        );
        if(baru.validasiData()){
            if(baru.getDaftar()!=-1){
                new menuadmin().setVisible(true);
                this.setVisible(false);
            }
        }else{
            baru.Pesan("Data Tidak Valid!");
        }       
    }//GEN-LAST:event_daftaradminActionPerformed

    private void daftarnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarnipActionPerformed

    private void daftarusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarusernameActionPerformed

    private void daftarpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarpasswordActionPerformed

    private void canceldaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceldaftarActionPerformed
        new menuadmin ().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_canceldaftarActionPerformed
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
            java.util.logging.Logger.getLogger(daftar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceldaftar;
    private javax.swing.JButton daftaradmin;
    private javax.swing.JTextField daftarnamaaadmin;
    private javax.swing.JTextField daftarnip;
    private javax.swing.JPasswordField daftarpassword;
    private javax.swing.JTextField daftarusername;
    private javax.swing.JLabel isiusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
