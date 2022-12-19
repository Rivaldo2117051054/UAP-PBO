/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forclass;


public class Kategori {
    private Integer id_kategori;
    private String nama_kategori;
    private Integer update;

    public Integer getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(Integer id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public Integer getUpdate() {
        return update;
    }

    public void setUpdate(Integer update) {
        this.update = update;
    }
    
    
    
    public void getProduk(){
        
    }

    public Kategori(Integer id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }

    public Kategori(Integer id_kategori, String nama_kategori, Integer update) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
        this.update = update;
    }

    public Kategori(Integer id_kategori) {
        this.id_kategori = id_kategori;
    }
    
    
    
    
}
