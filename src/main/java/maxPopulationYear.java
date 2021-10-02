class Solution {
    public int maximumPopulation(int[][] logs) {
        int start,end;
        int[] years = new int[2051];
        
        for(int i=0;i<logs.length;i++) {
            start = logs[i][0];
            end = logs[i][1];
            for(int j=start;j<end;j++){
                years[j]++;
            }
        }
        int max=0;
        int ans = 0;
        for(int i=1950;i<=2050;i++){
            if(max<years[i]){
                max = years[i];
                ans = i;
        }
        }
        return ans;
    }
}
