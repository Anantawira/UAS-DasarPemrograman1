/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirrestoran;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class koneksi {
    
    Connection con;
    Statement stm;
    static Connection Koneksi;
    
    public static Connection getConnection(){
        try{
                Koneksi= DriverManager.getConnection("jdbc:mysql://localhost/kasir","root","");
            }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Koneksi Database Gagal");
            }
        return Koneksi;
    }
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/kasir", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    
}
