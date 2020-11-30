/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Panels.Mechanic_UI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Mechanic_UIDB_Updaterequestingemployees {
     String rego;
    String request;
    Mechanic_UI c=new Mechanic_UI();
    public Mechanic_UIDB_Updaterequestingemployees(String rego, String request)
    {
    this.rego=rego;
        this.request=request;

    }
        
         public void update()
    {
        //Update the request employees in database 
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","");
            Statement stm=con.createStatement();
            String sql="UPDATE register SET request='"+request+"'"
                    +"WHERE rego='"+rego+"'";
            stm.execute(sql);          
            JOptionPane.showMessageDialog(c,"record updated");
            con.close();
            
           
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(c,"record not added");
        
            
        }
     
    }
       
        
    }
    
