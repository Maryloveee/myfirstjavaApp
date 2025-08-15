/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myfirstjavaapp;
import java.util.Scanner;

/**
 *
 * @author JIREIGN
 */
public class MyfirstjavaApp {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Number 1:");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Enter Number 2:");
        int y = Integer.parseInt(input.nextLine());
        
        int sum = x + y;
        System.out.println("The sum is: " + sum);
        
        int rock = 1;
        int paper = 2;
        int scissor = 3;
        
        System.out.println("1.ROCK");
        System.out.println("2.PAPER");
        System.out.println("3.SCISSOR");
        
        System.out.println("Player 1 select Option:");
        int player1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Player 2 select Option:");
        int player2 = Integer.parseInt(input.nextLine());
        
        if (player1 == 1 && player2 ==1)
        {
           System.out.println("DRAW");
        }
        else if (player1 == 1 && player2 == 2 || player1 == 2 && player2 == 3 || player1 == 3 && player2 ==1)
        {
            System.out.println("WIN PLAYER 2");
        }
        
        else if (player1 == 2 && player2 == 1 || player1 == 3 && player2 == 2 || player1 == 1 && player2 ==3)
        {
            System.out.println("WIN PLAYER 1");
        }
        else
        {
            System.out.println("INVALID CHOICES");
        }
    }
}
