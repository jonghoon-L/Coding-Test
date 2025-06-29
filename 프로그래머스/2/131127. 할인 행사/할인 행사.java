import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int hint = 0;
        List<String> find = new ArrayList<>();
        
        for(int i = 0; i <= discount.length - 10; i ++) { // 담기
            for(int j = 0; j < 10; j ++) {
                find.add(discount[i + j]);
            }
            for(int z = 0; z < want.length; z ++) { // 검사 1
                if(Collections.frequency(find, want[z]) == number[z]) {
                    hint ++;
                }
            }
            if(hint == want.length) { // 검사 2
                answer++;
            }
            hint = 0;
            find.clear(); // 초기화
        }
        return answer;
    }
}