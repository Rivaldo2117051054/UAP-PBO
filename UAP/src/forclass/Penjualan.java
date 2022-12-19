/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forclass;

import java.util.ArrayList;


public class Penjualan implements ProductCounter{
   // private ArrayList<Produk> listProduk;
    private String listProduk;
    private Integer jumlah;
    private Integer stok;
    private Integer Update;


//    public ArrayList<Produk> getListProduk() {
//        return listProduk;
//    }
//
//    public void setListProduk(ArrayList<Produk> listProduk) {
//        this.listProduk = listProduk;
//    }
//
//    public Penjualan(ArrayList<Produk> listProduk, Integer jumlah, Integer stok) {
//        this.listProduk = listProduk;
//        this.jumlah = jumlah;
//        this.stok = stok;
//    }

    public String getListProduk() {
        return listProduk;
    }

    public void setListProduk(String listProduk) {
        this.listProduk = listProduk;
    }

    public Penjualan(String listProduk, Integer jumlah, Integer stok) {
        this.listProduk = listProduk;
        this.jumlah = jumlah;
        this.stok = stok;
    }
    
    

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Penjualan(String listProduk) {
        this.listProduk = listProduk;
    }
    
    

    public Integer getUpdate() {
        return Update;
    }

    public void setUpdate(Integer Update) {
        this.Update = Update;
    }

    
    
    

    
    
    @Override
    public void hitungJumlahProduk(){
        
    }
    
    @Override
    public void hitungHargaProduk(){
        
    }
}
