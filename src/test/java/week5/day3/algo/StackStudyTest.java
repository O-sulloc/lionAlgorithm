package week5.day3.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackStudyTest {

    //@Test
    void pushTest() {
        StackStudy ss = new StackStudy();
        ss.push(10);
        ss.push(20);

        int[] arr = ss.getArr();

        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }

    @Test
    @DisplayName("push pop 둘 다 동시에 테스트")
    void pushAndPop(){
        StackStudy ss = new StackStudy();
        ss.push(10);
        ss.push(20);

        Assertions.assertEquals(20,ss.pop());
        Assertions.assertEquals(10,ss.pop());

        ss.push(30);
        Assertions.assertEquals(30,ss.pop());
    }
}