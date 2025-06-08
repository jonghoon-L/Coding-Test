class Solution {
    public int solution(int n) {
        int answer = 1;
        int result = 0;
        
        if(n % 2 == 0) {
         for(int i = 1; i < (n / 2); i ++) {
             result = i;
             for(int j = i; j < n; j++) {
                 result += j + 1;
                 if(result == n) {
                     answer += 1;
                     break;
                    } else if(result > n) {
                     break;
                    }
                }
            }   
        } else {
            for(int i = 1; i < ((n + 1) / 2); i ++) {
             result = i;
             for(int j = i; j < n; j++) {
                 result += j + 1;
                 if(result == n) {
                     answer += 1;
                     break;
                    } else if(result > n) {
                     break;
                    }
                }
            }   
        }
        return answer;
    }
}