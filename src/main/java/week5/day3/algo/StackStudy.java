package week5.day3.algo;

public class StackStudy {
    private int[] arr = new int[100000];
    private int pointer = 0; //포인터로 지금상태?를 확인할 수 있음.

    public StackStudy() {

    }

    public StackStudy(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        //push하면 Value를 넣어줘. 어레이 배열에

        this.arr[this.pointer] = value;
        this.pointer++; //하나 진행될때마다
    }

    public int[] getArr(){
        //private이라 테스트에서 접근이 안되니까 get으로 불러올 수 있게 만들어줌.

        return arr;
    }
}
