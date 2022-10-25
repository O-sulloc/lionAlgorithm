package week6.day2;

public class HashFunction {

    //hash 함수
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i <key.length() ; i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 1000;
    }

    public static void main(String[] args) {

    }
}
