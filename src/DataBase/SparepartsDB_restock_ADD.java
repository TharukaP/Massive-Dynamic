/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import java.sql.*;
import javax.swing.JOptionPane;
import Panels.SparePartsDepartment_UI;
/**
 *
 * 
 */
public class SparepartsDB_restock_ADD {
    

        String id;      //attributes
        String name;
        String quantity;
        String status;
        SparePartsDepartment_UI obj1=new SparePartsDepartment_UI();
    public SparepartsDB_restock_ADD(String id, String name, String quantity, String status) {//get update details from the Spareparts DepartmentUI as a constructor
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.status = status;
    }
    public void add(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","");
            Statement stm=con.createStatement();
            String sql="INSERT INTO parts VALUES('"+id+"','"+name+"','"+quantity+"','"+status+"','','')";
            stm.execute(sql);
            JOptionPane.showMessageDialog(obj1,"record added");
	    con.close();
        }catch(Exception ex){
        
        }
    }
         
 

    
}
