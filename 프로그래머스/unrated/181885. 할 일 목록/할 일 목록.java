import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int f = 0;
        for(boolean b : finished) {
            if(!b) f++;
        }
        String[] answer = new String[f];
        int idx = 0;
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }
        return answer;
    }
}