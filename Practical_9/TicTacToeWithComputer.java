import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3]; 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }

        boolean playerTurn = true;
        boolean gameOver = false;

        while (!gameOver) {
            displayBoard(board);

            if (playerTurn) {
                System.out.println("Player's turn");
                int row, col;

                while (true) {
                    System.out.print("Enter a row (0,1 or 2): ");
                    row = input.nextInt();
                    System.out.print("Enter a column (0,1 or 2): ");
                    col = input.nextInt();

                    if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                        board[row][col] = 'X'; 
                        break;
                    } else {
                        System.out.println("Invalid move. Try again!");
                    }
                }

                if (checkWin(board, 'X')) {
                    displayBoard(board);
                    System.out.println("Game ended, Player Win");
                    gameOver = true;
                } else if (isDraw(board)) {
                    displayBoard(board);
                    System.out.println("Game ended, It's a Draw");
                    gameOver = true;
                }

            } else {
                System.out.println("Computer's turn");

                int row, col;
                do {
                    row = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);
                } while (board[row][col] != ' ');

                board[row][col] = 'O'; 

                if (checkWin(board, 'O')) {
                    displayBoard(board);
                    System.out.println("Game ended, Computer Win");
                    gameOver = true;
                } else if (isDraw(board)) {
                    displayBoard(board);
                    System.out.println("Game ended, It's a Draw");
                    gameOver = true;
                }
            }

            playerTurn = !playerTurn; 
        }
    }

    public static void displayBoard(char[][] board) {
        for (int row = 0; row < 3; row++) {
            System.out.printf(" %c | %c | %c%n", board[row][0], board[row][1], board[row][2]);
            if (row < 2) {
                System.out.println("---------");
            }
        }
    }

    public static boolean checkWin(char[][] board, char symbol) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == symbol && board[1][col] == symbol && board[2][col] == symbol) {
                return true;
            }
        }

        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    public static boolean isDraw(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
