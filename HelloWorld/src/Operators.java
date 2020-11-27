
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
public class Operators {

    public static void main(String[] args) {
//        var age = 0;
//        var ageAdult = 18;
//        var rU = false;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Are you an adult?");
//        System.out.println("Type your age:");
//        age = scan.nextInt();
//        rU = (age >= ageAdult);
//        if (rU) {
//            System.out.println("You are an adult! :)");
//        } else {
//            System.out.println("You are not an adult! :(");
//        }

        var agentName = "James Bond";
        var yourName = "";
        var areYou = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you the 007 agent?");
        System.out.println("Please type your name:");
        yourName=scan.nextLine();
        areYou = yourName.equals(agentName);
        if (areYou) {
            System.out.println("Good evening, "+agentName);
        }
        else{
            System.out.println("You are an impostor");
        }
    }
}
