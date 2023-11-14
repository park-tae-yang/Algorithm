import java.util.*;

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        int len = lines.length;
        String[][] split = new String[len][3];
        String[][] split2 = new String[len][3];
        double[][] sted = new double[len][2];
        int idx = 0;
        for(String line : lines) {
            split[idx++] = line.split(" ");
        }
        idx = 0;
        for(String[] item : split) {
            split2[idx++] = item[1].split(":");
        }
        
        for(int i = 0; i < len; i++) {
            double sum = 0;
            double prog = Double.parseDouble(split[i][2].replace("s","")) * 1000;
            sum += Double.parseDouble(split2[i][0]) * 3600000;
            sum += Double.parseDouble(split2[i][1]) * 60000;
            sum += Double.parseDouble(split2[i][2]) * 1000;
            sted[i][0] = sum;
            sted[i][1] = sum - prog;
        }
        int max = 1;
        for(int i = 0; i < len; i++) {
            int traffic = 1;
            double now = sted[i][0];
            for(int j = i + 1; j < len; j++) {
                if(now + 999 > sted[j][1]) {
                    traffic++;
                    max = Math.max(max,traffic);
                }
            }
        }
        if(sted.length >= 2) {
        System.out.println(sted[0][0]);
        System.out.println(sted[1][1]);
        }
        return max;
    }
}