/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classmodel;

import db.DBHelper;
import forclass.Barang;
import forclass.Kategori;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KategoriModel {
    private final Connection CONN;

    public KategoriModel() {
        this.CONN = DBHelper.getConnection();
    }

    
    
    public void addKategori(Kategori ktg){
        String insert = "INSERT INTO kategori (`id_kategori`, `nama_kategori`) VALUE ('"
                + ktg.getId_kategori() + "', '" + ktg.getNama_kategori()
                + "');";
        
        try {
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil Memasukkan Data");
            }else{
                System.out.println("Gagal Memasukkan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data");
        }
    }
    
    public void updateKategori(Kategori ktg){
        String update = "UPDATE kategori SET id_kategori = '"
                + ktg.getId_kategori() + "', nama_kategori = '" 
                + ktg.getNama_kategori() + "' WHERE id_kategori = " + ktg.getUpdate();
        
        try {
            CONN.createStatement().executeUpdate(update);
            System.out.println("Berhasil Update Data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Update Data");
        }
    }
    
    public void hapusKategori(Kategori ktg){
        String hapus = "DELETE FROM kategori WHERE id_kategori = '" + ktg.getId_kategori() + "'";
        
        try {
            CONN.createStatement().executeUpdate(hapus);
            System.out.println("Berhasil Hapus Data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Hapus Data");
        }
    }
    
    public ArrayList<Kategori> getKategori(){
        String query = "SELECT * FROM brg";
        ArrayList<Kategori> ktg = new ArrayList();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Kategori temp = new Kategori(rs.getInt("id_kategori"), rs.getString("nama_kategori") );
                ktg.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Berhasil Mengambil Data");
        }
        return ktg;
    }
}