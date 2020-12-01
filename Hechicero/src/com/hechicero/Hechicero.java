package com.hechicero;

/**
 *
 * @author vhag9
 */
public class Hechicero {
    private final int idHechicero;
    private static final int MAX_HABARM = 10;
    private static int contadorHechiceros;
    HabilidadesArmas habArm[];
    private int contadorHabArms;
    
    private String nombre;
    private double salud;
    private double mana;
    
    private Hechicero(){
        this.idHechicero = ++Hechicero.contadorHechiceros;
        this.habArm = new HabilidadesArmas [Hechicero.MAX_HABARM];
    }
    public Hechicero(String nombre, double salud, double mana){
        this();
        this.nombre = nombre;
        this.salud = salud;
        this.mana = mana;
    }
    //Si no ha superado el limite maximo se agregan mas habarm
    //y se aumenta el tamaño del arrelgo
    public void agregarHabArm(HabilidadesArmas habArm){
        if (this.contadorHabArms < Hechicero.MAX_HABARM) {
            this.habArm [this.contadorHabArms++] = habArm;
        }
        else{
            System.out.println("Limite superado: " + Hechicero.MAX_HABARM);
        }
    }
    
    public void mostrarHechicero(){
        System.out.println(this.toString());
        System.out.println("Habilidades y hechizos: " + this.contadorHabArms);
        for (int i = 0; i < this.contadorHabArms; i++) {
            System.out.println(this.habArm[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hechicero{idHechicero=").append(idHechicero);
        sb.append(", contadorHabArms=").append(contadorHabArms);
        sb.append(", nombre=").append(nombre);
        sb.append(", salud=").append(salud);
        sb.append(", mana=").append(mana);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
