import java.util.Scanner;

// Enum type to represent the value in each cell of the board
enum CellValue {
    X, O, EMPTY
}

// TicTacToe class definition
public class TicTacToe {
    // Private 3-by-3 two-dimensional array to represent the board
    private CellValue[][] board;
    private boolean xTurn; // To keep track of whose turn it is

    // Constructor to initialize the board elements to EMPTY
    public TicTacToe() {
        board = new CellValue[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = CellValue.EMPTY;
            }
        }
        xTurn = true; // X starts the game
    }

    // Method to display the current state of the board
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X:
                        System.out.print("X ");
                        break;
                    case O:
                        System.out.print("O ");
                        break;
                    default:
                        System.out.print(". ");
                        break;
                }
            }
            System.out.println();
        }
    }

    // Method to make a move
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != CellValue.EMPTY) {
            return false; // Invalid move
        }
        board[row][col] = xTurn ? CellValue.X : CellValue.O;
        xTurn = !xTurn; // Switch turn
        return true;
    }

    // Method to check if there's a winner
    public boolean checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != CellValue.EMPTY) ||
                (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != CellValue.EMPTY)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != CellValue.EMPTY) ||
            (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != CellValue.EMPTY)) {
            return true;
        }
        return false;
    }

    // Method to check if the game is a draw
    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == CellValue.EMPTY) {
                    return false; // There are still empty cells
                }
            }
        }
        return !checkWinner(); // No empty cells and no winner means draw
    }

    // Main method to test the TicTacToe class
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);
        int row, col;
        while (true) {
            game.printBoard();
            System.out.println("Enter row and column (0, 1, or 2): ");
            row = input.nextInt();
            col = input.nextInt();
            if (!game.makeMove(row, col)) {
                System.out.println("Invalid move, try again.");
                continue;
            }
            if (game.checkWinner()) {
                game.printBoard();
                System.out.println((game.xTurn ? "O" : "X") + " wins!");
                break;
            }
            if (game.checkDraw()) {
                game.printBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
        input.close();
    }
}
