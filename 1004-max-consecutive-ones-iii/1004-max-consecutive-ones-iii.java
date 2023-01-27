class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int count = 0;
        int currlen = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] == 0){
                count++;
            }
            if(count<=k){
                currlen = right-left+1;
            }
            
            while(count>k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
            
            max = Math.max(max,currlen);
        }
        return max;
    }
}