/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenums;

import testenums.enums.Continentes;
import testenums.enums.Dias;

/**
 *
 * @author vhag9
 */
public class TestEnums {

    public static void main(String[] args) {
//        mostrarDia(Dias.DOMINGO);// <-- Se utiliza el nombre de la clase para llamar a la constante
        System.out.println("Continente: " + Continentes.AFRICA + " | Paises: " + Continentes.AFRICA.getPaises());
    }
    
    public static void mostrarDia(Dias dia){
        switch (dia) {
            case LUNES -> System.out.println(Dias.LUNES + " es el primer dia de la semana");
            case MARTES -> System.out.println(Dias.MARTES + " es el segundo dia de la semana");
            case MIERCOLES -> System.out.println(Dias.MIERCOLES + " es el tercer dia de la semana");
            case JUEVES -> System.out.println(Dias.JUEVES + " es el cuarto dia de la semana");
            case VIERNES -> System.out.println(Dias.VIERNES + " es el quinto dia de la semana");
            case SABADO -> System.out.println(Dias.SABADO + " es el sexto dia de la semana");
            case DOMINGO -> System.out.println(Dias.DOMINGO + " es el septimo dia de la semana");
            default -> throw new AssertionError();
        }
    }
}
