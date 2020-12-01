package com.hechicero;

public class Hechizos {

    private String tipoHechizo;
    private String nombreHechizo;

    public Hechizos(String tipoHechizo, String nombreHechizo) {
        this.tipoHechizo = tipoHechizo;
        this.nombreHechizo = nombreHechizo;
    }

    public String getTipoHechizo() {
        return tipoHechizo;
    }

    public void setTipoHechizo(String tipoHechizo) {
        this.tipoHechizo = tipoHechizo;
    }

    public String getNombreHechizo() {
        return nombreHechizo;
    }

    public void setNombreHechizo(String nombreHechizo) {
        this.nombreHechizo = nombreHechizo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hechizos{tipoHechizo=").append(tipoHechizo);
        sb.append(", nombreHechizo=").append(nombreHechizo);
        sb.append('}');
        return sb.toString();
    }

}
