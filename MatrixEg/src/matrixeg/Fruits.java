/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixeg;

/**
 *
 * @author vhag9
 */
public class Fruits {

    private String name;
    private String color;
    private String taste;
    
    public Fruits() {
    }
    
    public Fruits(String name, String color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fruits{name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", taste=").append(taste);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public void printFruits(Fruits fruits[]){
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
    }
}
