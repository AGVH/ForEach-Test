
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
public class ArithmeticOperators {

    public static void main(String[] args) {
        int numbers[], x;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        x = scan.nextInt();
        numbers = new int[x + 1];
        numbers[numbers.length - 1] = 0;
        System.out.println("Type one by one your numbers. Use enter key to separate them:");
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = scan.nextInt();
            numbers[numbers.length - 1] += numbers[i];
        }
        System.out.println("Result : " + numbers[numbers.length-1]); 
        //falta ordenarlos, encontrar el mayor y pintar los ceros a la izquierda para darle formatos
        //agregar tokenizer para hacer la suma más 
    }
}
