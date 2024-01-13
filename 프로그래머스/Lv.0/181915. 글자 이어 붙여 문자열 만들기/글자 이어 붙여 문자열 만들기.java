class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] stArray = my_string.toCharArray();
        
        for(int index:index_list) {
            answer += stArray[index];
        }
        
        return answer;
    }
}