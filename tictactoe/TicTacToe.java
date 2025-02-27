package tictactoe;

import static tictactoe.Constants.EMPTY;

public class TicTacToe {
    private int player1;
    private int player2;
    private char[][] board;

    public TicTacToe() {
        Constants board = EMPTY;
        player1 = 0;
        player2 = 0;
    }

    public int getPlayer1() {
        return player1;
    }
    public void setPlayer1(char player1) {
        this.player1 = player1;
    }
    public int getPlayer2() {
        return player2;
    }
    public void setPlayer2(char player2) {
        this.player2 = player2;
    }
}
