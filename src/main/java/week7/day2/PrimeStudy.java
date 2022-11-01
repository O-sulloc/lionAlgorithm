package week7.day2;

public class PrimeStudy {
    boolean someOperation(int a, int b) {
        return a < b; //i랑 소수판별하려는 숫자랑 대소비교
    }

    public boolean isPrime(int num) {
        //소수 판별해보기

        for (int i = 2; someOperation(i, num); i++) {
            if (num % i == 0) {
                //나머지 없으면 소수 아님
                return false; //prime
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeStudy ps = new PrimeStudy();
        boolean result = ps.isPrime(17);
        System.out.println(result);
    }
}
