package week11.day3;

public class Pro12928_1 {
    //정수 n을 입력받아 N의 약수를 모두 더한 값을 리턴

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (Math.floorMod(n, i) == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
