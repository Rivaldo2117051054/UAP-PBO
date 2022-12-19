/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uap_pbo;

import classmodel.KategoriModel;
import forclass.Barang;
import forclass.Kategori;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TambahKategoriController {

    @FXML
    private Button hapus;

    @FXML
    private TextField inputNamaKategori;

    @FXML
    private TextField inputrId;

    @FXML
    private Button tambahKategori;

    @FXML
    private Button tobarang;
    @FXML
    private TextField inputdelete;
    @FXML
    private Button tomakanan;

    @FXML
    private Button topenjualan;

    @FXML
    void addKategori(ActionEvent event) {
        
        KategoriModel ktg = new KategoriModel();     
        int idd = Integer.parseInt(inputrId.getText());
        Kategori ktg1 = new Kategori(idd, inputNamaKategori.getText());
        ktg.addKategori(ktg1);
        
        
     
    }
    
     @FXML
    void hapusKategori(ActionEvent event) {
        KategoriModel ktg = new KategoriModel();     
        int idd = Integer.parseInt(inputdelete.getText());
        Kategori ktg1 = new Kategori(idd);
        ktg.hapusKategori(ktg1);
    }
    
    @FXML
    void toBarang(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahBarang.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)tobarang.getScene().getWindow();
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

