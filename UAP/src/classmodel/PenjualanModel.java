/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classmodel;

import db.DBHelper;
import forclass.Kategori;
import forclass.Penjualan;
import forclass.Produk;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PenjualanModel {
    private final Connection CONN;

    public PenjualanModel() {
        this.CONN = DBHelper.getConnection();
    }

    
    
    public void addPenjualan(Penjualan pjl){
        String insert = "INSERT INTO penjualan ( `list_produk`, `jumlah`, `stok`) VALUE ('"
                + pjl.getListProduk()
                +"', '" + pjl.getJumlah()
                +"', '" + pjl.getStok()
                + "');";
        
        try {
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil Memasukkan Data");
            }else{
                System.out.println("Gagal Memasukkan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data");
        }
    }
    
    public void updatePenjualan(Penjualan pjl){
        String update = "UPDATE penjualan SET list_produk = '" 
                + pjl.getListProduk() + "', jumlah = '" 
                + pjl.getJumlah() + "', stok = '" 
                + pjl.getStok() + "' WHERE id_penjualan = " + pjl.getUpdate();
        
        try {
            CONN.createStatement().executeUpdate(update);
            System.out.println("Berhasil Update Data");
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Update Data");
        }
    }
    
    public void hapusPenjualan(Penjualan pjl){
        String hapus = "DELETE FROM penjualan WHERE list_produk = '" + pjl.getListProduk() + "'";
        
        try {
            CONN.createStatement().executeUpdate(hapus);
            System.out.println("Berhasil Hapus Data");
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Hapus Data");
        }
    }
    
    public ArrayList<Produk> getPenjualan(){
        String query = "SELECT * FROM brg";
        ArrayList<Produk> pdk = new ArrayList();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Produk temp = new Produk(rs.getString("listProduk"), rs.getDouble("harga"), rs.getInt("jumlah"), rs.getDouble("diskon"));
                pdk.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Berhasil Mengambil Data");
        }
        return pdk;
    }
    
}
