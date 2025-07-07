class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); //get in des order
        for(int num:nums){
            set.add(num);  //val added in set
        }
        if (set.size()<3) {
            return set.first(); //max will return
        }
        set.pollFirst(); //remove first max value
        set.pollFirst(); //remove second max value
        return set.first(); //third max value
    }
}