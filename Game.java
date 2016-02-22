import java.util.Scanner;
import java.util.Random;

class Guessing{
	public void checking(int drawnNumber){
		int attempt=1;
		int enteredNumber;
		
		Scanner entry=new Scanner(System.in);
		enteredNumber=entry.nextInt();

		while(drawnNumber!=enteredNumber){
			System.out.println("No!");
			attempt++;

			Scanner entry2=new Scanner(System.in);
			enteredNumber=entry2.nextInt();
		}
	
		System.out.println("Congratulations! My number is " + drawnNumber + ". You needed " + attempt + " attempts to guess.");
	}
	
}

public class Game{
	public static void main(String[] args){
		System.out.println("Gueass which number I have in mind (from 0 to 10). Enter the numbers untill you guesss.");
		
		Random r = new Random(); 
		int drawnNumber = r.nextInt(10)+1;

		Guessing obj = new Guessing();

		obj.checking(drawnNumber);
	}
}