package pl.training.module03;

public class Game {

    public static void main(String[] args) {
//        TicTacToe ticTacToe = new TicTacToe();
        var ticTacToe = new TicTacToe();
        ticTacToe.makeMove(0, 0);
        ticTacToe.makeMove(0, 1);
        ticTacToe.printBoard();
    }
}
