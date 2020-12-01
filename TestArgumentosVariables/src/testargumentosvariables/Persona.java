/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testargumentosvariables;

/**
 *
 * @author vhag9
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre: ").append(nombre);
        sb.append(", edad: ").append(edad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
