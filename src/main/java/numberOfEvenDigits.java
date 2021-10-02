class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(numberOfDigits(nums[i]) % 2 ==0) {
                count++ ;
            }
        }
        return count;
        
    }
    
    int numberOfDigits(int a){
        int digits =0;
        while(a!=0){
            a = a/10 ;
            digits ++ ;
     }
        return digits;
    }
    
}
