/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Vidal Flores Montero
 */
public class Operaciones {
    //se definen atributos de operaciones
    private int operando1;
    private int operando2;
    private double resultado;
    
    public int suma(int operando1, int operando2,double resultado){
        resultado= operando1 + operando2;
        return (int) resultado;
    }
    public int resta(int operando1, int operando2,double resultado){
        resultado= operando1 - operando2;
        return (int) resultado;
    }
    public int multiplica(int operando1, int operando2,double resultado){
        resultado= operando1 * operando2;
        return (int) resultado;
    }
    public int dividir(int operando1, int operando2,double resultado){
        resultado= operando1 / operando2;
        return (int) (double) resultado;
    }
    }
   

