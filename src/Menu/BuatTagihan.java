/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author ThinkPad
 */
public class BuatTagihan extends javax.swing.JFrame {
    
    public static Connection con;
    public static Statement stm;
    public static ResultSet rs;

    /**
     * Creates new form BuatTagihan
     */
    public BuatTagihan() {
        initComponents();
        comboboxTagihanNama();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private void comboboxTagihanNama(){
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/aplikasi_pdam";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            stm = con.createStatement();
            
            String query = "SELECT * FROM pengguna";
            rs = stm.executeQuery(query);
            while(rs.next()){
                cmbTagihanNama.addItem(rs.getString("nama"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal ditampilkan");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbTagihanNama = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbTagihanPeriode = new javax.swing.JComboBox<>();
        cmbTagihanTotal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbTagihanStatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnTagihanBuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Periode");

        cmbTagihanPeriode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari 2024", "Februari 2024", "Maret 2024", "April 2024", "Mei 2024", "Juni 2024", "Juli 2024", "Agustus 2024", "September 2024", "Oktober 2024", "November 2024", "Desember 2024" }));

        cmbTagihanTotal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "250000" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Tagihan");

        cmbTagihanStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Bayar" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");

        btnTagihanBuat.setText("Buat Tagihan");
        btnTagihanBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanBuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(cmbTagihanNama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTagihanPeriode, 0, 288, Short.MAX_VALUE)
                            .addComponent(cmbTagihanTotal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTagihanStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(btnTagihanBuat)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTagihanNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTagihanPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTagihanTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(cmbTagihanStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnTagihanBuat)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTagihanBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanBuatActionPerformed
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/aplikasi_pdam";
        SUser = "root";
        SPass = "";
        String nama = cmbTagihanNama.getSelectedItem().toString();
        String periode = cmbTagihanPeriode.getSelectedItem().toString();
        String total_tagihan = cmbTagihanTotal.getSelectedItem().toString();
        String status = cmbTagihanStatus.getSelectedItem().toString();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            stm = con.createStatement();
            
            String id_pengguna = "SELECT id FROM pengguna WHERE nama = '"+ nama +"'";
            rs = stm.executeQuery(id_pengguna);
            
            // Mengecek apakah ResultSet memiliki data
            if (rs.next()) {
                int idPengguna = rs.getInt("id"); // Mengambil nilai ID

                // Membuat query INSERT
                String insertQuery = "INSERT INTO tagihan (id_pengguna, periode, total_tagihan, status) " +
                             "VALUES ('" + idPengguna + "', '" + periode + "', '" + total_tagihan + "', '" + status + "')";
        
                // Menjalankan query INSERT
                stm.executeUpdate(insertQuery);
                JOptionPane.showMessageDialog(null, "Berhasil Membuat Tagihan");
            } else {
                JOptionPane.showMessageDialog(null, "Pengguna dengan nama '" + nama + "' tidak ditemukan.");
            }

            // Menutup koneksi
            rs.close();
            stm.close();
            con.close();

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e); 
        }

        
    }//GEN-LAST:event_btnTagihanBuatActionPerformed

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
            java.util.logging.Logger.getLogger(BuatTagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuatTagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuatTagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuatTagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuatTagihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTagihanBuat;
    private javax.swing.JComboBox<String> cmbTagihanNama;
    private javax.swing.JComboBox<String> cmbTagihanPeriode;
    private javax.swing.JComboBox<String> cmbTagihanStatus;
    private javax.swing.JComboBox<String> cmbTagihanTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
