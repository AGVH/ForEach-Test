/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rol;

import java.util.Objects;

/**
 *
 * @author vhag9
 */
public class Rol {

    protected String name;
    protected String rol;
    protected int hp;
    protected double power;

    public Rol(String name, String rol, int hp, double power) {
        this.name = name;
        this.rol = rol;
        this.hp = hp;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.rol);
        hash = 83 * hash + this.hp;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.power) ^ (Double.doubleToLongBits(this.power) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rol other = (Rol) obj;
        if (this.hp != other.hp) {
            return false;
        }
        if (Double.doubleToLongBits(this.power) != Double.doubleToLongBits(other.power)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.rol, other.rol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{name=").append(name);
        sb.append(", rol=").append(rol);
        sb.append(", hp=").append(hp);
        sb.append(", power=").append(power);
        sb.append('}');
        return sb.toString();
    }

    
}
