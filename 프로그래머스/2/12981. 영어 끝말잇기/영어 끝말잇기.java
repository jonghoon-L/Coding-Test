import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int length = words.length;
        int wordLength = 0;
        List<String> find = new ArrayList<>();
        
        find.add(words[0]);
        
        for(int i = 1; i < length; i ++) {
            wordLength = words[i-1].length();
            
            if(words[i-1].charAt(wordLength-1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            } else if(find.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            } else {
                find.add(words[i]);
            }
        }
        
        answer[0] = 0;
        answer[1] = 0;
        
        return answer;
    }
}