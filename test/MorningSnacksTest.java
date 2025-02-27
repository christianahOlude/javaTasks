package test;

import org.junit.Test;
import snacks.MorningSnacks;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MorningSnacksTest {


    @Test
    public void testThatElementsCanBeAddedToAList() {
        MorningSnacks morningSnacks = new MorningSnacks();
        int []numbers = {1,2,5};
        int actual = MorningSnacks.number(numbers);
        int[] expected = {3,4};
        System.out.println(actual);
        assertEquals(expected, actual);

    }




}