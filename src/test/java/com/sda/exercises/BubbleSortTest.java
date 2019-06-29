package com.sda.exercises;

import com.sda.exercises.sort.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void sortTest(){

        //given
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(9, 5, 6, 2, 1, 4, 3));

        //when
        List<Integer> returned = bubbleSort.sort(unsortedList);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9));

        //then
        Assert.assertEquals(returned, expected);
    }
}
