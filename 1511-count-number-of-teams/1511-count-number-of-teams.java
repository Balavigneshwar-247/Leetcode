class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int result=0;

        for(int i=0;i<n;i++){
            int ls=0;int lg=0;
            int rs=0;int rg=0;

            for(int j=0;j<i;j++){
                if(rating[j]<rating[i]) ls++;
                else if(rating[j]>rating[i]) lg++;
            }
            for(int k=i+1;k<n;k++){
                if(rating[k]<rating[i]) rs++;
                else if(rating[k]>rating[i]) rg++;
            }
            result+=ls*rg;
            result+=lg*rs;
        }
        return result;
    }
}