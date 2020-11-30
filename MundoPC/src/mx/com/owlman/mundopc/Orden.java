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
public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;//constante
    private int contadorComputadoras;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
            //cada que se agregue una computadora aumentara el tamaño del arreglo
        }
        else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden: " + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);//como ya tiene su metodo to string se puede imprimir la informacion
        }
    }
}
