package week5.day4.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackStudyTest {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("push test")
    void push(){
        StackStudy ss = new StackStudy();
        ss.push(10);
        ss.push(20);

        Integer[] arr = ss.getArr();

        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pushAndPop test")
    void pushAndPop(){
        StackStudy ss = new StackStudy();
        ss.push(10);
        ss.push(20);

        assertEquals(20, ss.pop());
        assertEquals(10, ss.pop());

    }
}