import java.util.Scanner;

class Conversion{
	
	public void convert(int number, int system){
		int[] anArray;
		anArray = new int[15];
		int i=0;
		
		while(number!=0){
			anArray[i]=(number%system);
			number=number/system;
			i++;
		}

		if(system<=10){
			for(i-=1; i>=0; i--){
				System.out.printf("%d", anArray[i]);
			}
		}
		else{
			for(i-=1; i>=0; i--){
				System.out.printf("%X", anArray[i]);
			}
		}
	}
}



public class converter{
	public static void main(String[] args){
		Conversion obj = new Conversion();

		System.out.println("Give a number you want to convert. ");
		System.out.println("It should not be greater than 30 000.");
		int number;

		Scanner entry=new Scanner(System.in);
		number=entry.nextInt();

		System.out.println("The number you have entered is " + number);

		System.out.println("Give a numeral system you want to convert your number to.");
		System.out.println("It should not be greater than 16.");
		int system;

		Scanner entry2=new Scanner(System.in);
		system=entry2.nextInt();

		System.out.println("You have chosen " + system + " numeral system.");

		obj.convert(number, system);
	}
}

