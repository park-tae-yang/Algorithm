import java.util.*;

class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            Queue<String> queue = new LinkedList();

            if (cacheSize == 0) return cities.length * 5;

            cities = Arrays.stream(cities).map(String::toLowerCase).toArray(String[]::new);

            for (int i = 0; i < cacheSize; i++) {
                queue.add(" ");
            }
            for (int i = 0; i < cities.length; i++) {
                if (queue.contains(cities[i])) {
                    answer++;
                    queue.remove(cities[i]);
                    queue.add(cities[i]);
                } else {
                    queue.poll();
                    queue.add(cities[i]);
                    answer = answer + 5;
                }
            }
            return answer;
        }
    }