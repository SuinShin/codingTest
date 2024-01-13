class Solution {
    public int solution(int[] sides) {
        int max=0;
        int sum=0;
        
        for(int i=0; i<sides.length; i++) {
            max = (sides[i] > max)?sides[i]:max;
            sum += sides[i];
        }
        
        if(max < (sum-max)) {
            return 1;
        }else {
            return 2;
        }
    
    }
}