package beginner;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number,inputNumber,noOfGuesses=0;

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100);
    }
    void takeUserInput() {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes, you guessed it right in %d attempts.It was %d", noOfGuesses, number);
            return true;
        } else if (inputNumber > number) {
            System.out.println("Too High...");
        } else {
            System.out.println("Too Low...");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b=g.isCorrectNumber();
        }
    }
}
