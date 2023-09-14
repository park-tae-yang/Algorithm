import java.util.*;

class Solution {
    static boolean[] visited;
    static String[] answer;

    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        visited = new boolean[tickets.length];
        answer[0] = "ICN";
        answer[tickets.length] = "";
        Arrays.sort(tickets, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }
        });

        dfs(1, tickets, "ICN");
        return answer;
    }

    public void dfs(int depth,String[][] tickets,String ap) {
        for(int i = 0; i < tickets.length; i++) {
            if(visited[i] || !tickets[i][0].equals(ap)) continue;
            visited[i] = true;
            if (!answer[tickets.length].isEmpty()) return;
            answer[depth] = tickets[i][1];
            dfs(depth + 1,tickets,tickets[i][1]);
            visited[i] = false;
        }
    }
}
