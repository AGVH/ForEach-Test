
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vhag9
 */
public class TernaryOper {

    public static void main(String[] args) {

//        var yes = "yes";
//        var inputUsr = "";
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Do you like pokemon?");
//        inputUsr = scan.nextLine();
//        var result = (inputUsr.equals(yes)) ? "OMG! :)" : "So sad :(";
//        System.out.println(result);
        var num1 = 0;
        var num2 = 0;
        var result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("The biggest one!");
        System.out.println("Type a number:");
        num1 = scan.nextInt();
        System.out.println("Type the second number:");
        num2 = scan.nextInt();
        System.out.println("The biggest one is...");
        result = (num1 > num2) ? num1 : num2;
        System.out.println(result);
    }
}
