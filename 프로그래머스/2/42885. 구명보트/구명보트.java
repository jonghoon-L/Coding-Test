import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int length = people.length;
        
        Arrays.sort(people);
        
        for(int left = 0, right = length - 1; left <= right;) {
            if(people[left] + people[right] <= limit) {
                answer ++;
                left ++;
                right --;
            } else {
                answer ++;
                right --;
            }
        }
        
        return answer;
    }
}