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
 * @author Hasantha Pathirana
 */
public class SparepartsDB_UPDATE {
    String id;
    String price;
    String status;
    SparePartsDepartment_UI ob1=new SparePartsDepartment_UI();
    public SparepartsDB_UPDATE(String id, String price, String status) {
        this.id = id;
        this.price = price;
        this.status = status;
    }
    public void update(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","");
        Statement stm=con.createStatement();
        String sql="UPDATE mechanic SET price='"+price+"',status='"+status+"'"
                +"WHERE id='"+id+"'";
        stm.execute(sql);
        JOptionPane.showMessageDialog(ob1,"Record Updated");
        con.close();
    }catch(Exception ex){
        JOptionPane.showMessageDialog(ob1,"Record not Updated");
    }
    }
    
}
