
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        String guessingCommand = "Guess my secret number!";
        {
            int secretNumber = 17;
            System.out.println(guessingCommand);
            Scanner reader = new Scanner(System.in);
            int guess = reader.nextInt();
            System.out.println("Your guess is " + guess);

            if (guess < secretNumber) {
                System.out.println("Too low");
            } else if (guess > secretNumber) {
                System.out.println("Too high");

            } else if (guess == secretNumber) {
                System.out.println("You got it right!");
            }
        }
    }
}




