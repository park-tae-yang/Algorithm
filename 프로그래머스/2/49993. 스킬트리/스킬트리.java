class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        loop: for(String str : skill_trees) {
            int idx = 0;
            String[] split = str.split("");
            for(int i = 0; i < split.length; i++) {
                if(skill.contains(split[i])) {
                    if(skill.indexOf(split[i]) == idx) {
                        idx++;
                    } else {
                        continue loop;
                    }
                }
            }
            answer++;
        }
        return answer;
    }
}