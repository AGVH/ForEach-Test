/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenums.enums;

/**
 *
 * @author vhag9
 */
public enum Continentes {
    AFRICA(53),
    AMERICA(46),
    ASIA(44),
    EUROPA(34),
    OCEANIA(14);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    } 
    
    public int getPaises(){
        return paises;
    }
}
