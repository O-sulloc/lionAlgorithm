package week10.day1;

public class RecursiveSum {
    public int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n + sum(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        RecursiveSum r = new RecursiveSum();
        System.out.println(r.sum(n));
    }
}
