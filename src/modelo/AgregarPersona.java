/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Vidal Flores Montero carne 2021579554
 */

    /*se define la clase AgregarPersona */
public class AgregarPersona {
    //se definen las variables a utilizar para poder genera el objeto "persona"
    private String Nombre;
    private String Provincia;
    private int edad;
    
    //se define el contructor de la clase
    public AgregarPersona(String Nombre, String Provincia,int edad) {
        this.Nombre = Nombre;
        this.Provincia = Provincia;
        this.edad = edad;   
    }
    
    //se define el getter de nombre
    public String getNombre() {
        return Nombre;
    }
    //se define el setter de nombre
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    //se define el getter de provincia
    public String getProvincia() {
        return Provincia;
    }
    //se define el setter de provincia
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    // se define el getter de edad
    public int getEdad() {
        return edad;
    }
    // se define el setter de edad
    public void setEdad(int edad) {
        this.edad = edad;
        
    
    }
    @Override
    /*se define el metodo toString para poder imprimir en consola y mostrar en 
    los comboBox los atributos mas representativos y no su notacion paquete.clase@hashexadecimal*/
    public String toString(){
    
        return getNombre() + " "+ getEdad();
    
    }
       
 }

    
    
    
    
    
    
    
    
    
    
    

