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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginMenuController {

    @FXML
    private Button login;

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    void tologin(ActionEvent event) throws IOException {
        String user = username.getText();
        String pass = password.getText();

        if(user.equalsIgnoreCase("ilkom") && pass.equalsIgnoreCase("12345")){
            JOptionPane.showMessageDialog(null,"Login Berhasil");
            FXMLLoader load = new FXMLLoader(getClass().getResource("mainMenu.fxml"));
            Parent root = load.load();
            
            Stage stage = (Stage) login.getScene().getWindow();
            stage.setScene(new Scene (root));
            
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Login gagal");
        }
        
    }

}

