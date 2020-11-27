
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
public class ConditionalOper {

    public static void main(String[] args) {
        var min = 1;
        var max = 15;
        var inputUser = 0;
        var productUser = "";
        var product1 = "Soup";
        var product2 = "Pasta";
        var verify = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Available products: Soup or Pasta");
        productUser = scan.nextLine();
        verify = productUser.equals(product1) || productUser.equals(product2);
        if (verify) {
            System.out.println("Qty.");
            inputUser = scan.nextInt();
            verify = inputUser >= min && inputUser <= max;
            if (verify) {
                System.out.println("----------------------------");
                System.out.println("Cart");
                System.out.println("Product - Qty.");
                System.out.println(productUser+"     "+inputUser);
                System.out.println("----------------------------");
            }else{
                System.out.println("You only can buy 1-15");
            }
            
        }else{
            System.out.println("non-existent product");
        }

    }
}
