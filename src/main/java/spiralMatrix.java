class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        if(matrix.length ==0) return ans;
        
        int rowBegin =0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            
            // first row
            for(int i=colBegin;i<=colEnd;i++) {
                ans.add(matrix[rowBegin][i]);
            }
            
            rowBegin++;
            
            //last column
            
            for(int i=rowBegin;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
            }
            
            colEnd--;
            
            // last row
            //check
            if(rowBegin <= rowEnd) {
                for(int i=colEnd;i>=colBegin;i--){
                    ans.add(matrix[rowEnd][i]);
                }
            }
            
            rowEnd--;
            
            // first column
             if(colBegin <= colEnd) {
                 for(int i=rowEnd;i>=rowBegin;i--) {
                     ans.add(matrix[i][colBegin]);
                 }
             }   
            
            colBegin++;
            
        }
        return ans;
    }
}
