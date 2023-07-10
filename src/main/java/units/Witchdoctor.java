package units;

import java.util.ArrayList;

public class Witchdoctor extends Witch{
    public Witchdoctor(String name, int x, int y, int numberTeam)
    {
        super(name, 10, new int[]{-1,-5}, 2, 100, x, y, numberTeam, 5);
    }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
