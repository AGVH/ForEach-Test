
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
public class ScannerEg {
    public static void main(String[] args) {
        System.out.println("Hello! What's your name?");
        Scanner scan = new Scanner(System.in);
        var namePlayer = scan.nextLine();
        System.out.println("Rol?");
        var rolPlayer = scan.nextLine();
        System.out.println("Welcome " + rolPlayer + " " + namePlayer);
    }
}
