class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {1, 1};
        int total = brown + yellow;
        int se = 1;
        
        for(int ga = 1; ga <= total; ga ++) {
            if(total % ga == 0) {
                se = (total / ga);
                if((se - 2) * (ga - 2) == yellow) {
                    answer[0] = se;
                    answer[1] = ga;
                }
            }
        }
        
        if(answer[0] < answer[1]) {
            se = answer[0];
            answer[0] = answer[1];
            answer[1] = se;
        }
        
        return answer;
    }
}