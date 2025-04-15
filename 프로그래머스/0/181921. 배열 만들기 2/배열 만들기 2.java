import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            if (s.matches("[05]+")) {
                result.add(i);
            }
        }
        
        if (result.isEmpty()) return new int[]{-1};
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}