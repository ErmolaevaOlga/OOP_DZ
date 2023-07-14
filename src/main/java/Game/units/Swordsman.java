package Game.units;

import java.util.ArrayList;

public class Swordsman extends Infantry{
    public Swordsman(String name, int x, int y, int numberTeam) {

        super(name, 30, new int[]{3,5}, 5, 10, x, y, numberTeam, 5);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
