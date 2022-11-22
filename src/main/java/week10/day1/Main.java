package week10.day1;

public class Main {
    public static void print100(int n){
        if(n == 100){
            return;
        }
        System.out.println(n);
        print100(n+1);
    }

    public static void main(String[] args) {
        print100(1);
    }
}
