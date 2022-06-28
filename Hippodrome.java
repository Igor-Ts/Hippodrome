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
        game.run();
    }
    public void move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }
    public void run() {
        for (int i = 1; i < 101; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getClass());
            }
        }

    }
}
