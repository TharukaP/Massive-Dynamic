/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Panels.SparePartsDepartment_UI;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class SparepartsDB_UPDATE {
    String id;
    String price;
    String status;
    SparePartsDepartment_UI ob1=new SparePartsDepartment_UI();
    Sql_Connection con=new Sql_Connection();
    public SparepartsDB_UPDATE(String id, String price, String status) { //get update details from the Spareparts DepartmentUI as a constructor
        this.id = id;
        this.price = price;
        this.status = status;
    }
    public void update(){ //update details method
    try{
        
        Statement stm=con.mycon().createStatement();
        String sql="UPDATE mechanic SET price='"+price+"',status='"+status+"'"
                +"WHERE id='"+id+"'";
        stm.execute(sql);
        JOptionPane.showMessageDialog(ob1,"Record Updated");
        
    }catch(Exception ex){
        JOptionPane.showMessageDialog(ob1,"Record not Updated");
    }
    }
    
}
