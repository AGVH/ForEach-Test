/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.owlman.mundopc.test;

import mx.com.owlman.mundopc.*;

/**
 *
 * @author vhag9
 */
public class MundoPC {

    public static void main(String[] args) {
        Monitor monitor = new Monitor("Acer", 13);
        Keyboard teclado = new Keyboard("Tipo c", "HyperX");
        Mouse raton = new Mouse("Tipo C", "HyperX");
        Computadora computadora = new Computadora("Mi PC", monitor, teclado, raton);

        Monitor monitor2 = new Monitor("LG", 34);
        Keyboard teclado2 = new Keyboard("Tipo C", "Logitech");
        Mouse raton2 = new Mouse("Tipo C", "Logitech");
        Computadora computadora2 = new Computadora("Mi PC 2", monitor2, teclado2, raton2);
        
        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.agregarComputadora(computadora2);
        
        orden.mostrarOrden();
    }
}
