class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sumTillNow = 0;
        int length = nums.length;
        for(int i = 0;i<length;++i){
            sumTillNow += nums[i];
            if(result < sumTillNow){
                result = sumTillNow;
            }
            if(sumTillNow < 0){
                sumTillNow = 0;
            }
        }
        return result;
    }
}