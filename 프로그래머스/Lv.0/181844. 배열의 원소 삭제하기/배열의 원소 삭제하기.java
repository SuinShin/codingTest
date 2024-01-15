import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();
        
        for(int num : arr) {
            boolean flag = false;
            
            for(int dNum : delete_list) {
                if(num == dNum)
                    flag = true;
            }
            
            if(!flag) result.add(num);
        }
        
        return result;
    }
}