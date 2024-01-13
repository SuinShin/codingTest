import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> range = new ArrayList<>();
        for(int num : num_list) range.add(num);
        return (range.contains(n))? 1 : 0;
    }
}