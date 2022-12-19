/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uap_pbo;

import classmodel.MakananModel;
import db.DBHelper;
import static db.DBHelper.getConnection;
import forclass.Makanan;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TambahMakananController {

    @FXML
    private TextField dayaTahan;

    @FXML
    private TableColumn<Makanan, Integer> dayaTahanoutput;

    @FXML
    private TextField diskon;

    @FXML
    private Button hapus;

    @FXML
    private TextField harga;

    @FXML
    private TableColumn<Makanan, Integer> hargaoutput;


    @FXML
    private TextField jumlah;

    @FXML
    private TableColumn<Makanan, Integer> jumlahoutput;

    @FXML
    private TextField namaProduk;

    @FXML
    private TableColumn<Makanan, Integer> namaProdukoutput;

    @FXML
    private TableView<Makanan> output;

    @FXML
    private Button tambahMakanan;
    @FXML
    private TextField inputhapus;
    @FXML
    private Button tobarang;

    @FXML
    private Button tokategori;

    @FXML
    private Button topenjualan;

    @FXML
    void addMakanan(ActionEvent event) {
        
        int dythn = Integer.parseInt(dayaTahan.getText());
        int jml = Integer.parseInt(jumlah.getText());
        
        double diskn = Double.parseDouble(diskon.getText());
        double hrg = Double.parseDouble(harga.getText());
        
        MakananModel mkn = new MakananModel();
        Makanan mkn1 = new Makanan(dythn,namaProduk.getText(),hrg,jml,diskn);
        mkn.addMakanan(mkn1);
    }
    
    @FXML
    void hapusMakanan(ActionEvent event) {
        

        
        MakananModel mkn = new MakananModel();
        Makanan mkn1 = new Makanan(inputhapus.getText());
        mkn.hapusMakanan(mkn1);
    }
    
    public void initialize(URL url, ResourceBundle rb) throws SQLException{
            outputData();
        
    }
    
    public ObservableList<Makanan> getBarang() throws SQLException{
        ObservableList<Makanan> getBarang = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM brg;";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Makanan mkn;
            while(rs.next()){
                mkn = new Makanan(rs.getInt("daya_tahan"), rs.getString("nama_produk"),
                        rs.getDouble("harga"),
                        rs.getInt("jumlah"), rs.getDouble("diskon"));
                getBarang.add(mkn);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return getBarang;
    }
    @FXML
    void outputData() throws SQLException{
        ObservableList<Makanan> list = getBarang();
        dayaTahanoutput.setCellValueFactory(new PropertyValueFactory<>("daya_tahan"));
        hargaoutput.setCellValueFactory(new PropertyValueFactory<>("harga"));
        namaProdukoutput.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        jumlahoutput.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
   //     Makanan = DBHelper.getMakananMenu();
        
        output.setItems(list);
    }
    
    @FXML
    void toBarang(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("tambahKategori.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)tokategori.getScene().getWindow();
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
    void toPenjualan(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader(getClass().getResource("penjualan.fxml"));
        Parent root = load.load();
        
        Stage stage = (Stage)topenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
