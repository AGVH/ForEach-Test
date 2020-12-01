/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hechicero.test;

import com.hechicero.Cetro;
import com.hechicero.HabilidadesArmas;
import com.hechicero.Hechicero;
import com.hechicero.HechizoAgua;
import com.hechicero.HechizoFuego;

/**
 *
 * @author vhag9
 */
public class HechiceroTest {
    public static void main(String[] args) {
        Cetro cetro = new Cetro("Rod of tahuti",100);
        HechizoFuego hf = new HechizoFuego("Hechizo de fuego", "Souls Burner", 500);
        HechizoAgua ha = new HechizoAgua("Hechizo de agua", "Pistola de agua", 500);
        Hechicero hechicero = new Hechicero("zentinel", 500, 500);
        HabilidadesArmas habarm = new HabilidadesArmas("Mis trucos", ha, hf, cetro);
        
        hechicero.agregarHabArm(habarm);
        hechicero.mostrarHechicero();
    }
}
