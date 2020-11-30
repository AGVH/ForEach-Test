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
public class Mouse extends DispositivoEntrada{
    private final int idMouse;//constante
    private static int contadorMice;//
    
    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorMice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{idMouse=").append(idMouse);
        sb.append(" | ").append(super.toString()).append(" | ");//se usa super para mostrar los datos de la clase padre
        sb.append('}');
        
        return sb.toString();
    }
    
    
}
