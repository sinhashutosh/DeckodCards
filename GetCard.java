package org.example;

import java.util.Random;
import java.util.Scanner;

public class GetCard {
    void suffle(String[] suit, String[] rank) {
        Scanner sc = new Scanner(System.in);
        String[] playerName = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter " + (i + 1) + " player name");
            playerName[i] = sc.next();
        }
        int[][] array = new int[suit.length][rank.length];
        int n = 52;
        String[] playerDeck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                playerDeck[suit.length * i + j] = rank[i] + " of " + suit[j];
            }
        }

        for (int i = 0; i < n; i++) {
            Random rd = new Random();
            int j = 11 + rd.nextInt(41);
            String temp = playerDeck[j];
            playerDeck[j] = playerDeck[i];
            playerDeck[i] = temp;
        }
        for (int i = 0; i < 4; i++) {
            array[i][0] = i + 1;
            System.out.println();
            System.out.println(playerName[i] + " cards are " + array[i][0]);
            System.out.println();
            for (int j = 0; j < 13; j++) {
                System.out.println(playerDeck[i + j * 4]);
            }

        }
    }
}
