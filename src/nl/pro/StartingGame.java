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
    private static boolean next = true;


        public static Players[] createplayers(Players[] players, Weapons[] weapons, Shields[] shields, Armour[] armours){

        for (int i = 0; i < players.length; i++)
        {
            int playernumber = i + 1;
            System.out.println("speler " + playernumber + " type je gebruikersnaam ");
            String name = sc.next();


            players[i] = new Players( name, healt, randomStats(attack), randomStats(defense), maxWeight);

            System.out.println("\n////////////////////////////////////////////////////////////////////////////////////");
            System.out.println(players[i].getName() + " jouw levens punten zijn: " + players[i].getHealt() +  " jouw aanvalskracht is: " + players[i].getAttack() + " jouw verdedeging is: " + players[i].getDefence());
            System.out.println("////////////////////////////////////////////////////////////////////////////////////\n");



                selectItems(weapons, players[i], shields, armours);

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
            try {
                System.out.println("met hoeveel spelers wil je spelen?");
                int amountOfPlayers = sc.nextInt();

                // hier check ik of hij niet teveel of te weinig spelers heeft aangegeven. als het niet de toegestaane hoeveelheid is vraagt het spel het opnieuw
                if (amountOfPlayers != 0 && amountOfPlayers <= 15) {

                    return amountOfPlayers;
                } else {
                    System.out.println("je kunt alleen 2 tot 15 spelers kiezen");
                }
            } catch (Exception e)
            {
                System.out.println("dit was geen nummer");
                sc.next();
            }
        }
    }

    private static void selectItems(Weapons[] weapons, Players players, Shields[] shields, Armour[] armours)
    {
        int maxweight = players.getMaxWeight();
            // wapen selectie
            while (maxweight == 100) {
                System.out.println("\ntype de naam van het wapen dat je wild gebruiken");

                System.out.println("\n/////////////////////////////////////////////");
                for (int o = 0; o < weapons.length; o++) {
                    System.out.println(weapons[o].getName() + " kracht: " + weapons[o].getStrength() + " gewicht: " + weapons[o].getWeight());
                }
                System.out.println("/////////////////////////////////////////////");

                String choise = sc.next();

                for (int o = 0; o < weapons.length; o++) {
                    if (choise.equals(weapons[o].getName())) {
                        players.setWeaponchoise(weapons[o]);
                        maxweight -= weapons[o].getWeight();
                        if(maxweight <= 50)
                        {
                            System.out.println("helaas je bent niet sterk genoeg om een schild te kunnen dragen");
                        }
                    }
                }
                if(maxweight == 100) {
                    System.out.println("\ndit wapen bestaat niet");
                }


            }
            // schild selectie
        int currentWeight = maxweight;
            while(maxweight >= 50 && players.getShieldchoise() == null)
            {
                System.out.println("\n je kunt dit gewicht nog dragen: " + maxweight);

                System.out.println("\ntype de naam van het schild dat je wild gebruiken");

                System.out.println("\n/////////////////////////////////////////////");
                for (int o = 0; o < shields.length; o++) {
                    System.out.println(shields[o].getName() + " verdedeging: " + shields[o].getDefence() + " gewicht: " + shields[o].getWeight());
                }
                System.out.println("/////////////////////////////////////////////");

                String choise = sc.next();

                for (int o = 0; o < shields.length; o++) {
                    if (choise.equals(shields[o].getName())) {
                        players.setShieldchoise(shields[o]);
                        maxweight -= shields[o].getWeight();
                    }
                }
                if(maxweight == currentWeight) {
                    System.out.println("\ndit schild bestaat niet");
                }


            }

             currentWeight = maxweight;
            while(players.getArmourchoise() == null)
            {
            System.out.println("\n je kunt dit gewicht nog dragen: " + maxweight);

            System.out.println("\ntype de naam van het panzer dat je wild gebruiken");

            System.out.println("\n/////////////////////////////////////////////");
            for (int o = 0; o < armours.length; o++) {
                System.out.println(armours[o].getName() + " verdedeging: " + armours[o].getDefence() + " gewicht: " + armours[o].getWeight());
            }
            System.out.println("/////////////////////////////////////////////");

            String choise = sc.next();

            for (int o = 0; o < armours.length; o++) {
                if (choise.equals(armours[o].getName())) {
                    if(0 >= armours[o].getWeight() - maxweight) {
                        players.setArmourchoise(armours[o]);
                        maxweight -= armours[o].getWeight();
                    }
                    else
                    {
                        System.out.println("dit gewicht kan je niet aan");
                    }
                }
            }
            if(maxweight == currentWeight) {
                System.out.println("\ndit armour bestaat niet");
            }


        }


            // hier worden alle player stats gezet
            players.setAttack(players.getAttack() + players.getWeaponchoise().getStrength());

            if(players.getShieldchoise() != null) {
            players.setDefence(players.getDefence() + players.getShieldchoise().getDefence()+ players.getArmourchoise().getDefence());
            }else {
            players.setDefence(players.getDefence() + players.getArmourchoise().getDefence());
            }


            players.setWeaponDurability(players.getWeaponchoise().getDurability());

            if(players.getShieldchoise() != null) {
               players.setShieldDurability(players.getShieldchoise().getDurability());
            }

            players.setArmourDurability(players.getArmourchoise().getDurability());
            if(players.getShieldchoise() != null) {
                players.setMaxWeight(players.getMaxWeight() - players.getWeaponchoise().getWeight() - players.getShieldchoise().getWeight() - players.getArmourchoise().getWeight());
            }
            else
            {
                players.setMaxWeight(players.getMaxWeight() - players.getWeaponchoise().getWeight()  - players.getArmourchoise().getWeight());
            }






        }



    }
