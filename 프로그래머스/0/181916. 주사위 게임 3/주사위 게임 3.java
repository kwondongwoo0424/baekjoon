import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : dice) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int size = map.size();

        if (size == 1) {
            return 1111 * a;
        } else if (size == 2) {
            for (int key : map.keySet()) {
                int val = map.get(key);
                if (val == 3) {
                    int p = key;
                    int q = 0;
                    for (int k : map.keySet()) {
                        if (k != p) q = k;
                    }
                    return (int) Math.pow(10 * p + q, 2);
                } else if (val == 2) {
                    int[] keys = new int[2];
                    int idx = 0;
                    for (int k : map.keySet()) keys[idx++] = k;
                    return (keys[0] + keys[1]) * Math.abs(keys[0] - keys[1]);
                }
            }
        } else if (size == 3) {
            int p = 0, q = 0, r = 0;
            for (int key : map.keySet()) {
                int val = map.get(key);
                if (val == 2) {
                    p = key;
                } else if (q == 0) {
                    q = key;
                } else {
                    r = key;
                }
            }
            return q * r;
        } else {
            int min = 7;
            for (int num : dice) {
                min = Math.min(min, num);
            }
            return min;
        }

        return 0;
    }
}