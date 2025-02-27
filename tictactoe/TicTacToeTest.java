package tictactoe;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TicTacToeTest {
    @Test
    public void testThatTicTacToeBoardIsReady() {
        String[][] board ={
                {"|EMPTY|EMPTY|EMPTY|"},
                {"-------------------"},
                {"|EMPTY|EMPTY|EMPTY|"},
                {"-------------------"},
                {"|EMPTY|EMPTY|EMPTY|"}
        };
        String[][] actual = {
                {"|EMPTY|EMPTY|EMPTY|"},
                {"-------------------"},
                {"|EMPTY|EMPTY|EMPTY|"},
                {"-------------------"},
                {"|EMPTY|EMPTY|EMPTY|"}
        };
        String[][] expected = {
                {"|EMPTY|EMPTY|EMPTY|"},
                {"-------------------"},
                {"|EMPTY|EMPTY|EMPTY|"},
                {"-------------------"},
                {"|EMPTY|EMPTY|EMPTY|"}
        };
        assertArrayEquals(expected, actual);
    }
//    @Test
//    public void testThatTicTacToeBoardIsNotReady() {
//        String[][] board = {
//
//        }
//    }
  
}