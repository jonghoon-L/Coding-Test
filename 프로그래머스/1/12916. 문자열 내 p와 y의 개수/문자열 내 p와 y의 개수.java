class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        int countP = 0;
        int countY = 0;
        
        for(int i = 0; i < s.length(); i ++) {
            if((charArr[i] == 'p') || (charArr[i] == 'P')) {
                countP ++;
            } else if((charArr[i] == 'y') || (charArr[i] == 'Y')) {
                countY++;
            }
        }
        
        if(countP != countY) {
            answer = false;
        }

        return answer;
    }
}