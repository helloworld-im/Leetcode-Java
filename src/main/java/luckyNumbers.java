class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
         List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<matrix.length;i++) {
            
            int min = Integer.MAX_VALUE;
            int minIndex =0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            
            int max=Integer.MIN_VALUE;
            for(int k=0;k<matrix.length;k++) {
                if(matrix[k][minIndex] > max) {
                    max = matrix[k][minIndex];
                }
            }
            
            if(min==max) {
                ans.add(min);
            }  
        }
        return ans;
    }
}
