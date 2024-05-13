import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) {
        // generate a random number between 1 and 100
        int answer = (int)(Math.random() * 100) + 1;
        // number of trials that the user has to guess the number
        int k = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------- Welcome to Guessing Game ------------");
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have " + k + " tries to guess the number.");
        while (k > 0) {
            
            System.out.println("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == answer) {
                System.out.println("Yeahhh!! \n20Congratulations! You guessed the right answer: " + answer);
                break;
            } else if (guess > answer) {
                System.out.println("Your guess is too high.");
                k--;
                System.out.println("You have " + k + " chance(s) left. Try again.");
            } else if (guess < answer) {
                System.out.println("Your guess is too low.");
                k--;
                System.out.println("You have " + k + " chance(s) left. Try again.");
            }

            if (k == 0) {
                System.out.println("You have exceeded the maximum attempts. Better Luck Next Time!");
            }
            else
                System.out.println("Enter the valid input");
        }
    }
}
