import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n) {
        List<Integer> numList = new ArrayList<>();
        numList.add(n);
        
        while(n != 1) {
            if(n%2 == 0) {
                numList.add(n/2);
            }else {
                numList.add(3*n+1);
            }
            
            n = numList.get(numList.size() - 1);
        }
        
        return numList;
    }
}