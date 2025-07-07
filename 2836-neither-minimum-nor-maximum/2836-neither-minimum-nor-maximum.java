class Solution {
    public int findNonMinOrMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        for(int n:nums){
            set.add(n);
        }
        if(set.size()<3) return -1;
        set.pollFirst();
        set.pollLast();
        
        return set.first();
    }
}