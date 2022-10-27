package week6.day4;

import java.util.HashMap;
import java.util.Set;

public class Study {
    //단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    //
    //마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    //완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    //hash를 사용해서

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> table = new HashMap<>();

        //테이블에 참가자 이름을 넣고 +1 (동명이인 문제)
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];

            if (!table.containsKey(key)) {
                table.put(key, 0);
            }
            table.put(key, table.get(key) + 1);
        }
        //System.out.println(table.get(completion[0])); //완주자 이름 넣으면 1이 나옴.

        //완주자 이름 찾아서 -1 해서 0으로 만들고
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            table.put(key, table.get(key) - 1);
        }

        // Value가 0이 아닌 key 출력
        for (String key : table.keySet()) {
            if (table.get(key) != 0) {
                //System.out.println(key);
                return key;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        Study study = new Study();
        study.solution(participant,completion);
    }
}
