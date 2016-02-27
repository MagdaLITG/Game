import java.util.Random;
import java.util.Scanner;

public class MyGame {
	
	public static void DisplayMessage(String text) {
        System.out.println(text);
    }
    
	public static int GetNumberFromUser() {
        Scanner entry=new Scanner(System.in);
        return entry.nextInt();
    }   
	
	public static int DrawNumber() {
		int drawnNumber;
		Random r = new Random();
		drawnNumber = r.nextInt(10)+1;
		return drawnNumber;
		}
	
	public static void main(String[] args){
		String textToDisplay = "Guess which number I have in mind (from 0 to 10). Enter the numbers untill you guesss.";
		DisplayMessage(textToDisplay);
		
		int enteredNumber = GetNumberFromUser();
		int winningNumber = DrawNumber();;
		int attemptsOfAnswers;
		
		Game obj = new Game(winningNumber, enteredNumber);
		attemptsOfAnswers = obj.Play();
		
		System.out.printf("Congratulations! My number is %d. You needed %d attempts to guess.", winningNumber, attemptsOfAnswers);
	}
}

