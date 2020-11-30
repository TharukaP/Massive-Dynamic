/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import Panels.Newspareparts;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class NewsparepartsDB_Update {
    String id;
    String status;
    String company;
    String mail;
    Newspareparts a=new Newspareparts();
    public NewsparepartsDB_Update(String id, String status, String company, String mail) // To get update details from the Newspareparts as a constructor
    {
        this.id=id;
        this.status=status;
        this.company=company;
        this.mail=mail;
        
    }
    public void update() //update details method
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","");
             Statement stm=con.createStatement();
            String sql="UPDATE parts SET status='"+status+"',company='"+company+"',mail='"+mail+"'"
                    +"WHERE id='"+id+"'";
            stm.execute(sql);          
            JOptionPane.showMessageDialog(a,"record updated");
            con.close();
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(a,"Record not Updated");
        }
     
    }
    
}
