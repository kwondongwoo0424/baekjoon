class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            int result = -1;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    if (result == -1 || arr[i] < result) {
                        result = arr[i];
                    }
                }
            }
            answer[q] = result;
        }
        
        return answer;
    }
}

