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
        Horse appalon = new Horse("Appalon",3,0);
        Horse victory = new Horse("Victory",3,0);
        Horse gambit = new Horse("Gambit",3,0);
        hippodrome.getHorses().add(appalon);
        hippodrome.getHorses().add(victory);
        hippodrome.getHorses().add(gambit);
        game.run();
        hippodrome.printWinner();
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

    public Horse getWinner () {
        Horse winnerHorse = new Horse("winner",0,0);
        for (Horse horse: horses) {
            if (horse.distance > winnerHorse.distance) {
                winnerHorse = horse;
            }
        }
        return winnerHorse;
    }

    public void printWinner () {
        System.out.println("Winner is " + getWinner().name + "!");
    }
}
