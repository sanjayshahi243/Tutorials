/*
Your program must be named Battleship.java. Please read all the steps and look at the Example Output carefully before you begin. It must work as follows:

Print out the message Welcome to Battleship!
Prompt each user to enter coordinates for five ships of length one. There must be five separate prompts for each ship (use the example below as a guide). You can expect the user input will be two ints separated by a space. The first int represents the row number and the second int represents the column number.
If the user enters invalid integers, print
Invalid coordinates. Choose different coordinates.
If the user enters a coordinate that they had already entered, print
You already have a ship there. Choose different coordinates.
After each player enters their fifth coordinate, a board representing the player’s ship locations must be printed to the console using the provided method. See step three on how to construct these Locations Boards.
100 new lines must follow the printed board so that the other player will not see the entered coordinates and board of their opponent.
Create two 5x5 grids in the form of 2D arrays using the coordinates entered by the players. These Location Boards store each player's ship locations and will be used to keep track of the damage states of each player’s ships, as well as any misses. The corresponding Location Board must be printed to the console right after a player enters the coordinates of their ships.
A ‘–’ character must represent an empty space.
An ‘@’ character must represent a ship that is not hit. When the game begins, all ships will start fresh with no hits.
An ‘X’ character will represent a space with a ship that has been hit.
An ‘O’ character will represent a space that was fired upon, but since there is not ship at that location, the shot was a miss.
Each player’s board must have five ships of length one. Five of the 25 grid spaces will start with ships on them.
Additionally, you must generate two more 5x5 grids in the form of 2D arrays. These Target History Boards will allow each player to visually track their hits and misses. After each hit or miss by the player, their Target History Board must be printed to the console using the provided method.
On this board, an ‘X’ character must represent a hit by the player, an ‘O’ character must represent a miss by the player, and a ‘-’ character must represent a space that has not been attacked.
Prompt Player 1 to enter a coordinate to fire upon. You can expect the user input will be two ints separated by a space.
If the user enters invalid integers, print
Invalid coordinates. Choose different coordinates.
If the user enters a coordinate that they had already entered, print out the following
You already fired on this spot. Choose different coordinates.
If the user enters a coordinate with no ship on it, print out the following and print the updated Target History Board, where [NUM] is replaced with the attacked player’s ID.
PLAYER [NUM] MISSED!
If the user enters a coordinate with a ship on it, print out the following and print the updated Target History Board, where [NUM A] is replaced with the attacking player’s ID and [NUM B] is replaced with the attacked player’s ID.
PLAYER [NUM A] HIT PLAYER [NUM B]’s SHIP!
Player 2 will get a turn after each turn that Player 1 takes, which will function in the same way as Player 1’s turns.
When a ship is hit by a player, the Location board (which tracks the damage states) of the corresponding player’s ships must be updated. Misses should be updated on the Location board as well.
The program must terminate gracefully after a player wins. This will occur when all of the ‘@’ signs on their opponent’s board have been replaced with ‘X’ symbols.
Immediately following the move which sinks the final ship location, print the following message, where [NUM] is replaced by the winning player’s ID.:
PLAYER [NUM] WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!
Using the provided method, print both players’ Location Boards in order to verify the results of the game to the players. Player 1’s Location Board should be printed first.
In your solution, you must use each of the following Java features at least once:

A for loop (not including those used in provided code)
A do-while loop.
Note: A premade Battleship.java file will be provided for this HW. Your code MUST be written in this file. The file simply includes a method, printBattleShip(…), that MUST be used for printing 2D arrays to the console. Make sure not to alter the printBattleShip(…) method.

Note: For the autograder to run properly, you must instantiate only 1 Scanner object within the main method, outside of any loops or conditionals. To guarantee this, your very first statement of main should be of the form: Scanner <name> = new Scanner(...); and there should be no other statements of the same form in the rest of the program. If you intend to use a Scanner in a method that is not main, add an extra parameter, of type Scanner, and pass the scanner object from main to the method.
HINT: The method is used by passing in the 2D array you wish to print. For example:
printBattleShip(playerOneShotsBoard);

Example Outputs
User input is bolded. Please make sure to follow the exact formatting as shown below.

Welcome to Battleship!

PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.
Enter ship 1 location:
0 1
Enter ship 2 location:
1 3
Enter ship 3 location:
2 1
Enter ship 4 location:
3 0
Enter ship 5 location:
3 4
  0 1 2 3 4
0 - @ - - -
1 - - - @ -
2 - @ - - -
3 @ - - - @
4 - - - - -

PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.
Enter ship 1 location:
0 1
Enter ship 2 location:
0 4
Enter ship 3 location:
2 0
Enter ship 4 location:
5 10
Invalid coordinates. Choose different coordinates.
Enter ship 4 location:
3 1
Enter ship 5 location:
4 4
  0 1 2 3 4
0 - @ - - @
1 - - - - -
2 @ - - - -
3 - @ - - -
4 - - - - @

Player 1, enter hit row/column:
5 12
Invalid coordinates. Choose different coordinates.
Player 1, enter hit row/column:
3 2
PLAYER 1 MISSED!
  0 1 2 3 4
0 - - - - -
1 - - - - -
2 - - - - -
3 - - O - -
4 - - - - -

Player 2, enter hit row/column:
1 0
PLAYER 2 MISSED!
  0 1 2 3 4
0 - - - - -
1 O - - - -
2 - - - - -
3 - - - - -
4 - - - - -

Player 1, enter hit row/column:
3 2
You already fired on this spot. Choose different coordinates.
Player 1, enter hit row/column:
0 4
PLAYER 1 HIT PLAYER 2’s SHIP!
  0 1 2 3 4
0 - - - - X
1 - - - - -
2 - - - - -
3 - - O - -
4 - - - - -

Player 2, enter hit row/column:
3 3
PLAYER 2 MISSED!
  0 1 2 3 4
0 - - - - -
1 O - - - -
2 - - - - -
3 - - - O -
4 - - - - -

Player 1, enter hit row/column:
2 0
PLAYER 1 HIT PLAYER 2’s SHIP!
  0 1 2 3 4
0 - - - - X
1 - - - - -
2 X - - - -
3 - - O - -
4 - - - - -

Player 2, enter hit row/column:
3 4
PLAYER 2 HIT PLAYER 1’s SHIP!
  0 1 2 3 4
0 - - - - -
1 O - - - -
2 - - - - -
3 - - - O X
4 - - - - -

Player 1, enter hit row/column:
4 4
PLAYER 1 HIT PLAYER 2’s SHIP!
  0 1 2 3 4
0 - - - - X
1 - - - - -
2 X - - - -
3 - - O - -
4 - - - - X

Player 2, enter hit row/column:
0 2
PLAYER 2 MISSED!
  0 1 2 3 4
0 - - O - -
1 O - - - -
2 - - - - -
3 - - - O X
4 - - - - -
***Skipping to the last turn***


Player 1, enter hit row/column:
3 1
PLAYER 1 HIT PLAYER 2’s SHIP!
  0 1 2 3 4
0 - X - - X
1 - - - - -
2 X - - - -
3 - X O - -
4 - - - - X
PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!

Final boards:

  0 1 2 3 4
0 - @ O - -
1 O - - @ -
2 - @ - - -
3 @ - - O X
4 - O - - -

  0 1 2 3 4
0 - X - - X
1 - - - - -
2 X - - - -
3 - X O - -
4 - - - - X

*/

