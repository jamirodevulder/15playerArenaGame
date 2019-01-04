package nl.pro;

public class Armour extends Items{
private int Defence;

    public Armour(int defence)
    {
        Defence = defence;
    }

    public void setDefence(int defence) {
        Defence = defence;
    }

    public int getDefence() {
        return Defence;
    }
}
