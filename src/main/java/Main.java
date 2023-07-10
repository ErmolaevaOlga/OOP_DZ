import units.*;

import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> team1 = newTeam(1, 1);
        ArrayList<Person> team2 = newTeam(10,2);

        ArrayList<Person> teamAll = new ArrayList<>();
        teamAll.addAll(team1);
        teamAll.addAll(team2);
        teamAll.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.initiative- o2.initiative;
            }
        });

        printInfo(team1);
        printInfo(team2);
        System.out.println("_".repeat(20));


        for (Person p:teamAll) {

            if(team1.contains(p)) {
                p.step(team2,team1);
            }
            else {
                p.step(team1,team2);
            }

        }

        printInfo(team1);
        printInfo(team2);


    }

    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

        private static ArrayList<Person> newTeam(int k, int numberTeam) {

            ArrayList<Person> team = new ArrayList<Person>(10);
            Random rand = new Random();
            for (int i = 1; i < 11; i++) {

                int var = rand.nextInt(0, 9);
                switch (var) {
                    case 1:
                        team.add(new Crossbowman(getName(),k,i,numberTeam));
                        break;
                    case 2:
                        team.add(new Sniper(getName(),k,i,numberTeam));
                        break;
                    case 3:
                        team.add(new Scout(getName(),k,i,numberTeam));
                        break;
                    case 4:
                        team.add(new Spearman(getName(),k,i,numberTeam));
                        break;
                    case 5:
                        team.add(new Swordsman(getName(),k,i,numberTeam));
                        break;
                    case 6:
                        team.add(new Warlock(getName(),k,i,numberTeam));
                        break;
                    case 7:
                        team.add(new Witchdoctor(getName(),k,i,numberTeam));
                        break;

                    default:
                        team.add(new Farmer(getName(),k,i,numberTeam));
                        break;
                }
            }
            return team;
        }

        private static void printInfo(ArrayList<Person> team){
            for (int i = 0; i < team.size(); i++) {

                System.out.println(team.get(i).getInfo());
            }
            System.out.println("=============================================");
        }



    }


