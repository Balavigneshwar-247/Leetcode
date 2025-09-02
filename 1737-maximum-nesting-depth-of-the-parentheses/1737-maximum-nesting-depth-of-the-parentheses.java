class Solution {
    public int maxDepth(String s) {
        int dep = 0;
        int maxdep = 0;
        for(char a:s.toCharArray()){
            if(a=='('){
                dep++;
                maxdep=Math.max(maxdep,dep);
            }
            else if(a==')'){
                dep--;
            }
        }
        return maxdep;
    }
}