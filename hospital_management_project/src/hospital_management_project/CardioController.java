/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CardioController implements Initializable {

    LoginModel loginModel = new LoginModel();
    
    @FXML
    private JFXButton c2;
    
    @FXML
    private JFXButton c1;

    @FXML
    void c1_action(ActionEvent event) {
        try {
            if (loginModel.isBook(variable.username,"cardio1")) {
                variable.title = "Successful";
                variable.text = "Appointment Booked";
                new dwnld().start();
            }   } catch (SQLException ex) {
            Logger.getLogger(CardioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void c2_action(ActionEvent event) {
        try {
            if (loginModel.isBook(variable.username,"cardio2")) {
                variable.title = "Successful";
                variable.text = "Appointment Booked";
                new dwnld().start();
            }   } catch (SQLException ex) {
            Logger.getLogger(CardioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
