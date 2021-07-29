package com.tehk42;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move ( r - Rock, s - Scissors, p - Paper )");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {
                    break;
                }
                System.out.println("Invalid Input. Please try again");
            }

            System.out.println("Computer played " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You Win!");
                }
            }

            System.out.println("Play again? (y/n) ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
            scanner.close();
        }
    }
}