import java.util.Scanner;

public class Battleship {
	static char[][] player1Coords;
	static char[][] player2Coords;
	static char[][] player1CoordsHistory;
	static char[][] player2CoordsHistory;
	static int numberOfShips;
	static boolean gameOver = false;

	public static boolean setCoords(int coordX, int coordY, char[][] arr) {
		if (coordX >= numberOfShips || coordY >= numberOfShips) {
			System.out.println("Invalid coordinates. Choose different coordinates.");
		} else {
			if (arr[coordX][coordY] == 0) {
				arr[coordX][coordY] = '@';
				System.out.printf("Battleship positioned at %d, %d \n", coordX, coordY);
				return true;
			} else {
				System.out.println("You already have a ship there. Choose different coordinates.");
			}
		}
		return false;
	}

	void displayCoords(char[][] arr) {
		for (int i = -1; i < arr.length; i++) {
			for (int j = -1; j < arr.length; j++) {
				if (i < 0 && j < 0) {
					System.out.print("  ");
				} else if (i < 0) {
					System.out.printf(" %d ",j);
				} else if (j < 0) {
					System.out.printf("\n %d ", i);
				} else {
					System.out.print(' ');
					System.out.print(arr[i][j] == 0 ? "-" : arr[i][j]);
					System.out.print(' ');
				}
			}
			System.out.println("");
		}
		System.out.println("---------------------------------------------------");
	}

