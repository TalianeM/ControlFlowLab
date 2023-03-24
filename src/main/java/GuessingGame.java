import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
//        need a secret number
//        user needs to guess it - take in put?
//        if too high or low, let them know
//        if guessed correctly, let them know
        Integer secretNumber = 9;
        System.out.println("Guess my favourite number");
        Scanner scanner = new Scanner(System.in); // scanner needed to create user input

        String guess = scanner.nextLine(); // Asking for some input (better off getting scanner.int - This time add string
        System.out.println("your guess was:" + guess);

        if (guess.equals(String.valueOf(secretNumber)));{
            System.out.println("Nice, that is my favourite!");
        } else if(secretNumber <Integer.getInteger(guess)){
            System.out.println("Too low, guess again!");
        } else if (secretNumber > Integer.getInteger(guess)){
            System.out.println("Too low, guess again!");
        }
    }
}
