package nl.pro;

public class Players{
private String Name;
private int Healt;
private int Attack;
private int Defence;
private int MaxWeight;
private String Weaponchoise;


    public Players (String name, int healt, int attack, int defence, int maxWeight)
    {

        Name = name;
        Healt = healt;
        Attack = attack;
        Defence = defence;
        MaxWeight = maxWeight;

    }

    public String getName() {
        return Name;
    }

    public int getHealt() {
        return Healt;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefence() {
        return Defence;
    }

    public int getMaxWeight() {
        return MaxWeight;
    }
    public void setWeaponchoise(String weaponchoise)
    {
        Weaponchoise = weaponchoise;
    }

    public String getWeaponchoise() {
        return Weaponchoise;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }
}
