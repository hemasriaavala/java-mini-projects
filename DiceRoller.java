// DiceRoller.java
import java.util.Random;

class DiceRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        System.out.println("🎲 You rolled: " + roll);
    }
}
