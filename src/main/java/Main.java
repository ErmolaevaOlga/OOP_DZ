public class Main {
    public static void main(String[] args) {
        Person farmer = new Farmer("farmer", 100, 0, 5);
        Person crossbowman = new Crossbowman("Crossbowman", 100, 0, 5, 10, 50);
        Person sniper = new Sniper("Sniper", 100, 0, 5, 15, 30);
        Person scout = new Scout("Scout", 100, 0, 5, 15);
        Person spearman = new Spearman("Spearman", 100, 0, 5, 5);
        Person swordsman = new Swordsman("Swordsman", 100, 0, 5, 25);
        Person warlock = new Warlock("Warlock", 100, 0, 5, 100);
        Person witchdoctor = new Witchdoctor("Witchdoctor", 100, 0, 5, 100);

    }
}
