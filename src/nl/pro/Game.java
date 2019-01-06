package nl.pro;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

public class Game {

    public static Weapons[] setWeapons()
    {
        Weapons[] weapons = {

              new Weapons( 8, 60),
                new Weapons(10, 70),
                new Weapons( 4, 100),
                new Weapons( 6,  90)
        };
        weapons[0].setName("bijl");
        weapons[0].setDurability(80);
        weapons[0].setWeight(20);

        weapons[1].setName("longsword");
        weapons[1].setDurability(100);
        weapons[1].setWeight(60);

        weapons[2].setName("dagger");
        weapons[2].setDurability(100);
        weapons[2].setWeight(20);

        weapons[3].setName("speer");
        weapons[3].setDurability(90);
        weapons[3].setWeight(40);

        return weapons;
    }

    public static Shields[] setShields()
    {
        Shields[] shields =
        {
                new Shields(10),
                new Shields(20),
                new Shields(30)
        };
        shields[0].setName("kleinschild");
        shields[0].setDurability(90);
        shields[0].setWeight(10);


        shields[1].setName("middelschild");
        shields[1].setDurability(80);
        shields[1].setWeight(20);

        shields[2].setName("grootschild");
        shields[2].setDurability(70);
        shields[2].setWeight(30);


        return shields;
   }

   public static Armour[] setArmour()
   {
       Armour[] armours =
               {
                       new Armour(40),
                       new Armour(30),
                       new Armour(20),
                       new Armour(10),
               };

       armours[0].setName("diamandpanzer");
       armours[0].setDurability(50);
       armours[0].setWeight(50);

       armours[1].setName("goudenpanzer");
       armours[1].setDurability(40);
       armours[1].setWeight(40);

       armours[2].setName("ijzerpanser");
       armours[2].setDurability(30);
       armours[2].setWeight(30);

       armours[3].setName("lerepanzer");
       armours[3].setDurability(20);
       armours[3].setWeight(20);
       return armours;
   }

// hier worden de players op snelheid gesorteerd (wie als eerst mag gaan aanvallen)
    public static Players[] order(Players[] players)
    {
        Integer[] counts = new Integer[players.length];
        Players[] set = new Players[players.length];
        int counter = 0;

        Boolean check;
        for (int i = 0; i < players.length; i++)
        {
            counts[i] = players[i].getMaxWeight();
        }
        Arrays.sort(counts, Collections.reverseOrder());
        for (int i = 0; i < players.length; i++)
        {
            check = true;
            for (int j = counter; j < players.length; j++)
            {
                if(counts[i] == players[j].getMaxWeight() && check)
                {
                    // player 0 = 10 dus set j
                    set[j] = players[i];
                    players[i] = players[j];
                    players[j] = set[j];
                    check = false;
                    counter += 1;
                }
            }

        }
        return players;
    }

}
