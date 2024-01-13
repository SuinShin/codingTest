class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        if(my_string.contains(alp)) {
            return my_string.replace(alp, alp.toUpperCase());
        }else {
            return my_string;
        }
    }
}