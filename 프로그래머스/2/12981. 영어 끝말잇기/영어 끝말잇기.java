import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            if(list.contains(words[i])) {
                answer[0] = (i + 1) % n;
                if(answer[0] == 0) answer[0] = n;
                answer[1] = (int)Math.ceil((double)(i + 1) / n);
                break;
            }
            if(!words[i].startsWith(words[i-1].substring(words[i-1].length() - 1))) {
                answer[0] = (i + 1) % n;
                if(answer[0] == 0) answer[0] = n;
                answer[1] = (int)Math.ceil((double)(i + 1) / n);
                break;
            }
            list.add(words[i]);
        }

        return answer;
    }
}