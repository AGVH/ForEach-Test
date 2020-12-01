/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hechicero;

/**
 *
 * @author vhag9
 */
public class HechizoAgua extends Hechizos{
    private final int idHechizo;//como es final solo se puede inicializar una vez
    private static int contadorHechizos;//static hace que la variable sea llamada cuando se carga la clase no cuando se crea un objeto de la misma
    private double poder;

    public HechizoAgua(String tipoHechizo, String nombreHechizo, double power) {//sobrecargamos el constructor agregando un nuevo argumento (poder)
        super(tipoHechizo, nombreHechizo);
        this.idHechizo = ++HechizoAgua.contadorHechizos;
        this.poder = power;
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
        sb.append("HechizoAgua{idHechizo=").append(idHechizo);
        sb.append(", power=").append(poder);
        sb.append(" | ").append(super.toString()).append(" | ");
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
