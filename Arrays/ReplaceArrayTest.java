package Arrays;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReplaceArrayTest {
    @Test
    public void testThatItReplacesTheArray() {

        char[] actualArray = {'X','X','X','X','X'};
        int[] expectedArray = {1,1,1,1,1};
        int[] resultArray = ReplaceArray.intArray(actualArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testThatItReplacesTheArray2() {
        char[] actualArray = {'O','O','O','O','O','O'};
        int[] expectedArray = {0,0,0,0,0,0,};
        int[] resultArray = ReplaceArray.intArray(actualArray);
        assertArrayEquals(expectedArray, resultArray);
    }
    @Test
    public void testThatItReplacesTheArray3() {
        char[] actualArray = {'X','O','X','O','X','o'};
        int[] expectedArray = {1,0,1,0,1,0,};
        int[] resultArray = ReplaceArray.intArray(actualArray);
        assertArrayEquals(expectedArray, resultArray);


    }
}