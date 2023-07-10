package units;

public abstract class Infantry extends Person {
    int armor; // броня

    public Infantry(String name,float hp, int[] damage, int attack, int armor, int x, int y, int numberTeam, int initiative) {
        super(name, hp,  damage, attack, x, y, numberTeam, initiative);
        this.armor = armor;
    }
}
