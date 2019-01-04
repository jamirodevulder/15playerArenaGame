package nl.pro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Players[] players = new Players[startGame()];






    }







    private static int startGame()
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("met hoeveel spelers wil je spelen?");
            int amountOfPlayers = sc.nextInt();


            if (amountOfPlayers != 0 && amountOfPlayers <= 15) {

                return amountOfPlayers;
            } else {
                System.out.println("je kunt alleen 2 tot 15 spelers kiezen");
            }


        }
    }

}
