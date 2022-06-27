import java.util.ArrayList;

public class Hippodrome {
    ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        Hippodrome hippodrome = new Hippodrome();
        game = hippodrome;
        Horse Appalon = new Horse("Appalon",3,0);
        Horse Victory = new Horse("Victory",3,0);
        Horse Gambit = new Horse("Gambit",3,0);
        hippodrome.getHorses().add(Appalon);
        hippodrome.getHorses().add(Victory);
        hippodrome.getHorses().add(Gambit);
    }
}
