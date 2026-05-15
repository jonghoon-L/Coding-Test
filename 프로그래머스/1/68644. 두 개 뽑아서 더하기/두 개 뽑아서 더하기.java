import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int leng = numbers.length;
        int num = 0;
        
        for(int i = 0; i < leng - 1; i ++) {
            for(int j = i + 1; j < leng; j ++) {
                num = numbers[i] + numbers[j];
                
                if(!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}