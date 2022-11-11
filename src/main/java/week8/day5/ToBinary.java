package week8.day5;

public class ToBinary {

    public void change(int n) {
        int b[] = new int[32];
        int i = 0;
        // 7 -> 0 1 1 1
        // 7 % 2 = 1
        // 3 % 2 = 1
        // 1 % 2 = 1
        // 1 / 2 =0

        while (n != 0) {
            b[i] = n % 2;
            i++;
            n = n / 2;
        }
        b[i] = n;

        for (int j = i; j >= 0 ; j--) {
            System.out.printf("%d ",b[j]);
        }
    }

    public static void main(String[] args) {
        int n = 4;

        ToBinary tb = new ToBinary();
        tb.change(n);
    }
}
