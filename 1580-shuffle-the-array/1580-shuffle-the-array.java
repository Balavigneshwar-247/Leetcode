class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] suf = new int[2*n];
        for(int i=0;i<n;i++){
            suf[2*i] = nums[i];
            suf[2*i+1] = nums[i+n];
        }
        return suf;
    }
}