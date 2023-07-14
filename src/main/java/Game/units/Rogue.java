package Game.units;

import java.util.ArrayList;

public class Rogue extends Infantry{
    public Rogue(String name, int x, int y, int numberTeam) {

        super(name, 25, new int[]{2,4}, 5, 2, x, y, numberTeam, 7);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
