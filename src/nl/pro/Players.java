package nl.pro;

public class Players{
private String Name;
private int Healt;
private int Attack;
private int Defence;
private int MaxWeight;
private Shields Shieldchoise;
private Armour Armourchoise;
private Weapons Weaponschoise;
private int WeaponDurability;
private int ShieldDurability;
private int ArmourDurability;


    public Players (String name, int healt, int attack, int defence, int maxWeight)
    {

        Name = name;
        Healt = healt;
        Attack = attack;
        Defence = defence;
        MaxWeight = maxWeight;

    }

    public void setMaxWeight(int maxWeight) {
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

    public void setDefence(int defence) {
        Defence = defence;
    }


    public int getMaxWeight() {
        return MaxWeight;
    }
    public void setWeaponchoise(Weapons weaponchoise)
    {
        Weaponschoise = weaponchoise;
    }

    public Weapons getWeaponchoise() {
        return Weaponschoise;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public void setShieldchoise(Shields shieldchoise) {
        Shieldchoise = shieldchoise;
    }

    public Shields getShieldchoise() {
        return Shieldchoise;
    }

    public Armour getArmourchoise() {
        return Armourchoise;
    }

    public void setArmourchoise(Armour armourchoise) {
        Armourchoise = armourchoise;
    }


    public void setArmourDurability(int armourDurability) {
        ArmourDurability = armourDurability;
    }

    public int getArmourDurability() {
        return ArmourDurability;
    }

    public void setWeaponDurability(int weaponDurability) {
        WeaponDurability = weaponDurability;
    }

    public int getWeaponDurability() {
        return WeaponDurability;
    }

    public int getShieldDurability() {
        return ShieldDurability;
    }

    public void setShieldDurability(int shieldDurability) {
        ShieldDurability = shieldDurability;
    }
}
