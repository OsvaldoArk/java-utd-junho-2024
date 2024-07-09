import java.util.Random;
import java.util.Scanner;

public class NicolasFreitas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // INSTRUCTIONS
        System.out.println("");
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You'll have 10 trys to guess what's the secret number between 1 and 100.");
        System.out.println("Good Luck!");
        System.out.println("");

        // GENERATE A RANDOM NUMBER BETWEEN 1 AND 100 USING THE CLASS RANDOM
        int randomNumber = random.nextInt(100) + 1;

        for (int attempts = 10; attempts >= 0; attempts--) {
            if (attempts == 0) {
                System.out.println("Game Over! You're out of attempts.");

                break;
            }

            System.out.println("Enter your guess:");
            int secretNumber = scan.nextInt();

            if (secretNumber == randomNumber) {
                System.out.println("Congratulations! You've won the game.");
                System.out.println("The secret number were: " + randomNumber);

                break;
            } else {
                System.out.println("");
                System.out.println("Nice try! But your guess was wrong.");
                System.out.println(secretNumber > randomNumber ? "Try a lower number." : "Try a higher number.");
                System.out.printf("You've spent one try. But you still have %d%n attempts", attempts - 1);
                System.out.println("");
            }
        }

        scan.close();
    }
}