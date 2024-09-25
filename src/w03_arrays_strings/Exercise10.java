package w03_arrays_strings;

import java.util.Scanner;

import static w03_arrays_strings.Exercise9.displayGame;
import static w03_arrays_strings.Exercise9.endGame;

public class Exercise10 {
    public static void playTicTacToe(){
        char [] players = {'X', 'O'};
        int currentPlayer = 0;
        char[][] gameBoard = {
            {'.','.','.'},
            {'.','.','.'},
            {'.','.','.'}
        };

        Scanner scanner = new Scanner(System.in);
        char finish = endGame(gameBoard);
        while (finish == '.') {
            displayGame(gameBoard);
            currentPlayer = (currentPlayer + 1) % players.length;
            System.out.println("Current player: " + players[currentPlayer]);
            System.out.print("Choose row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Choose column (0-2): ");
            int col = scanner.nextInt();
            gameBoard[row][col] = players[currentPlayer];
            finish = endGame(gameBoard);
        }
        if (finish == ' ') {
            System.out.println("It's a tie");
        } else {
            System.out.println(players[currentPlayer] + " wins!");
        }
    }

    public static void main(String[] args) {
        playTicTacToe();
    }
}
