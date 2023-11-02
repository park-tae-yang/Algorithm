import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(1,s.length() - 1);
        HashMap<String,Integer> hm = new HashMap<>();
        String str = "";
        boolean bool = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                bool = true;
            } else if (s.charAt(i) == '}') {
                bool = false;
                if (hm.containsKey(str)) {
                    hm.put(str,hm.get(str) + 1);
                } else {
                    hm.put(str,0);
                }
                str = "";
            } else if (s.charAt(i) == ',' && bool) {
                if (hm.containsKey(str)) {
                    hm.put(str,hm.get(str) + 1);
                } else {
                    hm.put(str,0);
                }
                str = "";
            }else if (bool) {
                str = str + s.charAt(i);
            }
        }
        int len = hm.size();
        int[] answer = new int[len];
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            answer[hm.get(key)] = Integer.parseInt(key);
        }

        int[] reverse = new int[len];
        for (int i = 0; i < hm.size(); i++) {
            reverse[i] = answer[len - i - 1];
        }

        return reverse;
    }
}
