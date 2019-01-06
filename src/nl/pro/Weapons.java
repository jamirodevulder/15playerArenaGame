package nl.pro;

public class Weapons extends Items {


    private int Strength;
    private int Accuracy;


    public Weapons (int strength, int accuracy)
    {
        Strength = strength;
        Accuracy = accuracy;
    }

    public int getStrength() {
        return Strength;
    }

    public int getAccuracy() {
        return Accuracy;
    }
}
