/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Model.SendingMails;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import DataBase.Sql_Connection;

public class Admin_UI extends javax.swing.JPanel {
    Sql_Connection con=new Sql_Connection();

    /**
     * Creates new form Admin_UI
     */
    public Admin_UI() {
        initComponents();
        view_customer();
        view_dealers();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTo1 = new javax.swing.JTextField();
        txtSubject1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Dealer = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTo2 = new javax.swing.JTextField();
        txtSubject2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMessage2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null), "Customer Notification Centre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To    ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Message");

        txtTo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSubject1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSubject1.setText("RUST REPAIR(@No-reply)");
        txtSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubject1ActionPerformed(evt);
            }
        });

        txtMessage1.setColumns(20);
        txtMessage1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtMessage1.setRows(5);
        txtMessage1.setText("\t\tRUSTREPAIR(PVT.LTD)\n=================================================\nDear Customer,\nyour vechicle is ready to pick up.\n\n=================================================\n");
        jScrollPane1.setViewportView(txtMessage1);

        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rego", "E-mail", "Status"
            }
        ));
        table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_customerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_customer);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Subject");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(txtTo1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(txtSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addComponent(txtTo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null), "Dealer Notification Centre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        table_Dealer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Part Id", "Name", "Quantity", "Status", "Company Name", "E-Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_Dealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DealerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_Dealer);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("To");

        txtTo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSubject2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSubject2.setText("Rust Repair-Spare Parts Orders");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Message");

        txtMessage2.setColumns(20);
        txtMessage2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtMessage2.setRows(5);
        txtMessage2.setText("\t\tRUSTREPAIR(PVT.LTD)\n======================================================\nORDER LIST\n=====================================================\nProduct ID:\nProduct Name:\nProduct Quantity:\n======================================================\n");
        jScrollPane4.setViewportView(txtMessage2);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Subject");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(92, 92, 92)
                .addComponent(txtTo2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(57, 57, 57)
                .addComponent(txtSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(txtTo2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 740));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN NOTIFICATION PANEL");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 589, 51));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));
    }// </editor-fold>//GEN-END:initComponents
PreparedStatement insert;
     private void view_customer(){

        int c;
        
         try{
            String sql="SELECT name,rego,mail,status FROM register";
            insert=con.mycon().prepareStatement(sql);
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c=4;
            
            DefaultTableModel df=(DefaultTableModel)table_customer.getModel();
            df.setRowCount(0);
            
            while(rs.next()){
            Vector v2=new Vector();
            
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("name"));                  
                    v2.add(rs.getString("rego"));
                    v2.add(rs.getString("mail"));
                    v2.add(rs.getString("status"));
       
                }
                
                df.addRow(v2);
            }
     
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this,"record not added");
        
            
        }
        

    }
     
     
     
     
     private void view_dealers(){

        int c;
        
         try{
            String sql="SELECT id,name,quantity,status,company,mail FROM parts";
            insert=con.mycon().prepareStatement(sql);
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c=6;
            
            DefaultTableModel df=(DefaultTableModel)table_Dealer.getModel();
            df.setRowCount(0);
            
            while(rs.next()){
            Vector v2=new Vector();
            
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("id"));                  
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("quantity"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("company"));
                    v2.add(rs.getString("mail"));
          
                }
                
                df.addRow(v2);
            }
     
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this,"record not added");
        
            
        }
        

    }
    private void txtSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubject1ActionPerformed

    private void table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customerMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df=(DefaultTableModel)table_customer.getModel();
        int selectedIndex=table_customer.getSelectedRow();
        txtTo1.setText(df.getValueAt(selectedIndex,2).toString());
    }//GEN-LAST:event_table_customerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        String[] to={txtTo1.getText()};
        String from="rustrepair1234";
        String pass="rust1234";
        String subject=txtSubject1.getText();
        String body=txtMessage1.getText();
        
        SendingMails mail = new SendingMails();
        mail.email(to, from, pass, subject, body);
        
        JOptionPane.showMessageDialog(this,"E mail sent Successfully !!");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_DealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DealerMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df=(DefaultTableModel)table_Dealer.getModel();
        int selectedIndex=table_Dealer.getSelectedRow();
        txtTo2.setText(df.getValueAt(selectedIndex,5).toString());
    }//GEN-LAST:event_table_DealerMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] to={txtTo2.getText()};
        String from="rustrepair1234";
        String pass="rust1234";
        String subject=txtSubject2.getText();
        String body=txtMessage2.getText();
        
        SendingMails mail = new SendingMails();
        mail.email(to, from, pass, subject, body);
        
        JOptionPane.showMessageDialog(this,"E mail sent Successfully !!");

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable table_Dealer;
    private javax.swing.JTable table_customer;
    private javax.swing.JTextArea txtMessage1;
    private javax.swing.JTextArea txtMessage2;
    private javax.swing.JTextField txtSubject1;
    private javax.swing.JTextField txtSubject2;
    private javax.swing.JTextField txtTo1;
    private javax.swing.JTextField txtTo2;
    // End of variables declaration//GEN-END:variables
}
