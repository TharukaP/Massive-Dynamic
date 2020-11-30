/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import Panels.Mechanic_UI;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Mechanic_UIDB_Updatevechiclestatus {
      String rego;
    String status;
    Mechanic_UI b=new Mechanic_UI();
    public Mechanic_UIDB_Updatevechiclestatus(String rego, String status)
    {
        this.rego=rego;
        this.status=status;
       
        
    }
    public void update()
    {
        //Update the vehicle status in database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","");
             Statement stm=con.createStatement();
            String sql="UPDATE register SET status='"+status+"'"
                    +"WHERE rego='"+rego+"'";
            stm.execute(sql);          
            JOptionPane.showMessageDialog(b,"Record updated");
            con.close();
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(b,"Record not Updated");
        }
     
    }
    
}


