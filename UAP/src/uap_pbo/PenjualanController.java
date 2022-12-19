/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uap_pbo;

import classmodel.PenjualanModel;
import forclass.Penjualan;
import forclass.Produk;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PenjualanController {
    
    @FXML
    private Button hapus;
    
    @FXML
    private TextField jumlah;

    @FXML
    private TextField listProduk;

    @FXML
    private TextField stok;
        @FXML
    private TextField inputhapus;
    @FXML
    private Button tambahPenjualan;

    @FXML
    private Button tobarang;

    @FXML
    private Button tokategori;

    @FXML
    private Button tomakanan;

    @FXML
    void addPenjualan(ActionEvent event) {
        
        
        PenjualanModel pjl = new PenjualanModel(); 
        int jmlint = Integer.parseInt(jumlah.getText());
        int stkint = Integer.parseInt(stok.getText());
        Penjualan pjl1 = new Penjualan(listProduk.getText(),jmlint, stkint);
        pjl.addPenjualan(pjl1);
        
    }
    
    @FXML
    void hapuspenjualan(ActionEvent event) {
        
        PenjualanModel pjl = new PenjualanModel(); 
        Penjualan pjl1 = new Penjualan(inputhapus.getText());
        pjl.hapusPenjualan(pjl1);
    }
    
    @FXML
    void toBarang(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahBarang.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)tobarang.getScene().getWindow();
        stage.setScene(new Scene(root));
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

}

