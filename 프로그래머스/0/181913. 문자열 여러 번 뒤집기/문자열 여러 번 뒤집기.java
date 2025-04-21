class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            StringBuilder sub = new StringBuilder(sb.substring(s, e + 1)).reverse();
            sb.replace(s, e + 1, sub.toString());
        }
        return sb.toString();
    }
}