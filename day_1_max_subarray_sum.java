class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int cur_sum=0;
        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<nums.length;i++){
            cur_sum=cur_sum+nums[i];
            if(cur_sum>max_sum){
                max_sum=cur_sum;
            }
            if(cur_sum<0){
                cur_sum=0;
            }
        }
        return max_sum;
    }
}