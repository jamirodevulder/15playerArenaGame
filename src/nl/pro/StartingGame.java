package nl.pro;

import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class StartingGame {
    private static Scanner sc = new Scanner(System.in);
    private static int healt = 100;
    private static int maxWeight = 100;
    private  static int attack;
    private  static int defense;


        public static Players[] createplayers(Players[] players, Weapons[] weapons){

        for (int i = 0; i < players.length; i++)
        {
            int playernumber = i + 1;
            System.out.println("speler " + playernumber + " type je gebruikersnaam ");
            String name = sc.next();

            players[i] = new Players( name, healt, randomStats(attack), randomStats(defense), maxWeight);

            System.out.println("\n////////////////////////////////////////////////////////////////////////////////////");
            System.out.println(players[i].getName() + " jouw levens punten zijn: " + players[i].getHealt() +  " jouw aanvalskracht is: " + players[i].getAttack() + " jouw verdedeging is: " + players[i].getDefence());
            System.out.println("////////////////////////////////////////////////////////////////////////////////////\n");

            selectweapon(weapons, players[i]);

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

    private static void selectweapon(Weapons[] weapons, Players players)
    {
        int maxweight = players.getMaxWeight();
        while(true) {
            while (true) {
                System.out.println("\ntype de naam van het wapen dat je wild gebruiken");

                System.out.println("\n/////////////////////////////////////////////");
                for (int o = 0; o < weapons.length; o++) {
                    System.out.println(weapons[o].getName() + " kracht: " + weapons[o].getStrength() + " gewicht: " + weapons[o].getWeight());
                }
                System.out.println("/////////////////////////////////////////////");

                String choise = sc.next();

                for (int o = 0; o < weapons.length; o++) {
                    if (choise.equals(weapons[o].getName())) {
                        players.setWeaponchoise(choise);
                        maxweight -= weapons[o].getWeight();
                        return;
                    }
                }
                System.out.println("dit wapen bestaat niet");

            }
        }
    }
}
