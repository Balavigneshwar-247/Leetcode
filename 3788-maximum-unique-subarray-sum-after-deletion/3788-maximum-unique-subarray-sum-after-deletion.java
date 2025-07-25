class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            maxi = Math.max(maxi, num);
        }
        if (maxi <= 0) return maxi;
        
        for(int n:nums){
            if(n>0 && list.add(n)){
                sum+=n;
            }
        }
        return sum;
    }
}