class Solution {
    boolean solution(String s) {
        String[] arrays = s.split("");
        boolean answer = true;
        int length = s.length();
        int count = 0;
        
        if((arrays[0].equals("(")) && (arrays[length - 1].equals(")"))) {
            for(int i = 0; i < length; i ++) {
                if(arrays[i].equals("(")) {
                    count += 1;
                } else {
                    count -= 1;
                }
                if(count < 0) {
                    return false;
                }
            }
            if(count == 0) {
                answer = true;
            } else {
                answer = false;
            }
            
        } else {
            answer = false;
        }
          return answer;
    }
}