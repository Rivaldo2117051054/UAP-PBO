/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forclass;


public class Makanan extends Produk{
    private Integer daya_tahan;

    public Makanan( Integer daya_tahan, String nama_produk, Double harga, Integer Jumlah, Double diskon) {
        super(nama_produk, harga, Jumlah, diskon);
        this.daya_tahan = daya_tahan;
    }

    public Integer getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(Integer daya_tahan) {
        this.daya_tahan = daya_tahan;
    }
    
    public void isSpoiled(){
        
    }

    public Makanan(String nama_produk) {
        super(nama_produk);
    }

    
    
    
}
