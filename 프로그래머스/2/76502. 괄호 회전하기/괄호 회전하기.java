import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.length() % 2 == 1) return 0;

        int len = s.length();
        loop: for(int i = 0; i < len; i++) {
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < len; j++) {
                char c = s.charAt((i + j) % len);
                if(c == '(' || c == '{' || c == '[' ) stack.push(c);
                else if(stack.isEmpty()) continue loop;
                else if(stack.peek() + 1 == c || stack.peek() + 2 == c) stack.pop();
                else continue loop;
            }
            answer++;

        }
        return answer;
    }
}