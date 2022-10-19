package week5.day3.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackStudyTest {

    @Test
    void pushTest() {
        StackStudy ss = new StackStudy();
        ss.push(10);
        ss.push(20);

        int[] arr = ss.getArr();

        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }
}