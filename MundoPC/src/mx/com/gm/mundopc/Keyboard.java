/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.mundopc;

/**
 *
 * @author vhag9
 */
public class Keyboard extends DispositivoEntrada {

    private final int idKeyboard;
    private static int contadorKeyboards;

    public Keyboard(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idKeyboard = ++Keyboard.contadorKeyboards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyboard{idKeyboard=").append(idKeyboard);
        sb.append(" | ").append(super.toString()).append(" | ");
        sb.append('}');

        return sb.toString();
    }
}
