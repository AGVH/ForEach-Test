
package com.owlman.orden;

import com.owlman.venta.Producto;

/**
 *
 * @author vhag9
 */
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; //constante
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;//para asignar el id de la orden
                                               //se cuentan cuantas ordenes van
                                               //y se asigna el valor a idOrden
        this.productos = new Producto[MAX_PRODUCTOS]; //primero inicializar
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto; //una vez agregado el producto, incrementa el indice
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $ " + totalOrden);
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
