class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] result = new int[n+1];
        for(int i=2;i<=n;i++){
            result[i]=Math.min(result[i-1]+cost[i-1],result[i-2]+cost[i-2]);
        }
        return result[n];
    }
}