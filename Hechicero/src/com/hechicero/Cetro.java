package com.hechicero;

/**
 *
 * @author vhag9
 */
public class Cetro {
    private final int idCetro;
    private static int contadorCetros;
    private String nombreCetro;
    private double poder;
    
    private Cetro(){
        this.idCetro = ++Cetro.contadorCetros;
    }
    
    public Cetro(String nombreCetro, double poder){
        this();
        this.nombreCetro = nombreCetro;
        this.poder = poder;
    }
    
    public int getIdCetro(){
        return this.idCetro;
    }

    public String getNombreCetro() {
        return nombreCetro;
    }

    public void setNombreCetro(String nombreCetro) {
        this.nombreCetro = nombreCetro;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cetro{idCetro=").append(idCetro);
        sb.append(", nombreCetro=").append(nombreCetro);
        sb.append(", poder=").append(poder);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
