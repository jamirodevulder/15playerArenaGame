package nl.pro;

import java.util.Random;
import java.util.Scanner;

public class StartingGame {
    private static Scanner sc = new Scanner(System.in);
    private static int healt = 100;
    private static int maxWeight = 100;
    private  static int attack;
    private  static int defense;


        public static Players[] createplayers(Players[] players){

        for (int i = 0; i < players.length; i++)
        {
            System.out.println("Player " + i + " type your username");
            String name = sc.next();

            players[i] = new Players( name, healt, randomStats(attack), randomStats(defense), maxWeight);




        }

        return players;
    }

    // hier word attack en defence random bepaald met een kracht van 1 tot 10
    private static int randomStats(int stats)
    {
         stats = (int)(Math.random() * ((10 - 1) + 1)) + 1;
        return stats;
    }

    public static int startGame()
    {
        // hier vraag ik aan de speler met hoeveel mensen hij dit spel wild gaan spelen
        while(true) {
            System.out.println("met hoeveel spelers wil je spelen?");
            int amountOfPlayers = sc.nextInt();

            // hier check ik of hij niet teveel of te weinig spelers heeft aangegeven. als het niet de toegestaane hoeveelheid is vraagt het spel het opnieuw
            if (amountOfPlayers != 0 && amountOfPlayers <= 15) {

                return amountOfPlayers;
            } else {
                System.out.println("je kunt alleen 2 tot 15 spelers kiezen");
            }


        }
    }
}
