package heapStudy;

import java.util.PriorityQueue;

public class Scoville {
    // k 음식의 스코빌 지수
    // 스코빌 지수가 가장 낮은 음식 두개를 섞어서 새로운 음식을 만듬
    // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + ( 두번째로 안매운 스코빌지수 *2)
    // 모든 음식의 스코빌 지수가 K이상이 될때까지 섞음
    //섞어야 하는 최소 횟수를 return 하라

    public static int solution(int[] sco, int k) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < sco.length; i++) {
            pq.add(sco[i]);
        }

        while (pq.size() >= 2 && pq.peek() < k) {
            // while(pq.peek() < k) 는 pq가 1개일 경우를 대비하지 못해서 runtimeError가 난다.
            int mix = pq.poll() + (pq.poll() * 2);
            pq.add(mix);
            answer++;
        }

        if(pq.peek() < k) return -1;

        return answer;
    }

    public static void main(String[] args) {
        int[] sco = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(sco, k));
    }

}
