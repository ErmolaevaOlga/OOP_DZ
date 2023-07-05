package units;

public abstract class Shooter extends Person {
    int range; // дальность выстрела
    int capacity; // количество выстрелов до перезарядки

    public Shooter(String name, float hp, int[] damage, int attack, int range, int capacity) {
        super(name, hp, damage, attack);
        this.range = range;
        this.capacity = capacity;
    }
}
