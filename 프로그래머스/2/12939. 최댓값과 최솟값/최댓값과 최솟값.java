class Solution {
    public String solution(String s) {
        String[] strings = s.split(" ");
        int length = strings.length;
        int[] nums = new int[length];
        
        for(int i = 0; i < length; i ++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        
        int min = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < length; i ++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        
        String mins = "" + min;
        String maxs = "" + max;
        
        String answer = "";
        answer = mins + " " + maxs;
        return answer;
    }
}