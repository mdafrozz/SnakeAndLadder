package snake_ladder;

public class SnakeAndLadder {
	
	public static final int START_POSITION = 0;// UC1 - Start position 0
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;
	public static final int NO_PLAY = 0;
	
	public static int currentPosition = 0;

	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		System.out.println("Player start Position is: "+START_POSITION);
		
		int diceNumber = (int) ((Math.random() * 10 % 6) + 1);// UC2 - Player rolls the dice
		System.out.println("Dice Number : " +diceNumber);
		
		int option = (int) ((Math.random() * 10 % 3) + 1); // UC3 - Player check options
		if (option == IS_SNAKE) {
			currentPosition -= diceNumber;
			System.out.println("Snake bites....");
		} else if (option == IS_LADDER) {
			currentPosition += diceNumber;
			
		} else if (option == NO_PLAY) {
			System.out.println("NO Play");
		}

		if (currentPosition < START_POSITION) { // UC4 - Player restarts from 0
			currentPosition = START_POSITION;
		} else if (currentPosition > 100) {
			currentPosition -= diceNumber;
		}
		System.out.println("Player moves position: " + currentPosition);
	}
}
