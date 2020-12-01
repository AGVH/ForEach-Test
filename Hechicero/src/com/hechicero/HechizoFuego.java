package com.hechicero;

/**
 *
 * @author vhag9
 */
public class HechizoFuego extends Hechizos {

    private final int idHechizo;//como es final solo se puede inicializar una vez
    private static int contadorHechizos;//static hace que la variable sea llamada cuando se carga la clase no cuando se crea un objeto de la misma
    private double poder;

    public HechizoFuego(String tipoHechizo, String nombreHechizo, double power) {
        super(tipoHechizo, nombreHechizo);
        this.idHechizo = ++HechizoFuego.contadorHechizos;
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
        sb.append("HechizoFuego{idHechizo=").append(idHechizo);
        sb.append(", power=").append(poder);
        sb.append(" | ").append(super.toString()).append(" | "); 
        sb.append('}');
        return sb.toString();
    }

}
