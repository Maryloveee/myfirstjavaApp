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
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int hb1 = 5; // Player 1 Health
        int hb2 = 5; // Player 2 Health

        while (hb1 > 0 && hb2 > 0) {
            System.out.println("\n--- Rock Paper Scissors ---");
            System.out.println("[1] Rock");
            System.out.println("[2] Paper");
            System.out.println("[3] Scissors");

            System.out.print("Enter Player 1 choice: ");
            int x = input.nextInt();

            System.out.print("Enter Player 2 choice: ");
            int y = input.nextInt();

            // Validate input
            if (x < 1 || x > 3 || y < 1 || y > 3) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            // Determine result
            if (x == y) {
                System.out.println("It's a Draw!");
            } else if ((x == 1 && y == 3) || (x == 2 && y == 1) || (x == 3 && y == 2)) {
                System.out.println("PLAYER 1 WINS THIS ROUND!");
                hb2--; // Player 2 loses health
            } else {
                System.out.println("PLAYER 2 WINS THIS ROUND!");
                hb1--; // Player 1 loses health
            }

            // Display health bars
            System.out.println("Health Bar -> Player 1: " + hb1 + " | Player 2: " + hb2);
        }

        // Final winner
        if (hb1 == 0) {
            System.out.println("\nPlayer 2 wins the game!");
        } else {
            System.out.println("\nPlayer 1 wins the game!");
        }

        input.close();
    }

}
