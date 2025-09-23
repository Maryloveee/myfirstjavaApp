/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package newpackage;
import java.util.Scanner;
/**
 *
 * @author CL2~PC04
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Cafeteria");
      System.out.println("[1] - Snacks");
      System.out.println("[2] - Drinks");
      
      System.out.println("Enter your Order:");
      int order = input.nextInt();
      
      if (order ==1){
      System.out.println("[1] - Snacks");
      System.out.println("[1] - Hotdog [30.00]");
      System.out.println("[2] - Pizza [50.00]");
      
      int hot = 30;
      int pizza = 50;
      System.out.println("Enter your Order Snacks:");
      int snacks = input.nextInt();
      
      if(snacks ==1){
      System.out.println("Your Order Hotdog:");
      System.out.println("Enter Quantity");
      int quan = input.nextInt();
      int quan1 = quan * hot;
      System.out.println("total: " + quan1);
      
      double tax = 0.12;
      double vat = quan1 * tax;
      double total = vat + quan1;
      System.out.println("Total: " + total);
      
      System.out.println("Enter your cash:");
      int csh = input.nextInt();
      
      while(csh < total){
      System.out.println("Insufficient Cash❌. Enter your cash:");
      csh = input.nextInt();
      double change = csh - total;
      System.out.println("Change is:" + change);
       }
              
      }else if(snacks ==2){
      System.out.println("Your order Pizza");
      System.out.println("Enter Quantity");
      int quan = input.nextInt();
      int quan1 = quan * pizza;
      System.out.println("total: " + quan1);
      
      double tax = 0.12;
      double vat = quan1 * tax;
      double total = vat + quan1;
      System.out.println("Total: " + total);
      
      System.out.println("Enter your cash:");
      int csh = input.nextInt();
      
      while(csh < total){
      System.out.println("Insufficient cash❌. Enter your cash:");
      csh = input.nextInt();
      double change = csh - total;
      System.out.println("Change is:" + change);
        }
      
       }
      }else if (order ==2) {
      System.out.println("Drinks");
      System.out.println("[1] CocaCola [30.00]");
      System.out.println("[2] Hot Coffee [50.00]");
      
      int coca = 30;
      int coffee = 50;
      System.out.println("Enter your order Drinks");
      int drinks = input.nextInt();
      
      if (drinks == 1){
      System.out.println("Your order coca");
      System.out.println("Enter Quantity");
      int quan = input.nextInt();
      int quan1 = quan * coca;
      System.out.println("Total:" + quan1);
      
      double tax = 0.12;
      double vat = quan1 * tax;
      
      }
      }
     }
   }
    

