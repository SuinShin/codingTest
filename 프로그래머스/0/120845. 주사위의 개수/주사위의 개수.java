class Solution {
    public int solution(int[] box, int n) {
    
        for(int i=0; i<box.length; i++) {
            box[i] /= n;
        }
        
        int answer = box[0] * box[1] * box[2];   
        return answer;
    }
}