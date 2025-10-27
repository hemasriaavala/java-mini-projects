// RockPaperScissors.java
import java.util.*;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();

        System.out.print("Enter your choice (rock/paper/scissors): ");
        String user = sc.nextLine().toLowerCase();
        String comp = choices[rand.nextInt(3)];

        System.out.println("Computer chose: " + comp);

        if (user.equals(comp))
            System.out.println("It's a tie!");
        else if ((user.equals("rock") && comp.equals("scissors")) ||
                 (user.equals("paper") && comp.equals("rock")) ||
                 (user.equals("scissors") && comp.equals("paper")))
            System.out.println("🎉 You win!");
        else
            System.out.println("😢 You lose!");
    }
}
