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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import modelo.AgregarPersona;
import java.lang.String;
import javafx.application.Platform;
import javafx.scene.control.Alert;


/**
 * FXML Controller class
 *
 * @author Personal
 */
public class MainController implements Initializable {
    private int operando1;
    private int operando2;
    private float resultado;
    private int contador=0;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtEdad;
    @FXML
    private ChoiceBox<String> txtProvincias;
    
    private String[] Lista = {"San Jose","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limon"};
    
    public static ComboBox<AgregarPersona> Personas1;
    
    private CheckBox seleccionPersona1;
    private CheckBox seleccionPersona4;
    private CheckBox seleccionPersona3;
    private CheckBox seleccionPersona2;
    @FXML
    private Button suma;
    @FXML
    private Button multiplicar;
    @FXML
    private Button dividir;
    @FXML
    private Button resta;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtResultado;
    @FXML
    private ComboBox<AgregarPersona> SeleccionarPersona1=new ComboBox<>();
    @FXML
    private ComboBox<AgregarPersona> SeleccionarPersona2=new ComboBox<>();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtProvincias.getItems().addAll(Lista);
        txtProvincias.setOnAction(this::txtProvincia);
        //seleccionPersona1.setDisable(true);
        //seleccionPersona2.setDisable(true);
        //seleccionPersona3.setDisable(true);
        //seleccionPersona4.setDisable(true);
    }


    public void txtProvincia(ActionEvent event){
        String miProvincia = txtProvincias.getValue();
        if(miProvincia!=null){
        System.out.println(miProvincia);
        }
    }
    @FXML
    
    private void agregarPersona(ActionEvent event) {
        
        String nombre = txtNombre.getText();
        String provincia = txtProvincias.getValue();
        int edad = Integer.parseInt(txtEdad.getText());
        if(contador >3){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Número máximo de personas alcanzado");
            alert.setContentText("Solo se pueden ingresar 4 personas.");
            alert.showAndWait();
            return;
        }
            try {
             if (nombre.isEmpty() || provincia == null || edad <= 0) {
                 Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Faltan datos");
                    alert.setContentText("Debe ingresar todos los datos.");
                    alert.showAndWait();
                });
            }else {
                 contador++;
                 AgregarPersona nuevaPersona = new AgregarPersona(nombre,provincia,edad);
                 SeleccionarPersona1.getItems().add(nuevaPersona);
                 SeleccionarPersona2.getItems().add(nuevaPersona);
                 System.out.println(nuevaPersona);
                 }
            } catch (NumberFormatException e) {
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                   alert.setTitle("Error");
                   alert.setHeaderText("Error de formato");
                   alert.setContentText("La edad debe ser un número entero.");
                   alert.showAndWait();
            }
    }
    
    


    @FXML
    private void stringNombre(ActionEvent event) {
        String nombre = txtNombre.getText();
    }

    @FXML
    private void intEdad(ActionEvent event) {
    }

    @FXML
    private void SUMAR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1+operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

    @FXML
    private void MULTIPLICAR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1*operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

    @FXML
    private void DIVIDIR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1/operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

    @FXML
    private void RESTAR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1-operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

    
    
    }
    