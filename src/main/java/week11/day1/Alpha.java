package week11.day1;

public class Alpha {
    //알파벳 두 개를 조합해서 나올 수 있는 모든 경우의 수 출력하기 AA, AB, ...
    //아스키 65~90까지가 A~Z

    public void print(char ch) {

        if(ch > 'Z'){
            return;
        }
        System.out.println(ch);
        print((char) (ch+1));
    }

    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        //int n = 2; //칸이 n개인 경우 (2개인 경우 AA,AB ...) (3개인 경우 AAA, ...)
        alpha.print('A');

        /* 내가 푼 방법..
        char ch = 0;
        char ch2 = 0;
        int count = 0;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if(ch2 > 90){
                    ch2 = 65;
                }
                System.out.printf("%s%s\n", ch, ch2);
                ch2++;
            }
            ch++;
        }
        System.out.println(count);
         */
    }
}
