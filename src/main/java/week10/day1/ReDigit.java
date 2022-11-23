package week10.day1;

public class ReDigit {
    public int digit(int n) {
        if(n == 0) {
            return 0;
        }

        return n%10 + digit(n/10);
    }

    public static void main(String[] args) {
        int n = 1234;
        ReDigit re = new ReDigit();
        System.out.println(re.digit(n));
    }
}
