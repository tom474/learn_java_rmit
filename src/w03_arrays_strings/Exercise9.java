package w03_arrays_strings;

public class Exercise9 {
    public static void displayGame(char[][] board){
        for (char[] row: board){
            for (char cell: row){
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static char endGame(char[][] board){
        int BOARD_SIZE = 3;
        char [] players = {'X', 'O'};
        for (char player: players) {
            for (int row = 0; row < BOARD_SIZE; row++) {
                if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                    return player;
                }
            }
        }
        for (char player: players){
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[col][0] == player && board[col][1] == player && board[col][2] == player) {
                    return player;
                }
            }
        }

        for (char player: players){
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return player;
            }
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return player;
            }
        }

        for(int row = 0; row < BOARD_SIZE; row++) {
            for(int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] == '.') {
                    return '.';
                }
            }
        }
        return ' ';
    }
}
