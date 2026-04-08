class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int result = 0;
        int x = n;
        int count = 0;
        
        while(x > 0) {
            if(x % 2 == 1) {
                count += 1;
            }
            x = x / 2;
        }
        
        while(result == 0) {
            int count2 = 0;
            int y = answer;
            
            while(y > 0) {
            if(y % 2 == 1) {
                count2 += 1;
            }
            y = y / 2;
        }
            
            if(count2 == count) {
                result = 1;
            } else {
                answer += 1;
            }
        }
        
        return answer;
    }
}