package segment;

import java.util.ArrayList;

public class SevenSegment {
        private String[][] board;

        public SevenSegment() {
            board = new String[][] {
                    {" ", " ", " ", " "},
                    {" ", " ", " ", " "},
                    {" ", " ", " ", " "},
                    {" ", " ", " ", " "},
                    {" ", " ", " ", " "}
            };
        }

        public String[][] drawOne() {
            for (int row = 0; row < board.length; row++) {
                if (row == 2) continue;
                board[row][3] = "#";
            }
            return board;
        }

        public String[][] drawTwo() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
                board[2][col] = "#";
                board[4][col] = "#";
            }
            board[1][3] = "#";
            board[3][0] = "#";
            return board;
        }

        public String[][] drawThree() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
                board[2][col] = "#";
                board[4][col] = "#";
            }
            board[1][3] = "#";
            board[3][3] = "#";
            return board;
        }

        public String[][] drawFour() {
            board[0][0] = "#";
            board[0][3] = "#";
            board[1][0] = "#";
            board[1][3] = "#";
            for (int col = 0; col < board[0].length; col++) {
                board[2][col] = "#";
            }
            board[3][3] = "#";
            board[4][3] = "#";
            return board;
        }

        public String[][] drawFive() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
                board[2][col] = "#";
                board[4][col] = "#";
            }
            board[1][0] = "#";
            board[3][3] = "#";
            return board;
        }

        public String[][] drawSix() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
                board[2][col] = "#";
                board[4][col] = "#";
            }
            board[1][0] = "#";
            board[3][0] = "#";
            board[3][3] = "#";
            return board;
        }

        public String[][] drawSeven() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
            }
            for (int row = 1; row < 5; row++) {
                board[row][3] = "#";
            }
            return board;
        }

        public String[][] drawEight() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
                board[2][col] = "#";
                board[4][col] = "#";
            }
            board[1][0] = "#";
            board[1][3] = "#";
            board[3][0] = "#";
            board[3][3] = "#";
            return board;
        }

        public String[][] drawNine() {
            for (int col = 0; col < board[0].length; col++) {
                board[0][col] = "#";
                board[2][col] = "#";
                board[4][col] = "#";
            }
            board[1][0] = "#";
            board[1][3] = "#";
            board[3][3] = "#";
            return board;
        }
    }

