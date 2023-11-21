import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            char a = (char)(i + 'A');
            al.add(Character.toString(a));
        }
        String word = "";

        for(int i = 0; i < msg.length(); i++) {
            String now = word + msg.charAt(i);

            if(al.contains(now)) {
                word = now;
            } else {
                l.add(al.indexOf(word) + 1);
                al.add(now);
                word = "" + msg.charAt(i);
            }
        }
        if(al.contains(word)) {
            l.add(al.indexOf(word) + 1);
        } else l.add(al.size() + 1);

        answer = l.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
