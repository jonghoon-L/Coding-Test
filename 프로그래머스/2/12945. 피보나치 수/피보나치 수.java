class Solution {
    public int solution(int n) {
        int answer = 0;
        long[] arr = new long[n+1];
        
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i = 2; i <= n; i ++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }
        
        answer = (int)(arr[n]);
        
        return answer;
    }
}