import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        do {
            playGame(sc, random);
            System.out.println("Do you want to play again? (y/n)");
        } while (sc.next().equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! Goodbye.");
    }

    private static void playGame(Scanner sc, Random random) {
        int n = random.nextInt(100) + 1;
        int i = 0;
        int k = 5;
        int guess;
        
        System.out.println("Choose a number between 1 and 100.");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            i++;
            if (guess < n) {
                System.out.println("The number is greater than "+ guess);
            } 
            else if (guess > n) {
                System.out.println("The number is lower than "+ guess);
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                return;
            }
        } while (i < k);
        System.out.println("Sorry, you've run out of attempts. The correct number was: " + n);
    }
}
