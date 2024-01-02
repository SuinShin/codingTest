class Solution {
    public int solution(int n, String control) {
        
        char[] ctrlArr = control.toCharArray();
        
        for(char ctrl:ctrlArr) {
            if(ctrl == 'w') n+=1;
            if(ctrl == 's') n-=1;
            if(ctrl == 'd') n+=10;
            if(ctrl == 'a') n-=10;
        }
        
        return n;
    }
}