/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class MainController implements Initializable {

    @FXML
    private MenuButton btnProvincia;
    @FXML
    private MenuButton btnPersona1;
    @FXML
    private MenuButton btnPersona2;
    @FXML
    private RadioButton suma;
    @FXML
    private RadioButton resta;
    @FXML
    private RadioButton multiplicacion;
    @FXML
    private RadioButton dividir;
    @FXML
    private Button Operar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();
        this.suma.setToggleGroup(tg);
        this.resta.setToggleGroup(tg);
        this.multiplicacion.setToggleGroup(tg);
        this.dividir.setToggleGroup(tg);
    }    

    @FXML
    private void enviarProvincia(ActionEvent event) {
        System.out.println("Se oprimio boton seleccion provincia");
    }

    @FXML
    private void agregarPersona(ActionEvent event) {
        System.out.println("Se oprimio boton agregar persona");
    }

    private void dividir(ActionEvent event) {
        System.out.println("Se oprimio boton dividir");
    }


    @FXML
    private void enviarOperando1(ActionEvent event) {
    }

    @FXML
    private void enviarOperando2(ActionEvent event) {
    }

    @FXML
    private void stringNombre(ActionEvent event) {
    }

    @FXML
    private void intEdad(ActionEvent event) {
    }

    @FXML
    private void enviarSuma(ActionEvent event) {
    }

    @FXML
    private void enviarResta(ActionEvent event) {
    }

    @FXML
    private void enviarMultiplicacion(ActionEvent event) {
    }

    @FXML
    private void enviarDivision(ActionEvent event) {
    }

    @FXML
    private void enviarOperacion(ActionEvent event) {
    }
    
}
