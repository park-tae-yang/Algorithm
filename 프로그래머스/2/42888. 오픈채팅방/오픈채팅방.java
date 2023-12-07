import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        int len = 0;
        HashMap<String,String> hm = new HashMap<>();
        for(String chat : record) {
            String[] arr = chat.split(" ");
            if(arr[0].equals("Enter") || arr[0].equals("Leave")) len++;
            if(arr.length > 2) hm.put(arr[1],arr[2]);
        }
        answer = new String[len];
        int idx = 0;
        for(String chat : record) {
            String[] arr = chat.split(" ");
            if(arr[0].equals("Enter")) {
                answer[idx] = hm.get(arr[1]) + "님이 들어왔습니다.";
                idx++;
            } else if (arr[0].equals("Leave")) {
                answer[idx] = hm.get(arr[1]) + "님이 나갔습니다.";
                idx++;
            }
        }
        
        return answer;
    }
}