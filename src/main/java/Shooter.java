public abstract class Shooter extends Person {
    int range; // дальность выстрела
    int capacity; // количество выстрелов до перезарядки

    public Shooter(String name, int hp, int damage, int step, int range, int capacity) {
        super(name, hp, damage, step);
        this.range = range;
        this.capacity = capacity;
    }
}
