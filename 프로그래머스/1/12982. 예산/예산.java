import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int num = 0;
        int answer = 0;
        int i = d.length;
        
        Arrays.sort(d);
        
        while(i != 0) {
            for(int j = 0; j < i; j ++) {
                num += d[j];
            }
            if(num <= budget) {
                    answer = i;
                    i = 1;
            }
            i --;
            num = 0;
        }
        return answer;
    }
}
        
