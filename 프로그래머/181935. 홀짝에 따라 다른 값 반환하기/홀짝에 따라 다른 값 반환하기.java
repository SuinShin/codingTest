class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=n;i>0;i--) {
            if(n%2==1) {
                answer+=(i%2==1)?i:0;
            }else {
                answer+=(i%2==0)?Math.pow(i,2):0;
            }
        }
        
        return answer;
    }
}