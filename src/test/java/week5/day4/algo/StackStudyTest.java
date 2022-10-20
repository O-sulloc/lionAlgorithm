package week5.day4.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

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

        assertThrows(EmptyStackException.class, ()->{
           ss.pop(); //익셉션 테스트?하는? 람다식?이라는데?? 모던 자바 표현에 가깝다는데
        });
    }

    @Test
    @DisplayName("isempty test")
    void isEmpty(){
        StackStudy ss = new StackStudy();
        assertTrue(ss.isEmpty());

        ss.push(10);
        assertFalse(ss.isEmpty());
        ss.pop();
        assertTrue(ss.isEmpty());

    }

    @Test
    void realStack(){
        Stack<Integer> st = new Stack<>(); //실제 util에 있는 stack
        //st.pop(); //java.util.EmptyStackException 발생. 당연함. 아무 것도 없는데 뭘 pop해
        //st.peek(); //java.util.EmptyStackException 발생. 당연함. 아무 것도 없는데 뭘 peek해
        assertThrows(EmptyStackException.class, () -> {
           st.pop();
        });
    }

    @Test
    void peek(){
        StackStudy ss = new StackStudy();
        assertThrows(EmptyStackException.class, () -> {
           ss.peek();
        });
        ss.push(10);
        int peeked = ss.peek();
        assertEquals(10,peeked);

    }
}