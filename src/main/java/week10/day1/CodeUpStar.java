package week10.day1;

import java.util.Scanner;

public class CodeUpStar {
    public void star(int n) {
        if(n == 0){
            return;
        }
        System.out.print("*");
        star(n - 1);
    }

    public String star1(int n){
        //리턴값 있을 때 메소드

        if(n == 0){return "";}

        return "*" + star1(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //int n = 3;
        CodeUpStar s = new CodeUpStar();
        System.out.println(s.star1(n));
    }
}
