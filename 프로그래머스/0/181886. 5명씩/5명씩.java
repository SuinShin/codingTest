class Solution {
    public String[] solution(String[] names) {
        int idx = 0;
        int length = (int)Math.ceil((double)names.length/5);
        String[] answer = new String[length];
        
        for(int i=0; i<names.length; i+=5) {
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}