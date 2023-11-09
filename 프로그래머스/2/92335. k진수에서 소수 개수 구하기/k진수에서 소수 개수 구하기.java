class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String nnum = Integer.toString(n,k) + "0";
        String now = "";
        loop: for(int i = 0; i < nnum.length(); i++) {
            if(nnum.charAt(i) != '0') {
                now += nnum.charAt(i);
            } else if(!now.isEmpty()) {
                long toNum = Long.parseLong(now);
                if (toNum == 1) {
                    now = "";
                    continue;
                }
                for(int j = 2; j < toNum; j++) {
                    if(toNum % j == 0) {
                        now = "";
                        continue loop;
                    }
                }
                answer++;
                now = "";
            }
        }
        return answer;
    }
}