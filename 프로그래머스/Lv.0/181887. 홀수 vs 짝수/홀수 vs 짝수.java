class Solution {
    public int solution(int[] num_list) {  
        int oddIdxSum = 0;
        int evenIdxSum = 0;
    
        for(int i=0; i<num_list.length; i++) {
            if(i%2 == 0) {
                oddIdxSum += num_list[i];
            }else {
                evenIdxSum += num_list[i];
            }
        }
    
        return (oddIdxSum == evenIdxSum)? oddIdxSum : (oddIdxSum > evenIdxSum)? oddIdxSum : evenIdxSum;
    }
}