package week5.day4.algo;

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

        this.arr[pointer] = value; //0번 인덱스에 값 넣고
        this.pointer++;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {
        int value = this.arr[this.pointer - 1];
        this.pointer--;
        return value;
    }
}