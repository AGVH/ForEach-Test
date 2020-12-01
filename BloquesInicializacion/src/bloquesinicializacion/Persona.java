/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquesinicializacion;

/**
 *
 * @author vhag9
 */
public class Persona {
    private final int idPersona;
    public static int contadorPersona;
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    Persona(){
        System.out.println("Constructor Persona");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
