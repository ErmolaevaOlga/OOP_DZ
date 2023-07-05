package units;

public abstract class Infantry extends Person {
    int armor; // броня

    public Infantry(String name, float hp, int[] damage, int attack, int armor) {
        super(name, hp, damage, attack);
        this.armor = armor;
    }
}
