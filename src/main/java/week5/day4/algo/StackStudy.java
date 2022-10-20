package week5.day4.algo;

import java.util.EmptyStackException;

public class StackStudy {
    private Integer[] arr;
    private int pointer = 0;

    public StackStudy() {
        this.arr = new Integer[10000];
    }

    public StackStudy(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        //10 넣으면 arr[0] = 10

        this.arr[pointer] = value; //0번 인덱스에 값 넣생
        this.pointer++;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {
        if(this.isEmpty()){
            throw  new EmptyStackException(); //스택 안에 아무 것도 없ㅇ면 예외처리
        }
        int value = this.arr[this.pointer - 1];
        this.pointer--;
        return value;
    }

    public boolean isEmpty() {
        boolean isEmpty = this.pointer == 0;
        return isEmpty;
    }
}