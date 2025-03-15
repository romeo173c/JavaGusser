//NumberGuess.java

import java.util.*;


public class NumberGuess{
	public static void main(String[] args){
		NumberGuess numGuess = new NumberGuess();
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;
		

		while(keepGoing){

			System.out.println("Exit: 0");
			System.out.println("Human Guesser: 1");
			System.out.println("computer Guesser: 2");

			int choice = scan.nextInt();

			switch (choice){
				case 0:
					System.out.println("Have a great Day");
					return;
				case 1:
					numGuess.humanGuesser();
					break;
				case 2:
					numGuess.computerGuesser();
					break;
				default:
					System.out.println("Please Choose from 0-2");

			}
		}
	}

private void humanGuesser(){
	int ranNum = (int) (Math.random() * 100);
	int tries = 0;
	int guess = 0;
	Scanner scan = new Scanner(System.in);

System.out.println("Human Guesser");
while (guess != ranNum && tries < 7) {
	tries++;
	System.out.println(tries + "Enter a Number: ");
	guess = scan.nextInt();
	scan.nextLine();
	
	if (guess < ranNum) {
		System.out.println("The number you choose is too low");
	} else if (guess > ranNum){
		System.out.println("The number you choose is too high");
	} else {
		System.out.println("The number you guessed is correct");
	}
}
}

private void computerGuesser(){
	int lowNum = 1;
	int highNum = 100;
	int guess = 0;
	int tries = 0;
	Scanner scan = new Scanner(System.in);
	String answer = "";

	System.out.println("I am the Computer Genie, the Genie that can guess any number your are thinking.");
	System.out.println("Please choose a number between 1-100.");
	System.out.println("If the number is too high respond with H, if the number is too low please respond with L, if the number is correct please respond with C");

	while (!answer.equalsIgnoreCase("C")){
		tries++;
		guess = (lowNum + highNum) / 2;
		System.out.println(answer + "I think the...." +   guess   + "....Number is Too High (H), Number is Too Low(L), Number is Correct (C)");
		answer = scan.nextLine().trim().toUpperCase();

		if (answer.equalsIgnoreCase("H")){
			highNum = guess;
		} else if (answer.equalsIgnoreCase("L")){
			lowNum = guess;
		} else if (!answer.equalsIgnoreCase("C")){
			System.out.println("Please choose a valid response");
			System.out.printf("I was able to guess your number in %d\n",tries);
	}

	}

}
}
