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
public class SparepartsDB_restock_DELETE {
  String id;
  SparePartsDepartment_UI obj1=new SparePartsDepartment_UI();
  
    public SparepartsDB_restock_DELETE(String id) {
        this.id = id;
    }
  public void delete(){
      
      try{
          int dialogResult=JOptionPane.showConfirmDialog(null,"Are you Sure ?","Warning",JOptionPane.YES_NO_OPTION);
          if(dialogResult==JOptionPane.YES_OPTION){
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","");
          Statement stm=con.createStatement();
          String sql="DELETE FROM parts WHERE id='"+id+"'";
          stm.execute(sql);
          JOptionPane.showMessageDialog(obj1,"Record Deleted Successfully!! ");
          con.close(); 
          }
      }catch(Exception ex){
      
      }
  }
}
