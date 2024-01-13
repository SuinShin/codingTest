class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int num = queries[i][2];
            
            int smallest = Integer.MAX_VALUE;
            boolean flag = false;
            
            for(int j=start; j<=end; j++) {
                if(arr[j]>num && arr[j]<smallest) {
                    smallest = arr[j];
                    flag=true;
                }
            }
            
            if(flag) {
                answer[i] = smallest;
            }else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}