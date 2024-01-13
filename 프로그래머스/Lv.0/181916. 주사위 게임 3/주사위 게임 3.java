import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] numList = {a, b, c, d};
        Arrays.sort(numList);
        
        int answer = 0;
        
        if(numList[0] == numList[3]) {
            answer = 1111 * numList[3];
        }else if(numList[0] == numList[2] || numList[1] == numList[3]) {
            if(numList[0] == numList[2]) {
                answer = (int)Math.pow((10 * numList[0] + numList[3]),2);   
            }else {
                answer = (int)Math.pow((10 * numList[3] + numList[0]),2);
            }
        }else if(numList[0] == numList[1] && numList[2] == numList[3]) {
            answer = (numList[0] + numList[3]) * Math.abs(numList[0] - numList[3]);
        }else if(numList[0] == numList[1]) {
            answer = numList[2] * numList[3];
        }else if(numList[1] == numList[2]) { 
            answer = numList[0] * numList[3];
        }else if(numList[2] == numList[3]) {
            answer = numList[0] * numList[1];
        }else {
            answer = numList[0];
        }
        
        return answer;
    }
}