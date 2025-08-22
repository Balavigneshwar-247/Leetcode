class Solution {
    public int balancedStringSplit(String s) {
        int c=0,r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') c++;
            else c--;

            if(c==0) r++;
        }
        return r;
    }
}