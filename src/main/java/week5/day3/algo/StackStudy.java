package week5.day3.algo;

public class StackStudy {
    private int[] arr = new int[100000];
    private int pointer = 0; //포인터로 지금상태?를 확인할 수 있음.

    public StackStudy() {

    }

    public StackStudy(int size) {
        this.arr = new int[size];
    }

    public int pop() {
        //pop하면 배열 젤 위에 있는걸 꺼내줘 그리고 삭제해줘

        int value = this.arr[this.pointer-1]; //포인터가 가르키는 위치. 거기가 꺼내고자 하는 array 인덱스의 위치. 꺼낸 다음에 value 변수에 넣어줘
        this.pointer--; //포인트는 감소시켜줘. 이제 거기에 데이터 없으니까?
        //삭제는 언제하죠?

        return value; //꺼낸 데이터 리턴
    }

    public void push(int value) {
        //push하면 Value를 넣어줘. 어레이 배열에

        this.arr[this.pointer] = value;
        this.pointer++; //하나 진행될때마다 ++로 증가해줘
    }

    public int[] getArr() {
        //private이라 테스트에서 접근이 안되니까 get으로 불러올 수 있게 만들어줌.
        return arr;
    }
}
