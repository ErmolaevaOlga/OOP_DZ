public abstract class Infantry extends Person {
    int armor; // броня

    public Infantry(String name, int hp, int damage, int step, int armor) {
        super(name, hp, damage, step);
        this.armor = armor;
    }
}
