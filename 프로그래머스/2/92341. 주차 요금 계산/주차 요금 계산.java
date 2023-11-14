import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        HashMap<String,Integer> hm = new HashMap<>();
//        String[] in  = Arrays.stream(records).filter(i -> i.contains("IN")).toArray(String[]::new);
//        String[] out  = Arrays.stream(records).filter(i -> i.contains("OUT")).toArray(String[]::new);
        loop: for (int i = 0; i < records.length; i++) {
            if (records[i].contains("IN")) {
                String carNum = records[i].substring(6,10);
                int in = Integer.parseInt(records[i].substring(0,2)) * 60 + Integer.parseInt(records[i].substring(3,5));
                if (!hm.containsKey(carNum)) {
                    hm.put(carNum,0);
                }
                for (int j = i + 1; j < records.length; j++) {
                    if (records[j].contains(carNum)) {
                        int out = Integer.parseInt(records[j].substring(0, 2)) * 60 + Integer.parseInt(records[j].substring(3, 5));
                        hm.put(carNum, hm.get(carNum) + out - in);
                        continue loop;
                    }
                }
                hm.put(carNum,hm.get(carNum) + 1439 - in);
            }
        }
        Set<String> keySet = hm.keySet();
        List<String> carNums = new ArrayList(keySet);
        Collections.sort(carNums);
        answer = new int[hm.size()];
        int idx = 0;
        for (String carNum : carNums) {
            int time = hm.get(carNum);
            if (time <= fees[0]) {
                answer[idx] = fees[1];
                idx++;
            } else {
            if ((time - fees[0]) % fees[2] != 0) {
                time += fees[2];
            }
                answer[idx] = fees[1] + ((time - fees[0]) / fees[2] * fees[3]);
                idx++;
            }
        }
        return answer;
    }
}