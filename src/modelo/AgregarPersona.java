/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Personal
 */
public class AgregarPersona {
    
    private static int contadorInstancias = 0;
    private static ArrayList<AgregarPersona> PersonasLista=new ArrayList<>();
    private String Nombre;
    private String Provincia;
    private int edad;
    
    
    public AgregarPersona(String Nombre, String Provincia,int edad) {
        this.Nombre = Nombre;
        this.Provincia = Provincia;
        this.edad = edad;
        this.PersonasLista = new ArrayList<>();
        
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*public ArrayList<AgregarPersonas> retonarListaPersonas(){
    Personas nueva=null;
    int contador =0;
    for (int i=0,i<PersonasLista.size();i++){
        nueva = PersonasLista.get(i);
    }*/

    public static AgregarPersona crearPersona(String Nombre, String Provincia, int edad) {
        
        if(contadorInstancias >3){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Número máximo de personas alcanzado");
            alert.setContentText("Solo se pueden ingresar 4 personas.");
            alert.showAndWait();
            return null;
        }
            try {
             if (Nombre.isEmpty() || Provincia == null || edad <= 0) {
                 Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Faltan datos");
                    alert.setContentText("Debe ingresar todos los datos.");
                    alert.showAndWait();
                });
                return null;
            }else {
                 contadorInstancias++;
                 AgregarPersona nuevaPersona = new AgregarPersona(Nombre, Provincia, edad);
                 if(nuevaPersona !=null){
                     PersonasLista.add(nuevaPersona);
                     return nuevaPersona;
                 }
             }
            } catch (NumberFormatException e) {
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                   alert.setTitle("Error");
                   alert.setHeaderText("Error de formato");
                   alert.setContentText("La edad debe ser un número entero.");
                   alert.showAndWait();
            }
                   return null;
    }
    
    public Menu getMenu(){
        Menu menu = new Menu("Seleccione una persona");
        for (AgregarPersona persona : PersonasLista){
            MenuItem item = new MenuItem(persona.getNombre() + " - " + persona.getProvincia() + " - " + persona.getEdad());
            item.setOnAction(e -> {
                // hacer algo cuando se seleccione el item
            });
            menu.getItems().add(item);
        }
        return menu;
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
