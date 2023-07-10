package units;

import java.util.ArrayList;

public class Farmer extends Person {

        public Farmer(String name, int x, int y, int numberTeam){

            super( name,20,  new int[]{-1,-3},5, x, y, numberTeam, 7 );
        }


    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
