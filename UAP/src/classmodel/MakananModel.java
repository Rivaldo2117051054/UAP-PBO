/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classmodel;

import db.DBHelper;
import forclass.Barang;
import forclass.Kategori;
import forclass.Makanan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MakananModel {
    private final Connection CONN;

    public MakananModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMakanan(Makanan mkn){
        String insert = "INSERT INTO makanan (`daya_tahan`, `nama_produk`, `harga`, `jumlah`, `diskon`) VALUES ('"+mkn.getDaya_tahan()+ "', '" + mkn.getNama_produk() + "', '" + mkn.getHarga() + "', '" + mkn.getJumlah() + "', '" + mkn.getDiskon() + "');";
//        System.out.println(insert);
        try {
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil Memasukkan Data");
            }else{
                System.out.println("Gagal Memasukkan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data");
        }
    }
    
    public void updMakanan(Makanan mkn){
        String update = "UPDATE makanan SET makanan.harga='" + mkn.getHarga()+ "' WHERE barang.nama_produk ='" + mkn.getNama_produk() + "';";
        try {
            if(CONN.createStatement().executeUpdate(update)>0){
                System.out.println("Berhasil Update Data");
            }else{
                System.out.println("Gagal Update Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Update Data");
        }
    }
    
    public void hapusMakanan(Makanan mkn){
        String hapus = "DELETE FROM makanan WHERE makanan.nama_produk = '" + mkn.getNama_produk() + "'";
        
        try {
            CONN.createStatement().executeUpdate(hapus);
            System.out.println("Berhasil Hapus Data");
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Hapus Data");
        }
    }
    
    public ArrayList<Makanan> getMakanan(){
        String query = "SELECT * FROM makanan";
        ArrayList<Makanan> mkn = new ArrayList();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Makanan temp = new Makanan(rs.getInt("daya_tahan"), rs.getString("nama_produk"),
                        rs.getDouble("harga"),
                        rs.getInt("jumlah"), rs.getDouble("diskon"));
                mkn.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Berhasil Mengambil Data");
        }
        return mkn;
    }
}
