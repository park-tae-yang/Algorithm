import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // boolean answer = true;
        // Arrays.sort(phone_book);
        // Set<String> set = new HashSet<>();
        // for(String item : phone_book) {
        //     for(int i = 0; i < item.length(); i++) {
        //         if(set.contains(item.substring(0,i))) return false;
        //         set.add(item.substring(i));
        //     }
        // }
        // return answer;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}