import java.util.Scanner;

public class Game {
	private int numberToGuess = 0;
	private int enteredNumber = 0; 
    private int attempts = 0;
 
    public Game(int drawnNumber, int enteredNumber) {
        numberToGuess = drawnNumber;
        this.enteredNumber = enteredNumber;
    }
 
    public int Play() {
        attempts++;
 
        while(numberToGuess != enteredNumber) {
            System.out.println("No!");
            attempts++;
            Scanner entry = new Scanner(System.in);
            enteredNumber = entry.nextInt();
        }
  
        return attempts;
    }
}
