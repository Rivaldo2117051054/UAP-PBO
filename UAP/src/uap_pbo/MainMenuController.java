/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uap_pbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainMenuController {

    @FXML
    private Button MenuBarang;

    @FXML
    private Button menuKategori;

    @FXML
    private Button menuMakanan;

    @FXML
    private Button menuPenjualan;

    @FXML
    void keMenuTambahKategori(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahKategori.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)menuKategori.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void masukMenuPenjualan(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("penjualan.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)menuPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void masukTambahBarang(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahBarang.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)MenuBarang.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void masukTambahMakanan(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahMakanan.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)menuMakanan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}


