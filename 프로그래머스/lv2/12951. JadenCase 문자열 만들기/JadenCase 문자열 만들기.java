import java.util.*;
class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                String a = arr[i];
                
                if(a.length() == 0) answer += " ";
                else{
                    answer += a.substring(0,1).toUpperCase();
                    answer += a.substring(1, a.length()).toLowerCase();
    			    answer += " ";
                }
            }
            
            if(s.substring(s.length()-1, s.length()).equals(" ")) return answer;
    	
            return answer.substring(0, answer.length()-1);
        }
    }