class Solution {
    public int solution(String number) {
        char[] nums = number.toCharArray();
        int digitSum = 0;
        
        for(char num : nums) {
            digitSum += Character.getNumericValue(num);
        }
        
        return digitSum % 9;
    }
}