
import java.text.NumberFormat;
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
public class BooleanEg {

    public static void main(String[] args) {
       /* var m = 0;
        var b = 0;
        NumberFormat fmtP = NumberFormat.getPercentInstance();

        String respuesta;
        boolean decision = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Buena o mala persona?");
        System.out.println("----------------------");
        System.out.println("Has matado a alguien en minecraft?");//////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Has robado un chicle?");//////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Has robado loot a tus compañeros?");////////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Has visto televisión hasta tarde?");///////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Te has comido un gansito que no era tuyo?");//////////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Has comido todas tus verduras?");//////////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            b++;
        } else if (respuesta.equals("no")) {
            m++;
        }
        System.out.println("Has tomado agua regularmente?");////////////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            b++;
        } else if (respuesta.equals("no")) {
            m++;
        }
        System.out.println("Has copiado en un examen?");////////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Has usado hacks?");///////////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        System.out.println("Has mentido en este test?");//////////////
        respuesta = scan.nextLine();
        if (respuesta.equals("si")) {
            m++;
        } else if (respuesta.equals("no")) {
            b++;
        }
        if (b > m) {
            decision = true;
        }
        if (decision) {
            System.out.println("Felicidades, eres buena persona :)");
        } else {
            System.out.println("Eres una mala persona :(");
        }
        float f = (float)b;
        f = f/10;
        System.out.println(fmtP.format(f)+" bueno");
        f = (float) m;
        f = f/10;
        System.out.println(fmtP.format(f)+" malo");*/
       var edad = 13;
       var esAdulto = edad >= 18;//se evalua si la edad es 18 y se asigna el valor booleano a la variable esAdulto
        System.out.println("esAdulto = " + esAdulto);
    }
}