	public static boolean attackCoords (int attackingPlayer, int defendingPlayer, int coordX, int coordY, char[][] playerArr, char[][] historyArr) {
		if (coordX >= numberOfShips || coordY >= numberOfShips) {
			System.out.println("Invalid coordinates. Choose different coordinates.");
		} else {
			if (playerArr[coordX][coordY] == '@') {
				playerArr[coordX][coordY] = 'X';
				historyArr[coordX][coordY] = 'X';
				System.out.printf("\nPLAYER %d HIT PLAYER %d's SHIP! at coords (%d, %d)", attackingPlayer, defendingPlayer, coordX, coordY);
				return true;
			} else if (playerArr[coordX][coordY] == 0) {
				playerArr[coordX][coordY] = 'O';
				historyArr[coordX][coordY] = 'O';
				System.out.printf("\nPLAYER %d MISSED at coords (%d, %d)", attackingPlayer, coordX, coordY);
				return true;
			} else {
				System.out.println("You already fired on this spot. Choose different coordinates.");
			}
		}
		return false;
	}
	
	public static boolean checkGameOver (int attackingPlayer, int defendingPlayer, char[][] arr) {
		boolean gameOver = true;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[i][j] == '@') {
					gameOver = false;
				}
			}
		}
		if (gameOver) {
			System.out.printf("\nPlayer %d WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!", attackingPlayer);
		}
		return gameOver;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Player Coordinates Variables Declaration.
		numberOfShips = 5; // For The total number of ships of each user
		player1Coords = new char[numberOfShips][numberOfShips];
		player2Coords = new char[numberOfShips][numberOfShips];

		int coordX = -1;
		int coordY = -1;
		
		int fireCoordX = -1;
		int fireCoordY = -1;
		
		int playerTurn = -1;

		Battleship ins = new Battleship();	// Instance of class

		System.out.println("Welcome to Battleship!");

		// User Input Section

		System.out.println("\nPLAYER 1, ENTER YOUR SHIPS' Coordinates");
		for (int i = 0; i < numberOfShips; i++) {
			System.out.printf("Enter Position of ship %d: ", (i + 1));
			while (true) {
				boolean inputCheck = true;
				if (input.hasNextInt()) {
					coordX = input.nextInt();
				} else inputCheck = false;
				if (input.hasNextInt()) {
					coordY = input.nextInt();	
				} else inputCheck = false;

				if (!inputCheck) {
					System.out.println("Invalid coordinates. Choose different coordinates.");
					input = new Scanner(System.in);
					i--;
					break;
				} else{
					boolean inputSet = setCoords(coordX, coordY, player1Coords);
					if (!inputSet) {
						input = new Scanner(System.in);
						i--;
						break;
					}
				}
				break;
			}
		}
		ins.displayCoords(player1Coords);
		// -----------------------------------------------------------------------------------------------

		System.out.println("PLAYER 2, ENTER YOUR SHIPS' Coordinates");
		for (int i = 0; i < numberOfShips; i++) {
			System.out.printf("Enter Position of ship %d: ", (i + 1));
			while (true) {
				boolean inputCheck = true;
				if (input.hasNextInt()) {
					coordX = input.nextInt();
				} else inputCheck = false;
				if (input.hasNextInt()) {
					coordY = input.nextInt();	
				} else inputCheck = false;

				if (!inputCheck) {
					System.out.println("Invalid coordinates. Choose different coordinates.");
					input = new Scanner(System.in);
					i--;
					break;
				} else{
					boolean inputSet = setCoords(coordX, coordY, player2Coords);
					if (!inputSet) {
						input = new Scanner(System.in);
						i--;
						break;
					}
				}
				break;
			}
		}
		ins.displayCoords(player2Coords);
		// -----------------------------------------------------------------------------------------------

		// Fill history array with '-'
		player1CoordsHistory = new char[numberOfShips][numberOfShips];
		player2CoordsHistory = new char[numberOfShips][numberOfShips];
		for (int i=0; i < numberOfShips; i++) {
			for (int j=0; j<numberOfShips; j++){
				player1CoordsHistory[i][j] = '-';
				player2CoordsHistory[i][j] = '-';
			}
		}
		// ------------------------------------------------------------------------------------------------

		while (true) {
			boolean attackSuccess = false;
			System.out.println("");
			System.out.println("Attack History.");
			ins.displayCoords(player2CoordsHistory);
			while (!attackSuccess) {
				boolean inputCheck = true;
				System.out.println("Player 1 enter coordinates to fire upon: ");
				if (input.hasNextInt()) {
					fireCoordX = input.nextInt();
				} else inputCheck = false;
				if (input.hasNextInt()) {
					fireCoordY = input.nextInt();	
				} else inputCheck = false;

				if (!inputCheck) {
					System.out.println("Invalid coordinates. Choose different coordinates.");
					input = new Scanner(System.in);
				} else{
					attackSuccess = attackCoords(1, 2, fireCoordX, fireCoordY, player2Coords, player2CoordsHistory);
					if (!attackSuccess) {
						input = new Scanner(System.in);
					}
				}
			}
			
			if (checkGameOver(1, 2, player2Coords)) {
				System.out.println("\nFinal Data");
				System.out.println("Player 1");
				ins.displayCoords(player1Coords);

				System.out.println("Player 2");
				ins.displayCoords(player2Coords);
				break;
			}
			
			attackSuccess = false;
			while (!attackSuccess) {
				boolean inputCheck = true;
				System.out.println("");
				System.out.println("Attack History.");
				ins.displayCoords(player1CoordsHistory);
				System.out.println("\nPlayer 2 enter coordinates to fire upon: ");
				if (input.hasNextInt()) {
					fireCoordX = input.nextInt();
				} else inputCheck = false;
				if (input.hasNextInt()) {
					fireCoordY = input.nextInt();	
				} else inputCheck = false;

				if (!inputCheck) {
					System.out.println("Invalid coordinates. Choose different coordinates.");
					input = new Scanner(System.in);
				} else{
					attackSuccess = attackCoords(2, 1, fireCoordX, fireCoordY, player1Coords, player1CoordsHistory);
					if (!attackSuccess) {
						input = new Scanner(System.in);
					}
				}
			}
			
			if (checkGameOver(2, 1, player1Coords)) {
				System.out.println("Final Data");
				System.out.println("Player 1");
				ins.displayCoords(player1Coords);
				System.out.println("------------------------------------------------------------");
				System.out.println("Player 2");
				ins.displayCoords(player2Coords);
				break;
			}
		}
	}
}