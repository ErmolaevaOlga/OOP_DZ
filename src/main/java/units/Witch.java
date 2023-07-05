package units;

public abstract class Witch extends Person {
    int mana;

    public Witch(String name, float hp, int[] damage, int attack, int mana) {
        super(name, hp, damage, attack);
        this.mana = mana;
    }
}
