class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right = 0;
        for(int i = 0; i < nums.length; i++){
            right += nums[i];
        }

        int left = 0;
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            right -= nums[i];
            ret[i] = Math.abs(left - right);
            left += nums[i];
        }

        return ret;
    }
}
