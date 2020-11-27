/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolTest;

import Rol.Mage;
import Rol.Rol;
import java.util.Date;

/**
 *
 * @author vhag9
 */
public class RolTest {
    public static void main(String[] args) {
        Mage mage = new Mage("zentinel", "mage", 500, 10.10, 3, "Fatalis", new Date());
        System.out.println(mage.toString());
    }
}
