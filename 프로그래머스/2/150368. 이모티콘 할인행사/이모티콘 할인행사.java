import java.util.*;

class Solution {
        static int[][] sUsers;
        static int[] sEmoticons;
        static int[] discount;
        int maxPlus;
        int maxMoney;

    public int[] solution(int[][] users, int[] emoticons) {
        maxPlus = 0;
        maxMoney = 0;
        sUsers = users;
        sEmoticons = emoticons;
        int[] answer = new int[2];
        discount = new int[emoticons.length];
        Arrays.fill(discount, 10);
        rec(0);
        answer[0] = maxPlus;
        answer[1] = maxMoney;

        return answer;
    }

    public void rec(int idx) {
        int[] pm;

        if (idx == sEmoticons.length) {
            pm = buy();
            if (pm[0] > maxPlus) {
                maxPlus = pm[0];
                maxMoney = pm[1];
            } else if (pm[0] == maxPlus && pm[1] > maxMoney) {
                maxMoney = pm[1];
            } return;
        }

        for (int i = 1; i < 5; i++) {
            discount[idx] = i * 10;
            rec(idx + 1);
            discount[idx] = 10;
        }
    }

    public int[] buy() {
        int plus = 0;
        int money = 0;
        int[] pm = new int[2];
        loop: for (int[] user : sUsers) {
            int uMoney = 0;
            for (int i = 0; i < sEmoticons.length; i++) {
                if(discount[i] >= user[0]) {
                    uMoney += (sEmoticons[i] / 100) * (100 - discount[i]);
                    if (uMoney >= user[1]) {
                        plus++;
                        continue loop;
                    }
                }
            }
            money += uMoney;
        }
        pm[0] = plus;
        pm[1] = money;
        return pm;
    }
}