
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
public class WhileEg {

    public static void main(String[] args) {
        var num = 0;
        Scanner scan = new Scanner(System.in);
//        while (num < 3) {
//            System.out.println("num = " + num);
//            num ++;
//        }
        do {
            System.out.println("-----------");
            System.out.println("Menu");
            System.out.println("-----------");
            System.out.println("1. Ajustes");
            System.out.println("2. Orientacion");
            System.out.println("3. Exit");
            System.out.println("-----------");
            num = scan.nextInt();
            
            switch (num) {
                case 1 -> {
                    do {
                        System.out.println("-----------");
                        System.out.println("Ajustes");
                        System.out.println("-----------");
                        System.out.println("1. Color");
                        System.out.println("2. Iluminacion");
                        System.out.println("3. Regresar");
                        System.out.println("-----------");
                        num = scan.nextInt();
                        switch (num) {
                            case 1 -> {
                                System.out.println("Color cambiado");
                            }
                            case 2 -> {
                                System.out.println("Iluminacion cambiada");
                            }
                            case 3 -> {
                                num = 10;
                            }
                            default ->
                                System.out.println();
                        }
                    } while (num != 10);

                }
                case 2 -> {
                    do {
                        System.out.println("-----------");
                        System.out.println("Orientacion");
                        System.out.println("-----------");
                        System.out.println("1. Horizontal");
                        System.out.println("2. Vertical");
                        System.out.println("3. Regresar");
                        System.out.println("-----------");
                        num = scan.nextInt();
                        switch (num) {
                            case 1 -> {
                                System.out.println("Orientacion Horizontal");
                            }
                            case 2 -> {
                                System.out.println("Orientacion vertical");
                            }
                            case 3 -> {
                                num = 20;
                            }
                            default ->
                                System.out.println();
                        }
                    } while (num != 20);
                }
                case 3 -> {
                    System.out.println("Bye");
                    num = 0;
                }
                default ->
                    System.out.println();
            }
        } while (num != 0);

    }
}
