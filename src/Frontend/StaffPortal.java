/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

/**
 *
 * @author Hasantha Pathirana
 */
public class StaffPortal extends javax.swing.JFrame {

    /**
     * Creates new form StaffPortal
     */
    public StaffPortal() {
        initComponents();
        setSize(1220,888);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME TO RUSTREPAIR STAFF PORTAL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(243, 22, 826, 100);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("RECEPTIONIST");
        getContentPane().add(jButton1);
        jButton1.setBounds(373, 295, 185, 46);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("EMPLOYEE MANAGER");
        getContentPane().add(jButton2);
        jButton2.setBounds(373, 468, 187, 45);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("ACCOUNTANT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(373, 603, 185, 45);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("MECHANIC");
        getContentPane().add(jButton4);
        jButton4.setBounds(926, 291, 207, 46);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("SPARE PARTS MANAGER");
        getContentPane().add(jButton5);
        jButton5.setBounds(926, 452, 207, 56);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("DILIVERY MANAGER");
        getContentPane().add(jButton6);
        jButton6.setBounds(926, 612, 207, 57);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("ADMINISTRATOR");
        getContentPane().add(jButton7);
        jButton7.setBounds(30, 150, 165, 44);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/receptionist.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(142, 295, 64, 64);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/Employee head.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(142, 452, 64, 64);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/accounting.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(142, 603, 64, 64);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/mechanic.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(735, 291, 64, 64);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/spare-part.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(735, 468, 64, 64);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/delivery.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(735, 612, 64, 64);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/admin.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(435, 152, 32, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/test3.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1230, 890);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(StaffPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
