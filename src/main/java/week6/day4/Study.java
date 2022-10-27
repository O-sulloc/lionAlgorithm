package week6.day4;

import java.util.Arrays;
import java.util.HashMap;

public class Study {
    //단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    //
    //마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    //완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    //hash를 사용해서

    public String solution(String[] participant, String[] completion) {
        String name ="";

        HashMap<String, Integer> table = new HashMap<>();

        //테이블에 참가자 이름을 넣고 1로 표시
        for (int i = 0; i < participant.length; i++) {
            table.put(participant[i],1);
        }

        //완주자 이름 찾아서 0으로 표시
        for (int i = 0; i < completion.length ; i++) {

        }

        // 0인 사람 출력

        return name;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
    }
}
