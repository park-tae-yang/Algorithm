import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> queue = new LinkedList<>();
        for(int prio : priorities) {
            queue.add(prio);
        }
        int idx = 0;
        Arrays.sort(priorities);
        int len = priorities.length;
        while(!queue.isEmpty()) {
            if(queue.peek() == priorities[len - 1]) {
                if(location == 0) {
                    return answer;
                }
                queue.poll();
                answer++;
                len--;
            } else {
                queue.add(queue.poll());
            } location--;
            if(location < 0) {
                location = queue.size() - 1;
            }
        }
        return answer;
    }
}