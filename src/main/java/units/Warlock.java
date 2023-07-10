package units;

import java.util.ArrayList;

public class Warlock extends Witch{
    public Warlock(String name, int x, int y, int numberTeam) {

        super(name, 10, new int[]{-1,-5}, 2, 50, x, y, numberTeam, 6);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
