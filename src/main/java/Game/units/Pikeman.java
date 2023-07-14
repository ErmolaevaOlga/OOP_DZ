package Game.units;

import java.util.ArrayList;

public class Pikeman extends Infantry{
    public Pikeman(String name, int x, int y, int numberTeam) {

        super(name, 30, new int[]{3,5}, 12, 7, x, y, numberTeam, 5);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
