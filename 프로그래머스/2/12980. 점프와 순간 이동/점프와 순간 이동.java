import java.util.*;

public class Solution {
    public int solution(int n) {
        String newn = Integer.toBinaryString(n);
        int count = 0;
        int len = newn.length();
        char[] answer = newn.toCharArray();
        
        for(int i = 0; i < len; i ++) {
            if(answer[i] == '1') {
                count ++;
            }
        }

        return count;
    }
}