class Solution {
    public int largestAltitude(int[] gain) {
        int al=0;
        int maxi=0;
        for(int g:gain){
            al+=g;
            maxi=Math.max(al,maxi);
        }
        return maxi;
    }
}