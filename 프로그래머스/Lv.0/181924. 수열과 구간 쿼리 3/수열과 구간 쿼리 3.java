class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp=0;
        
        for(int i=0; i<queries.length; i++) {
            for(int j=1; j<queries[i].length; j++) {
                temp=arr[queries[i][0]];
                arr[queries[i][0]]=arr[queries[i][j]];
                arr[queries[i][j]]=temp;
            }
        }
        
        return arr;
    }
}