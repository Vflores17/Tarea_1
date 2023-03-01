/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import modelo.AgregarPersona;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class MainController implements Initializable {
    
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
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtResultado;
    
    @FXML
    private ChoiceBox<String> txtProvincias;
    
    private String[] Lista = {"San Jose","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limon"};
    @FXML
    private Button btnAgregar;
    
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
        txtProvincias.getItems().addAll(Lista);
        txtProvincias.setOnAction(this::getProvincia);
    }    

    public void getProvincia(ActionEvent event){
        String miProvincia = txtProvincias.getValue();
        System.out.println(miProvincia);
    }
    @FXML
    
    private void agregarPersona(ActionEvent event) {
        String nombre = txtNombre.getText();
        String provincia = txtProvincias.getValue();
        int edad = Integer.parseInt(txtEdad.getText());
        AgregarPersona persona = AgregarPersona.crearPersona(nombre,provincia, edad);
        
        
    } 
    private void dividir(ActionEvent event) {
       
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

    @FXML
    private void OpcionesMenu(ActionEvent event) {
        for (Object Persona : Lista){
        MenuItem opcionPersona = new MenuItem(txtNombre.getText());
        btnPersona1.getItems().add(opcionPersona);
            System.out.println("si pasa por aqui");  }
        
    }
    
    
}
