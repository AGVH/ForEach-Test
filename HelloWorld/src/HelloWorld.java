/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vhag9
 */
public class HelloWorld {

    public static void main(String[] args) {
        int myAge = 10;
        String myName = "Victor";
        var healthPoints = 10;
        var powerPoints = "one thousand";
        var spells = false;
        var rol = 'M';
        var myVar = myName + " | " + healthPoints + " | " + powerPoints + " | " + spells + " | " + rol;//ctrl + space to complete

        System.out.println("Hello World!");
        System.out.println("myAge = " + myAge);//soutv + tab
        System.out.println("myName = " + myName);
        System.out.println("healthPoints = " + healthPoints);
        System.out.println("powerPoints = " + powerPoints);
        System.out.println("spells = " + spells);
        System.out.println("myVar = " + myVar);
        System.out.println(healthPoints + 5 + " hp -> " + myName);
        System.out.printf("healthPoints X 2 = %d", healthPoints * 2);
        System.out.println();
        System.out.println(myName + " : " + (healthPoints + myAge));
        
        
    }
}
