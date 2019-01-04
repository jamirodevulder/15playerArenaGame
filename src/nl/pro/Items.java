package nl.pro;

public class Items {
    private String Name;
    private int Durability;
    private int Weight;

    public void setDurability(int durability) {
        Durability = durability;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getWeight() {
        return Weight;
    }

    public String getName() {
        return Name;
    }

    public int getDurability() {
        return Durability;
    }
}
