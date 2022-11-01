package week7.day2;

public class PrimeStudy {
    //소수 판별해보기
    public boolean isPrime(int num) {
        boolean check = false;
        for (int i = 2; i < num; i++) {
            if (num % i != 0) {
                //나머지 있으면 소수
                check = true; //prime
            }
        }
        System.out.println(check);
        return check;
    }

    public static void main(String[] args) {
        int num = 13;
        PrimeStudy ps = new PrimeStudy();
        ps.isPrime(num);
    }
}
