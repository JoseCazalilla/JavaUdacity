import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Hangman game = new Hangman();
        game.setTitleToGuess("movies.txt");
        game.cheatABit();
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Please, add your letter: ");
            String guess = userInput.nextLine();
            game.newLetter(guess);
            game.printCurrentGuess();
        }
    }
}
