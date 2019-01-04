package nl.pro;

public class Weapons {

    private String Name;
    private int Strength;
    private int Durability;
    private int Accuracy;
    private int Weight;


    public Weapons (String name, int strength, int durability, int accuracy, int weight)
    {
        Name = name;
        Strength = strength;
        Durability = durability;
        Accuracy = accuracy;
        Weight = weight;
    }

    public String getName() {
        return Name;
    }

    public int getStrength() {
        return Strength;
    }

    public int getWeight() {
        return Weight;
    }
}
