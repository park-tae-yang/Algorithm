import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = Arrays.stream(scoville)
            .boxed()
            .collect(Collectors.toCollection(PriorityQueue::new));

        int answer = 0;
        int min = pq.peek();
        while (K > min && pq.size() > 1) {
            answer++;
            int a = pq.poll();
            int b = pq.poll();
            int tmp = a + (b * 2);
            pq.add(tmp);
            min = pq.peek();
        }

        if (K > min) {
            return -1;
        }

        return answer;
    }
}