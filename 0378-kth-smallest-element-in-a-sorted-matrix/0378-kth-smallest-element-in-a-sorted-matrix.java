class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0];
        int hi = matrix[n-1][n-1];
        
        while(lo<hi){
            int mid = lo - (lo-hi)/2;
            
            int count = 0;
            for(int i = 0;i<n;i++){
                int j = n-1;
                while(j>=0 && matrix[i][j]>mid){
                    j--;
                }
                count += (j+1);
            }
            
            if(count < k){
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
}