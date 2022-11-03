package week7.day2;

public class PrimeStudy {
    interface StatementStrategy{
        boolean compare(int a, int b);
    }

    public boolean isPrime(int num, StatementStrategy stmt) {
        //소수 판별해보기

        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) {
                //나머지 없으면 소수 아님
                return false; //prime
            }
        }

        return true;
    }

    /*public static void main(String[] args) {
        PrimeStudy ps = new PrimeStudy();
        boolean result = ps.isPrime(17);
        System.out.println(result);
    }*/
}
