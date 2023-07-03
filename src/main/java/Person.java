public abstract class Person {
    public String name; // название
    public int hp; // здоровье
    public int damage; // урон
       public int step; //порядок хода

    public Person(String name, int hp, int damage, int step) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.step = step;
    }
}
