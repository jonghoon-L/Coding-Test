class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1index = 0;
        int cards2index = 0;
        
        for(int i=0; i < goal.length; i++) {
            String target = goal[i];
            if(cards1index < cards1.length && target.equals(cards1[cards1index])) {
                cards1index ++;
            } else if(cards2index < cards2.length && target.equals(cards2[cards2index])) {
                cards2index ++;
            } else {
                 return "No";
            }
        }
        return "Yes";
        
    }
}