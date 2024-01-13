class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numStr = my_string.replaceAll("[^0-9]", "").split("");
        
        for(String i:numStr) answer += Integer.parseInt(i);
        
        return answer;
    }
}