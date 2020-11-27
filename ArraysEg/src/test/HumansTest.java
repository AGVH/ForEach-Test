/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import humans.Humans;

/**
 *
 * @author vhag9
 */
public class HumansTest {

    public static void main(String[] args) {
        Humans humans[] = new Humans[3];
        Humans human1 = new Humans("zentinel", 10, 'M');
        Humans human2 = new Humans("owlman", 20, 'F');
        Humans human3 = new Humans("howl", 30, 'X');
        
        humans[0] = human1;
        humans[1] = human2;
        humans[2] = human3;
        
        for (Humans human : humans) {
            System.out.println(human.toString());
        }
    }
}
