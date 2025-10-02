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

            System.out.print("Enter your Order: ");
            int order = input.nextInt();

            if (order == 1) {
                // Snacks Menu
                System.out.println("\n[1] - Hotdog [30.00]");
                System.out.println("[2] - Pizza [50.00]");

                int hot = 30;
                int pizza = 50;

                System.out.print("Enter your Order Snacks: ");
                int snacks = input.nextInt();

                if (snacks == 1) {
                    System.out.println("Your Order: Hotdog");
                    System.out.print("Enter Quantity: ");
                    int quan = input.nextInt();
                    int subtotal = quan * hot;
                    double tax = 0.12;
                    double vat = subtotal * tax;
                    double total = subtotal + vat;

                    System.out.printf("Quantity: %d\n", quan);
                    System.out.printf("Subtotal: %.2f\n", (double) subtotal);
                    System.out.printf("Tax (12%%): %.2f\n", vat);
                    System.out.printf("Total: %.2f\n", total);

                    System.out.print("Enter your cash: ");
                    double csh = input.nextDouble();

                    while (csh < total) {
                        System.out.println("Insufficient Cash❌. Enter your cash again: ");
                        csh = input.nextDouble();
                    }

                    double change = csh - total;
                    System.out.printf("Change: %.2f\n", change);

                } else if (snacks == 2) {
                    System.out.println("Your Order: Pizza");
                    System.out.print("Enter Quantity: ");
                    int quan = input.nextInt();
                    int subtotal = quan * pizza;
                    double tax = 0.12;
                    double vat = subtotal * tax;
                    double total = subtotal + vat;

                    System.out.printf("Quantity: %d\n", quan);
                    System.out.printf("Subtotal: %.2f\n", (double) subtotal);
                    System.out.printf("Tax (12%%): %.2f\n", vat);
                    System.out.printf("Total: %.2f\n", total);

                    System.out.print("Enter your cash: ");
                    double csh = input.nextDouble();

                    while (csh < total) {
                        System.out.println("Insufficient Cash❌. Enter your cash again: ");
                        csh = input.nextDouble();
                    }

                    double change = csh - total;
                    System.out.printf("Change: %.2f\n", change);
                }

            } else if (order == 2) {
                // Drinks Menu
                System.out.println("\n[1] - CocaCola [30.00]");
                System.out.println("[2] - Hot Coffee [50.00]");

                int coca = 30;
                int coffee = 50;

                System.out.print("Enter your Order Drinks: ");
                int drinks = input.nextInt();

                if (drinks == 1) {
                    System.out.println("Your Order: CocaCola");
                    System.out.print("Enter Quantity: ");
                    int quan = input.nextInt();
                    int subtotal = quan * coca;
                    double tax = 0.12;
                    double vat = subtotal * tax;
                    double total = subtotal + vat;

                    System.out.printf("Quantity: %d\n", quan);
                    System.out.printf("Subtotal: %.2f\n", (double) subtotal);
                    System.out.printf("Tax (12%%): %.2f\n", vat);
                    System.out.printf("Total: %.2f\n", total);

                    System.out.print("Enter your cash: ");
                    double csh = input.nextDouble();

                    while (csh < total) {
                        System.out.println("Insufficient Cash❌. Enter your cash again: ");
                        csh = input.nextDouble();
                    }

                    double change = csh - total;
                    System.out.printf("Change: %.2f\n", change);

                } else if (drinks == 2) {
                    System.out.println("Your Order: Hot Coffee");
                    System.out.print("Enter Quantity: ");
                    int quan = input.nextInt();
                    int subtotal = quan * coffee;
                    double tax = 0.12;
                    double vat = subtotal * tax;
                    double total = subtotal + vat;

                    System.out.printf("Quantity: %d\n", quan);
                    System.out.printf("Subtotal: %.2f\n", (double) subtotal);
                    System.out.printf("Tax (12%%): %.2f\n", vat);
                    System.out.printf("Total: %.2f\n", total);

                    System.out.print("Enter your cash: ");
                    double csh = input.nextDouble();

                    while (csh < total) {
                        System.out.println("Insufficient Cash❌. Enter your cash again: ");
                        csh = input.nextDouble();
                    }

                    double change = csh - total;
                    System.out.printf("Change: %.2f\n", change);
                }
            } else {
                System.out.println("Invalid Order❌");
            }

            input.close();
        }
    }


