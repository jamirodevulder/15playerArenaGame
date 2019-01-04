package nl.pro;


public class Main {
    public static void main(String[] args) {

        Players[] players = new Players[StartingGame.startGame()];
        players = StartingGame.createplayers(players);



    }
}
