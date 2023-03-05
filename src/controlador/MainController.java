
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
import javafx.application.Platform;
import javafx.scene.control.Alert;


/** se declara la clase MainController para acceder a las caractisticas y metodos
 * de modelo y posteriormente mostrarlas en la interfaz al usuario.
 *
 * @author Vidal Flores Montero carne 2021579554 Ingenieria de Computadores.
 */

public class MainController implements Initializable {
    
    //se definen las variables a utilizar en la interaccion con la GUI
    private int operando1;
    private int operando2;
    private double resultado;
    private int contador=0;
    private String[] Lista = {"San Jose","Alajuela","Cartago","Heredia",
        "Guanacaste","Puntarenas","Limon"};
    
    // se declaran los elementos graficos a utilizar en la interfaz grafica.
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtEdad;
    @FXML
    private ChoiceBox<String> txtProvincias;
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
    
    /**se inicializa el MainController, se establece aspectos iniciales de 
     * la GUI como setear las provincias en la choiceBox para poder escogerlas.
     * @param url se envia la ubicacion de la GUI para mostrar al usuario
     * @param rb comunicador con cadenas claves para la comunicacon entre el 
     * usuario y el idioma que se este utilizando
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtProvincias.getItems().addAll(Lista);
        txtProvincias.setOnAction(this::txtProvincia);
     }

    /**se declara el metodo txtProvincia donde se guarda en una variable 
     * la provincia seleccionada por el usuario para posteriormente utilizarla 
     * para crear el objeto persona
     *@param event es una parametro de evento de accion
     **/
    
    public void txtProvincia(ActionEvent event){
        String miProvincia = txtProvincias.getValue();
        if(miProvincia!=null){
        }
    }
    /**Se declara el metodo agregarPersona donde se realiza la instanciacion 
     *de las "personas"
     * @param event es un parametro de evento de accion
     **/
    @FXML
    private void agregarPersona(ActionEvent event) {
        /*se realizan las validaciones necesarias primero se valida 
        que no hayan mas de 4 objetos creados de lo contrario emite una alerta.
        Luego valida si alguno de los campos requieridos se encuentran vacio, 
        si lo cumple emite una alerta de que falta datos por ingresar. 
        Por ultimo, se realiza la instanciacion y se agrega a ambos comboBox 
        como opciones*/
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
                 txtNombre.setText("");
                 txtEdad.setText("");
                 txtProvincias.setValue(null);
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
    
    

    /**se define el metodo StringNombre donde se guarda en una variable 
     * el nombre ingresado por el usurio.
     *@param event parametro de accion de evento en la GUI.
     **/
    @FXML
    private void stringNombre(ActionEvent event) {
        String nombre = txtNombre.getText();
    }

    /**se define el metodo donde se envia los operando a utilizar 
     * y se realiza la operacion aritmetica SUMA.
     * @param event parametro de accion de evento en la GUI.
     **/
    @FXML
    private void SUMAR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1+operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }
    
    /**se define el metodo MULTIPLICAR donde se envia los operando a utilizar 
     * y se realiza la operacion aritmetica MULTIPLICACION.
     * @param event parametro de accion de evento en la GUI.
     **/
    @FXML
    private void MULTIPLICAR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1*operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

    /**se define elmetodo DIVIDIR donde se envia los operandos a utilizar 
     * y se realiza la operacion aritmetica DIVISION.
     * @param event parametro de accion de evento en la GUI.
     **/
    @FXML
    private void DIVIDIR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1/operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

    /**se define el metodo RESTAR donde se envia los operandos a utilizar 
     * y se realiza la operacion aritmetica RESTA.
     * @param event parametro de accion de evento en la GUI.
     **/
    @FXML
    private void RESTAR(ActionEvent event) {
        operando1=SeleccionarPersona1.getValue().getEdad();
        operando2=SeleccionarPersona2.getValue().getEdad();
        resultado=operando1-operando2;
        txtResultado.setText(resultado+" ");
        System.out.println(resultado);
    }

}
    