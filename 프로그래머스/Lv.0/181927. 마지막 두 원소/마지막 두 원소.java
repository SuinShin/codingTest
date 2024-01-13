class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list.length - 1;
        int[] answer = new int[num_list.length+1];
        
        for(int i=0; i<=last; i++) {
            answer[i] = num_list[i];
        }
        
        if(answer[last]>answer[last-1]) {
            answer[last+1] = answer[last] - answer[last-1];
        }else {
            answer[last+1] = answer[last] * 2;
        }
        
        return answer;
    }
}