package units;

import java.util.ArrayList;

public class Spearman extends Infantry{
    public Spearman(String name, int x, int y, int numberTeam) {

        super(name, 30, new int[]{-3,-5}, 5, 10, x, y, numberTeam, 1);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
