class Solution {
    public boolean calculate(String s) {
            
            int newlen = 0;
            
            while(s.length() != newlen) {
                
                newlen = s.length();
                s = s.replace("()", "");
                s = s.replace("[]", "");
                s = s.replace("{}", "");
            
            }
            
            if(s.length() == 0) {
                return true;
            } else {
                return false;
            }
            
        }
    
    public int solution(String s) {
        int answer = 0;
        int max = s.length();
        char test[] = s.toCharArray();
        
        if(calculate(s)) {
            answer += 1;
        }
        
        for(int i = 1; i < max; i ++) {
            char dub = test[0];
            for(int j = 0; j < max - 1; j ++) {
                test[j] = test[j + 1];
            }
            test[max - 1] = dub;
            
            String rotate = new String(test);
            
            if(calculate(rotate)) {
                answer += 1;
            }
            
        }
        
        return answer;
    }
}