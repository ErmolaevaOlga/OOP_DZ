public abstract class Witch extends Person {
    int mana;

    public Witch(String name, int hp, int damage, int step, int mana) {
        super(name, hp, damage, step);
        this.mana = mana;
    }
}
