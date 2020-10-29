/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Hasantha Pathirana
 */
public class SpareParts_Login extends javax.swing.JFrame {

    /**
     * Creates new form SpareParts_Login
     */
    public SpareParts_Login() {
        initComponents();
        setSize(899,440);
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
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/username.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 140, 64, 64);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/password.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 230, 64, 64);

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtUsername);
        txtUsername.setBounds(550, 150, 179, 36);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Spare Parts Department Login");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(232, 24, 390, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/user.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 90, 256, 256);

        buttonHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(560, 350, 119, 39);

        buttonLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin);
        buttonLogin.setBounds(400, 350, 115, 39);

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(550, 242, 180, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/hp login background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-8, -7, 900, 410);

        setSize(new java.awt.Dimension(904, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        
        if(username.contains("admin")&&(password.contains("12345"))){
            txtUsername.setText(null);
            txtPassword.setText(null);
            systemExit();
            
            SparePartsDepartment_UI page=new SparePartsDepartment_UI();
            page.setVisible(true);
            this.setVisible(false);
            
        }
        else{
            JOptionPane.showMessageDialog(this,"invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
            txtUsername.setText(null);
            txtPassword.setText(null);
            
        }
        
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
        
        systemExit();
        StaffPortal page1=new StaffPortal();
        page1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

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
            java.util.logging.Logger.getLogger(SpareParts_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpareParts_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpareParts_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpareParts_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpareParts_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

private void systemExit(){
    WindowEvent winClosing= new WindowEvent(this,WindowEvent.WINDOW_CLOSED); 
}


}
