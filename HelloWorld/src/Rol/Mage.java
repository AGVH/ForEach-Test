/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rol;

import java.util.Date;

/**
 *
 * @author vhag9
 */
public class Mage extends Rol {

    private int qtySpells;
    private String spell;
    private Date date;

    public Mage(String name, String rol, int hp, double power, int qtySpells, String spell, Date date) {
        super(name, rol, hp, power);
        this.qtySpells = qtySpells;
        this.spell = spell;
        this.date = date;
    }

    public int getQtySpells() {
        return qtySpells;
    }

    public void setQtySpells(int qtySpells) {
        this.qtySpells = qtySpells;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", qtySpells=").append(qtySpells);
        sb.append(", spell=").append(spell);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

}
