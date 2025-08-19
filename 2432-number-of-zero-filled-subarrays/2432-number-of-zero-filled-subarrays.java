class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,s=0;
        for(int n:nums){
            if(n==0){
                s+=1;
                count+=s;
            }
            else{
                s=0;
            }
        }
        return count;
    }
}