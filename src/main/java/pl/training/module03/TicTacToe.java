package pl.training.module03;

import java.util.Arrays;

public class TicTacToe {

    enum Player {PLAYER_X, PLAYER_O, EMPTY}

/*    private static final byte EMTPY = 0;
    private static final byte PLAYER_X = 1;
    private static final byte PLAYER_O = 2;*/

    private static final int[][] winningSequences = {
            {0, 1, 2}, //top row
            {3, 4, 5}, //middle row
            {6, 7, 8}, //bottom row
            {0, 3, 6}, //left column
            {1, 4, 7}, //middle column
            {2, 5, 8}, //right column
            {0, 4, 8}, //main diagonal
            {2, 4, 6} //cross diagonal
    };

    private final Player[] board = new Player[9]; // kontener gdzie przechowujemy wartości pól
    private Player currentPlayer = Player.PLAYER_X;
    private Player winner = Player.EMPTY;
    private boolean isGameOver = false;


    public void printBoard() {
        for (int fieldIndex = 0; fieldIndex < board.length; fieldIndex++) {
            switch (board[fieldIndex]) {
                case Player.EMPTY:
                    System.out.print("- ");
                    break;
                case Player.PLAYER_X:
                    System.out.print("X ");
                    break;
                case Player.PLAYER_O:
                    System.out.print("O ");
                    break;
            }

            if ((fieldIndex + 1) % 3 == 0) { // żeby ładnie nam dzieliło po 3 wiersze korzystamy z dzielenia modulo
                System.out.println();
            }
        }
    }

    public boolean makeMove(int column, int row) {
        var fieldIndex = row * 3 + column;
        if (isGameOver || !isOnBoard(fieldIndex) || !isFree(fieldIndex)) {
            return false;
        }
        board[fieldIndex] = currentPlayer;
        if (hasPlayerWon()) {
            winner = currentPlayer;
            isGameOver = true;
        } else if (isBoardFull()) {
            isGameOver = true;
        } else {
            togglePlayer();
        }
        return true;
    }

    private boolean isOnBoard(int fieldIndex) {
        return fieldIndex >= 0 && fieldIndex < board.length;
    }

    private boolean isFree(int fieldIndex) {
        return board[fieldIndex] == Player.EMPTY;
    }

    private void togglePlayer() {
        if (currentPlayer == Player.PLAYER_X) {
            currentPlayer = Player.PLAYER_O;
        } else {
            currentPlayer = Player.PLAYER_X;
        }
    }

    private boolean isBoardFull() {
        for (Player field : board) {
            if (field == Player.EMPTY) {
                return false;
            }
        }
        return true;
    }

    private boolean hasPlayerWon() {

        for (int[] winningSequence : winningSequences) {
            if (board[winningSequence[0]] == currentPlayer
                    && board[winningSequence[1]] == currentPlayer
                    && board[winningSequence[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        Arrays.fill(board, Player.EMPTY);
        currentPlayer = Player.PLAYER_X;
        winner = Player.EMPTY;
        isGameOver = false;
    }

    public String getWinner() {
        return switch (winner) {
            case PLAYER_X -> "X wins";
            case PLAYER_O -> "O wins";
            default -> "Draw";
        };
    }

    public boolean isGameOver() {
        return isGameOver;
    }
}
