import units.*;

import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> team1 = newTeam(1);
        ArrayList<Person> team2 = newTeam(10);

        printInfo(team1);
        printInfo(team2);

      }

    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

        private static ArrayList<Person> newTeam(int k) {

            ArrayList<Person> team = new ArrayList<Person>(10);
            Random rand = new Random();
            for (int i = 1; i < 11; i++) {

                int var = rand.nextInt(0, 9);
                switch (var) {
                    case 1:
                        team.add(new Crossbowman(getName()));
                        break;
                    case 2:
                        team.add(new Sniper(getName()));
                        break;
                    case 3:
                        team.add(new Scout(getName()));
                        break;
                    case 4:
                        team.add(new Spearman(getName()));
                        break;
                    case 5:
                        team.add(new Swordsman(getName()));
                        break;
                    case 6:
                        team.add(new Warlock(getName()));
                        break;
                    case 7:
                        team.add(new Witchdoctor(getName()));
                        break;

                    default:
                        team.add(new Farmer(getName()));
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


