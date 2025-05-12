package pl.training.module03;

import java.util.Arrays;

public class TicTacToe {

    private static final byte EMTPY = 0;
    private static final byte PLAYER_X = 1;
    private static final byte PLAYER_O = 2;

    private final byte[] board = new byte[9]; // kontener gdzie przechowujemy wartości pól
    private byte currentPlayer = PLAYER_X;

    public void printBoard() {
        for (int fieldIndex = 0; fieldIndex < board.length; fieldIndex++) {
            switch (board[fieldIndex]) {
                case EMTPY:
                    System.out.print("- ");
                    break;
                case PLAYER_X:
                    System.out.print("X ");
                    break;
                case PLAYER_O:
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
        if (!isOnBoard(fieldIndex) || !isFree(fieldIndex)) {
            return false;
        }
        board[fieldIndex] = currentPlayer;
        togglePlayer();
        return true;
    }

    private boolean isOnBoard(int fieldIndex) {
        return fieldIndex >= 0 && fieldIndex < board.length;
    }

    private boolean isFree(int fieldIndex) {
        return board[fieldIndex] == EMTPY;
    }

    private void togglePlayer() {
        if (currentPlayer == PLAYER_X) {
            currentPlayer = PLAYER_O;
        } else {
            currentPlayer = PLAYER_X;
        }

    }

    public void reset() {
        Arrays.fill(board, EMTPY);
        currentPlayer = PLAYER_X;
    }

}
