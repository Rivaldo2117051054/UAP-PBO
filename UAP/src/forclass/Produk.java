/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forclass;


public class Produk {
    private String nama_produk;
    private Double harga;
    private Integer Jumlah;
    private Double diskon;

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public Integer getJumlah() {
        return Jumlah;
    }

    public void setJumlah(Integer Jumlah) {
        this.Jumlah = Jumlah;
    }

    public Double getDiskon() {
        return diskon;
    }

    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }

    public Produk(String nama_produk, Double harga, Integer Jumlah, Double diskon) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.Jumlah = Jumlah;
        this.diskon = diskon;
    }

    public Produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }


    
    
    public void hargaDiskon(){
        System.out.println( harga - (harga * diskon));
    }
    
}
