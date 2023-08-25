import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String,Integer> hm = new HashMap<>();
        ArrayList<Integer> answers = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            if (hm.containsKey(genres[i])) {
                hm.put(genres[i],hm.get(genres[i]) + plays[i]);
            } else hm.put(genres[i],plays[i]);
        }
        List<String> keySet = new ArrayList<>(hm.keySet());
        keySet.sort(((o1, o2) -> hm.get(o2).compareTo(hm.get(o1))));
        
        for (int i = 0; i < hm.size(); i++) {
            int num1 = 0;
            int num2 = 0;
            int max1 = 0;
            int max2 = 0;
            for (int j = 0; j < genres.length; j++) {
                if (genres[j].equals(keySet.get(i))) {
                    if (plays[j] > max1) {
                        max2 = max1;
                        num2 = num1;
                        max1 = plays[j];
                        num1 = j;
                    } else if (plays[j] > max2) {
                        max2 = plays[j];
                        num2 = j;
                    }
                }
            }
            if (max1 != 0) answers.add(num1);
            if (max2 != 0) answers.add(num2);
        }
        answer = answers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}