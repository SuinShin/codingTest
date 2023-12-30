class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String abs = ""+a+b;
        String bas = ""+b+a;
        
        int ab = Integer.parseInt(abs);
        int ba = Integer.parseInt(bas);
        
        if(ab>ba) {
            answer=ab;   
        }else if(ba>ab) {
            answer=ba;
        }else {
            answer=ab;
        }
         
        return answer;
    }
}