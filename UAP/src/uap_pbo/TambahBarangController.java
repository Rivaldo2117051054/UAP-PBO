/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uap_pbo;

import classmodel.BarangModel;
import forclass.Barang;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class TambahBarangController {

    @FXML
    private TextField barcode;

    @FXML
    private TextField diskon;

    @FXML
    private TextField expired;

    @FXML
    private Button hapusBarang;
    @FXML
    private TextField inputhapus;
    @FXML
    private TextField harga;

    @FXML
    private Button idtambahBarang;

    @FXML
    private TextField jumlah;

    @FXML
    private TextField kategori;

    @FXML
    private TextField namaProduk;

    @FXML
    private Button tokategori;

    @FXML
    private Button tomakanan;

    @FXML
    private Button topenjualan;

    @FXML
    void hapusData(ActionEvent event) {
        

        BarangModel brg = new BarangModel();
        Barang brg1 = new Barang(inputhapus.getText());
        brg.HapusBarang(brg1);
        
    }

    @FXML
    void tambahData(ActionEvent event) {
        
        int jml = Integer.parseInt(jumlah.getText());
        double diskn = Double.parseDouble(diskon.getText());
        double hrg = Double.parseDouble(harga.getText());
        int iktg = Integer.parseInt(kategori.getText());
        
        BarangModel brg = new BarangModel();
        Barang brg1 = new Barang(barcode.getText(),expired.getText(),namaProduk.getText(),hrg,jml,diskn,iktg);
        brg.addBarang(brg1);
    }
    
    @FXML
    void toKategori(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahKategori.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)tokategori.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void toMakanan(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahMakanan.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)tomakanan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void toPenjualan(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("penjualan.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)topenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}

