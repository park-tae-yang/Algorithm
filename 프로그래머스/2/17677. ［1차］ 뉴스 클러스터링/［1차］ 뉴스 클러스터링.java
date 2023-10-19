import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> arr1 = toArray(str1);
        ArrayList<String> arr2 = toArray(str2);
        if(arr1.size() == 0 && arr2.size() == 0) return 65536;
        for(String ele : arr1) {
            for (int i = 0; i < arr2.size(); i++) {
                if (ele.equals(arr2.get(i))) {
                    answer++;
                    arr2.remove(arr2.get(i));
                    break;
                }
            }
        }
        if(answer == 0) return 0;
        for(String ele : arr2) {
            arr1.add(ele);
        }
        return (int) ((double) answer / arr1.size() * 65536);
    }

    public ArrayList<String> toArray(String str) {
        str = str.toLowerCase();
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < str.length() - 1; i++) {
            String a = "" + str.charAt(i) + str.charAt(i + 1);
            if (a.matches("^[a-zA-Z]*$")) al.add(a);
        }
        Collections.sort(al);
        return al;
    }
}
