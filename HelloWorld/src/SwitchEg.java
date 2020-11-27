
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
public class SwitchEg {

    public static void main(String[] args) {
        var number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a number");
        number = scan.nextInt();

//        switch (number) {
//            case 1 -> System.out.println("Hello bro!");
//            case 2 -> System.out.println("How u doin?!");
//            default -> System.out.println("Option not suported");
//        }
        switch (number) {
            case 1, 2, 12 -> {
                System.out.println("WINTER");
            }
            case 3, 4, 5 -> {
                System.out.println("SPRING");
            }
            case 6, 7, 8 -> {
                System.out.println("SUMMER");
            }
            case 9, 10, 11 -> {
                System.out.println("AUTUMN");
            }
            default ->
                System.out.println("Invalid option");
        }
    }
}
