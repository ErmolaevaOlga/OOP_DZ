package units;
import java.util.ArrayList;

public abstract class Person implements PersonInterface{
    protected float hp; // Здоровье
    protected float curHp; // Здоровье сейчас
    protected String name;

    protected int[] damage; //Урон
    protected int attack; //Сила удара


    public Person(String name, float hp,  int[] damage, int attack) {
        this.hp = hp;
        this.name = name;
        this.damage = damage;
        this.attack = attack;
    }


    @Override
    public String getInfo(){
        return "Персонаж:" + getClass().getName() +" Имя: "+name+" Здоровье: " + hp + " сила удара: " + attack;
    }
}
