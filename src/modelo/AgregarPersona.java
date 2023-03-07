/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**se define la clase AgregarPersona para poder instanciar los objetos Persona.
 * @author Vidal Flores Montero carne 2021579554 Ingenieria de Computadores.
 */
public class AgregarPersona {
    
    //se definen las variables a utilizar para poder genera el objeto "persona"
    private String Nombre;
    private String Provincia;
    private int edad;
    
    /**se define el contructor de la clase AgregarPersona
     * @param Nombre parametro String con el nombre del objeto
     * @param Provincia parametro String con el nombre de la provincia del objeto
     * @param edad parametro int de la edad del objeto
     **/
    public AgregarPersona(String Nombre, String Provincia,int edad) {
        this.Nombre = Nombre;
        this.Provincia = Provincia;
        this.edad = edad;   
    }
    
    /**se define el metodo getNombre del objeto.
     * @return devuelve el nombre almacenado del objeto.
     **/
    public String getNombre() {
        return Nombre;
    }
    
    /**se define el metodo setNombre del objeto.
     * @param Nombre parametro con el nombre para poder setearlo al objeto.
     **/
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**se define el metodo getProvincia del objeto.
     * @return devuelve la provincia almacenada del objeto.
     **/
    public String getProvincia() {
        return Provincia;
    }
    
    /**se define el metodo setProvincia del objeto.
     * @param Provincia parametro con el nombre de la provincia para poder 
     * setearlo al objeto.
     **/
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    
    /**se define el metodo getEdad del objeto.
     * @return devuelve la edad almacenada del objeto.
     **/
    public int getEdad() {
        return edad;
    }
    
    /**se define el metodo setEdad del objeto.
     * @param edad parametro con la edad para poder setearlo al objeto.
     **/
    public void setEdad(int edad) {
        this.edad = edad;
        
    
    }
    
    /**se define el metodo toString para poder imprimir en consola y mostrar en 
    * los comboBox los atributos mas representativos 
    * y no su notacion paquete.clase@hashexadecimal
    * @return devuelve el nombre junto a la edad con la que instació el objeto.
    **/
    @Override
    public String toString(){
    
        return getNombre() + " , "+ getEdad();
    
    }
       
 }

    
    
    
    
    
    
    
    
    
    
    

