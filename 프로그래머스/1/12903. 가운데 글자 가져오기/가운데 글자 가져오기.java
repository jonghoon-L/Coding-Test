class Solution {
    public String solution(String s) {
        String answer = "";
        int lengthNum = s.length();
        int resultNum = 0;
        if(lengthNum % 2 == 0) {
            resultNum = lengthNum / 2;
            answer = "" + s.charAt(resultNum - 1) + s.charAt(resultNum);
        } else {
            resultNum = (lengthNum -1) / 2;
            answer = "" + s.charAt(resultNum);
        }
        
        return answer;
    }
}