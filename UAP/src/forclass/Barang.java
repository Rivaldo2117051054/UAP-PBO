/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forclass;


import java.util.ArrayList;


public class Barang extends Produk{
    private String barcode;
    private String expired;
 //   private ArrayList<Kategori> Kategori ;
    private Integer id_kategori;

    public Barang(String barcode, String expired, String nama_produk, Double harga, Integer Jumlah, Double diskon,Integer id_kategori) {
        super(nama_produk, harga, Jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.id_kategori = id_kategori;
    }

    
    
    
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public Integer getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(Integer id_kategori) {
        this.id_kategori = id_kategori;
    }

    public Barang(String nama_produk) {
        super(nama_produk);
    }

    
    

    public void isExpired(){
        System.out.println("Expired : " + expired);
    }
    
    public void addKategori(){
        
    }
}
