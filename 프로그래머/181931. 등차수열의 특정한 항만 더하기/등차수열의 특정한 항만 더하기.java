class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] numList = new int[included.length];
        numList[0] = a;
        
        for(int i = 1; i<included.length; i++) {
            numList[i] = numList[i-1] + d;
        }
        
        for(int i = 0; i<included.length; i++) {
            if(included[i])
                answer+=numList[i];
        }
        
        return answer;
    }
}