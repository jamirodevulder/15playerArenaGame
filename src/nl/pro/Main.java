package nl.pro;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // hier word bepaald hoeveel spelers der mee mogen doen
        Players[] players = new Players[StartingGame.startGame()];
        // hier word het arsenal geselecteerd
        players = StartingGame.createplayers(players, Game.setWeapons(), Game.setShields(), Game.setArmour());
        // hier word bepaald wie als eerst mag beginnen met aanvallen door middel van zijn gewicht.
        players = Game.order(players);


        // laat zien wie als eerst mag begginnen
        /*
        for (int i = 0; i < players.length; i++) {
          System.out.println("naam: " + players[i].getName() +  " : " + players[i].getMaxWeight());
        }
        */






    }




}
