package nl.pro;

public class Game{

    public static Weapons[] setWeapons()
    {
        Weapons[] weapons = {

                new Weapons("bijl", 8, 80, 80, 20),
                new Weapons("longsword", 10, 70, 100, 60),
                new Weapons("daggers", 4, 100, 100, 20),
                new Weapons("speer", 6, 90, 90, 40),
        };
        return weapons;
    }


}
