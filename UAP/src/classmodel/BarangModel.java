/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classmodel;

import db.DBHelper;
import forclass.Barang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BarangModel {
    private final Connection CONN;

    public BarangModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addBarang(Barang brg){
        String insert = "INSERT INTO barang ( `nama_produk`, `harga`, `jumlah`, `diskon`, `barcode_barang`, `expired`,`id_kategori`) VALUES ('" + brg.getNama_produk() +
                "', " + brg.getHarga() + ", " + brg.getJumlah() + ", " +
                brg.getDiskon() + ", '" + brg.getBarcode() + "', '" + brg.getExpired() + "', '" + brg.getId_kategori()+"');";
//        System.out.println(insert);
        try {
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil Memasukkan Data");
            }else{
                System.out.println("Gagal Memasukkan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data");
        }
    }
    
    public void updBarang(Barang brg){
        String update = "UPDATE brg SET barang.harga='" + brg.getHarga()+ "' WHERE barang.nama_produk ='" + brg.getNama_produk() + "';";
        try {
            if(CONN.createStatement().executeUpdate(update)>0){
                System.out.println("Berhasil Update Data");
            }else{
                System.out.println("Gagal Update Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Update Data");
        }
    }
    
    public void HapusBarang(Barang brg){
        String delete = "DELETE FROM barang WHERE barang.nama_produk='" + brg.getNama_produk() + "';";
        try {
            if(CONN.createStatement().executeUpdate(delete)>0){
                System.out.println("Berhasil Menghapus Data");
            }else{
                System.out.println("Gagal Menghapus Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Menghapus Data");
        }
    }
    
    public ArrayList<Barang> getBarang(){
        String query = "SELECT * FROM barang";
        ArrayList<Barang> brg = new ArrayList();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Barang temp = new Barang(rs.getString("barcode_barang"), rs.getString("expired"),rs.getString("nama_produk"), rs.getDouble("harga"),
                        rs.getInt("jumlah"),rs.getDouble("diskon"),rs.getInt("id_kategori") );
                brg.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Berhasil Mengambil Data");
        }
        return brg;
    }
    
}
