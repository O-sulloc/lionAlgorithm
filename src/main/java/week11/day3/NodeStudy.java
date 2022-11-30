package week11.day3;

public class NodeStudy {
    //두 노드 간의 거리 구하기

    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1; //a 나누기 2해서 a의 부모쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; //b를 부모쪽으로
        } else {
            // a == b
            return 0;
        }
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        System.out.println(goUp(3, 4));
        System.out.println(goUp(9, 3));

        //int parentA = Math.floorDiv(3, 2); //a의 부모
        //int parentB = Math.floorDiv(4, 2); //b의 부모


    }
}
