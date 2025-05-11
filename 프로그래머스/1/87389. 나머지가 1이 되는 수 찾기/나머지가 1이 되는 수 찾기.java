class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int a = n; a > 0; a --) {
            if(n % a == 1) {
                answer = a;
            }
        }
        return answer;
    }
}