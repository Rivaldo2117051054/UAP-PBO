/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Rivaldo
 */
import forclass.Makanan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DBHelper {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DB = "uap_pbo";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }
        
        return conn;
    }
    
//    public static ObservableList<Makanan> getMakanan(){
//        ObservableList<Makanan> list = FXCollections.observableArrayList();
//        try{
//            PreparedStatement ps = conn.prepareStatement("select * from users");
//            ResultSet rs = ps.executeQuery();
//            
//            while(rs.next()){
//                list.add(new Makanan(rs.getInt("daya_tahan"), rs.getString("nama_produk"),
//                        rs.getDouble("harga"),
//                        rs.getInt("jumlah"), rs.getDouble("diskon")));
//            }
//        }catch(Exception e){
//            
//        }
//        return list;
//        
//    }
}


