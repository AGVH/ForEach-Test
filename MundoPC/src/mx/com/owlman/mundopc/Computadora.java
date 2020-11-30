/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.owlman.mundopc;

/**
 *
 * @author vhag9
 */
public class Computadora {//Relacion de agregación diamante
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Keyboard teclado;
    private Mouse raton;
    private static int contadorComputadoras;
    
    private Computadora(){//sólo se usa para inicializar el valor idComputadora
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    public Computadora(String nombre, Monitor monitor, Keyboard teclado, Mouse raton){
        this();//Para que se inicialice el atributo idComputadora
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }   
    public int getIdComputadora(){
        return idComputadora;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getTeclado() {
        return teclado;
    }

    public void setTeclado(Keyboard teclado) {
        this.teclado = teclado;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }//cuando mandamos a imprimir un obj tipo comp cada obj como monitor traera su propia información
    
}
