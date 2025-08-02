class Solution {
    public int maximumWealth(int[][] accounts) {
        int mw = 0;
        for(int[] c:accounts){
            int sum =0;
            for(int b:c){
                sum+=b;
            }
            mw=Math.max(mw,sum);
        }
        return mw;
    }
}