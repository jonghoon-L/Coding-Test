class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num1 = food.length;
        
        for(int i = 1; i < num1; i ++) {
            if(food[i] % 2 == 0) {
                for(int j = 0; j < food[i] / 2; j ++) {
                    answer += "" + i;
                }
            } else {
                for(int j = 0; j < (food[i] - 1) / 2; j ++) {
                    answer += "" + i;
                }
            }
        } // 122333
        String reverse = new StringBuilder(answer).reverse().toString();
        
        answer += "0";
        answer += "" + reverse;
        
        return answer;
    }
}