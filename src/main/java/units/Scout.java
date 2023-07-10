package units;

import java.util.ArrayList;

public class Scout extends Infantry{
    public Scout(String name, int x, int y, int numberTeam) {

        super(name, 15, new int[]{-2,-3}, 5, 2, x, y, numberTeam, 6);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
