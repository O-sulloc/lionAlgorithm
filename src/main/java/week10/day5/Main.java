package week10.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int sol(int x, int y){
        if (y == 0) {
            return x;
        }

        if (x > y) {
            return sol(y, x % y);
        } else {
            return sol(x, y % x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        System.out.println(sol(x, y));
    }
}
