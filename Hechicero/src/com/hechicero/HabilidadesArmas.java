package com.hechicero;

/**
 *
 * @author vhag9
 */
public class HabilidadesArmas {

    private final int idHabilidadesArmas;
    private static int contadorHabilidadesArmas;
    private HechizoAgua hechizoAgua;
    private HechizoFuego hechizoFuego;
    private Cetro cetro;
    private String nombre;

    private HabilidadesArmas() {
        this.idHabilidadesArmas = ++ HabilidadesArmas.contadorHabilidadesArmas;
    }
    
    public HabilidadesArmas(String nombre, HechizoAgua hechizoAgua, HechizoFuego hechizoFuego,  Cetro cetro){
        this();
        this.nombre = nombre;
        this.hechizoAgua = hechizoAgua;
        this.hechizoFuego = hechizoFuego;
        this.cetro = cetro;
    }
    
    public int getIdHabilidadesArmas(){
        return this.idHabilidadesArmas;
    }

    public HechizoAgua getHechizoAgua() {
        return hechizoAgua;
    }

    public void setHechizoAgua(HechizoAgua hechizoAgua) {
        this.hechizoAgua = hechizoAgua;
    }

    public HechizoFuego getHechizoFuego() {
        return hechizoFuego;
    }

    public void setHechizoFuego(HechizoFuego hechizoFuego) {
        this.hechizoFuego = hechizoFuego;
    }

    public Cetro getCetro() {
        return cetro;
    }

    public void setCetro(Cetro cetro) {
        this.cetro = cetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HabilidadesArmas{idHabilidadesArmas=").append(idHabilidadesArmas);
        sb.append(", hechizoAgua=").append(hechizoAgua);
        sb.append(", hechizoFuego=").append(hechizoFuego);
        sb.append(", cetro=").append(cetro);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
