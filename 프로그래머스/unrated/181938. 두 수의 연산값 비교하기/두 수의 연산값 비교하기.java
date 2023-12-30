class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String abs = ""+a+b;
        int ab = Integer.parseInt(abs);
        int ab2 = 2*a*b;
        
        if((ab>ab2) || (ab==ab2)) {
            answer=ab;
        }else {
            answer=ab2;
        }
        
        return answer;
    }
}