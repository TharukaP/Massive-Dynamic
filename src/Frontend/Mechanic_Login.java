/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Tharuka Perera
 */
public class Mechanic_Login extends javax.swing.JFrame {

    /**
     * Creates new form Mechanic_Login
     */
    public Mechanic_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(400, 120, 220, 40);

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 400, 110, 40);

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 400, 110, 40);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 150, 0, 0);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel5.setText("Mechanic login");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 40, 261, 48);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/username.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 120, 64, 64);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/password.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 230, 64, 64);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(400, 250, 220, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/user.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 260, 270);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/resources/mechanicloigbackgrou2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -40, 660, 570);

        setBounds(0, 0, 663, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              String username=txtUsername.getText();
        String password=txtPassword.getText();
        
        if(username.contains("admin")&&(password.contains("12345"))){
            txtUsername.setText(null);
            txtPassword.setText(null);
            systemExit();
            
           MechUI page=new MechUI();
            page.setVisible(true);
            this.setVisible(false);
            
        }
        else{
            JOptionPane.showMessageDialog(this,"invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
            txtUsername.setText(null);
            txtPassword.setText(null);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        systemExit();
        StaffPortal page1=new StaffPortal();
        page1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mechanic_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mechanic_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mechanic_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mechanic_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mechanic_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

   

private void systemExit(){
    WindowEvent winClosing= new WindowEvent(this,WindowEvent.WINDOW_CLOSED); 
}

}
