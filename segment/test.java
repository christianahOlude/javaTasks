package segment;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test {
        private SevenSegment sevenSegment;

        @BeforeEach
        void setUp() {
            sevenSegment = new SevenSegment();
        }

        @Test
        void testDrawOne() {
            String[][] board = sevenSegment.drawOne();
            assertEquals("#", board[0][3]);
            assertEquals("#", board[1][3]);
            assertEquals("#", board[3][3]);
            assertEquals("#", board[4][3]);
        }

        @Test
        void testDrawTwo() {
            String[][] board = sevenSegment.drawTwo();
            assertRowFilled(board, 0);
            assertRowFilled(board, 2);
            assertRowFilled(board, 4);
            assertEquals("#", board[1][3]);
            assertEquals("#", board[3][0]);
        }

        @Test
        void testDrawThree() {
            String[][] board = sevenSegment.drawThree();
            assertRowFilled(board, 0);
            assertRowFilled(board, 2);
            assertRowFilled(board, 4);
            assertEquals("#", board[1][3]);
            assertEquals("#", board[3][3]);
        }

        @Test
        void testDrawFour() {
            String[][] board = sevenSegment.drawFour();
            assertEquals("#", board[0][0]);
            assertEquals("#", board[0][3]);
            assertEquals("#", board[1][0]);
            assertEquals("#", board[1][3]);
            assertRowFilled(board, 2);
            assertEquals("#", board[3][3]);
            assertEquals("#", board[4][3]);
        }

        @Test
        void testDrawFive() {
            String[][] board = sevenSegment.drawFive();
            assertRowFilled(board, 0);
            assertRowFilled(board, 2);
            assertRowFilled(board, 4);
            assertEquals("#", board[1][0]);
            assertEquals("#", board[3][3]);
        }

        @Test
        void testDrawSix() {
            String[][] board = sevenSegment.drawSix();
            assertRowFilled(board, 0);
            assertRowFilled(board, 2);
            assertRowFilled(board, 4);
            assertEquals("#", board[1][0]);
            assertEquals("#", board[3][0]);
            assertEquals("#", board[3][3]);
        }

        @Test
        void testDrawSeven() {
            String[][] board = sevenSegment.drawSeven();
            assertRowFilled(board, 0);
            for (int row = 1; row < 5; row++) {
                assertEquals("#", board[row][3]);
            }
        }

        @Test
        void testDrawEight() {
            String[][] board = sevenSegment.drawEight();
            assertRowFilled(board, 0);
            assertRowFilled(board, 2);
            assertRowFilled(board, 4);
            assertEquals("#", board[1][0]);
            assertEquals("#", board[1][3]);
            assertEquals("#", board[3][0]);
            assertEquals("#", board[3][3]);
        }

        @Test
        void testDrawNine() {
            String[][] board = sevenSegment.drawNine();
            assertRowFilled(board, 0);
            assertRowFilled(board, 2);
            assertRowFilled(board, 4);
            assertEquals("#", board[1][0]);
            assertEquals("#", board[1][3]);
            assertEquals("#", board[3][3]);
        }

        private void assertRowFilled(String[][] board, int row) {
            for (int col = 0; col < board[row].length; col++) {
                assertEquals("#", board[row][col]);
            }
        }
    }


